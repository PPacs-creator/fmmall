package com.example.controller;

import com.example.fmmall.service.OrderService;
import com.example.websocket.WebSocketServer;
import com.github.wxpay.sdk.WXPayUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.Servlet;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping ("/pay")
public class PayController {
    @Autowired
    private OrderService orderService ;

    @RequestMapping ("/callback")
    public String paySuccess(HttpServletRequest request) throws Exception {
        System.out.println("callback");

        ServletInputStream is= request.getInputStream();
        byte[] bs=new byte [1024];
        int len=-1;
        StringBuilder builder=new StringBuilder();
        while((len= is.read(bs))!=-1){
            builder .append(new String(bs,0,len)) ;
        }
        String s = builder.toString();

        Map<String,String> map= WXPayUtil.xmlToMap(s);

        if(map!=null&&"success".equalsIgnoreCase(map.get("result_code"))){
            //支付成功
            //修改订单状态“已发货”
            String orderId=map.get("out_trade_no");
            int i = orderService.updateOrderStatus(orderId, "2");
            System.out.println("orderId:"+orderId);

            //通过websocket连接向前端推送消息
             WebSocketServer .sendMsg(orderId,"1") ;
            //响应微信支付平台
            if(i>0) {
                HashMap<String, String> resp = new HashMap<>();
                resp.put("return_code", "success");
                resp.put("return_msg", "OK");
                resp.put("appid", map.get("appid"));
                resp.put("result_code", "success");

                String s1 = WXPayUtil.mapToXml(resp);
                return s1;
            }else{
                return null;
            }
        }
            //支付失败
            return null;




    }
}
