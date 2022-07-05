package com.example.controller;

import com.example.config.MyPayConfig;
import com.example.fmmall.entity.Orders;
import com.example.fmmall.service.OrderService;
import com.example.fmmall.vo.ResStatus;
import com.example.fmmall.vo.ResultVO;
import com.github.wxpay.sdk.WXPay;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping ("/order")
@Api(value="提供订单相关的操作接口",tags="订单管理")
public class OrderController {
    @Autowired
    private OrderService orderService ;
    @PostMapping ("/add")
    public ResultVO add(String cids,@RequestBody  Orders orders) {
        ResultVO resultVO = null;
        try {
         Map<String,String>  orderInfo= orderService.addOrder(cids,orders);
         String orderId=orderInfo .get("orderId");
           //申请支付链接
         if(orderId!=null) {
             HashMap<String, String> data = new HashMap<>();
             data.put("body", orderInfo .get("productNames"));
             data.put("out_trade_no", orderId);
             data.put("fee_type", "CNY");
             data.put("total_fee","1");
             data.put("trade_type", "NATIVE");
             data.put("notify_url", "http://peng.free.idcfengye.com/pay/callback");

             WXPay wxPay = new WXPay(new MyPayConfig());
             Map<String, String> resp = wxPay.unifiedOrder(data);
             orderInfo .put("payUrl",resp.get("code_url"));
             resultVO = new ResultVO(ResStatus.OK,"提交订单成功！",orderInfo);
         }else{
             resultVO = new ResultVO(ResStatus.NO,"提交订单失败！",null);
         }
        } catch (SQLException e) {
            resultVO = new ResultVO(ResStatus.NO,"提交订单失败！",null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultVO;
    }


    @GetMapping ("/status/{oid}")
    public ResultVO getOrderStatus(@PathVariable ("oid")String orderId,@RequestHeader ("token")String token){
        ResultVO orderById = orderService.getOrderById(orderId);
        return orderById ;
    }
}
