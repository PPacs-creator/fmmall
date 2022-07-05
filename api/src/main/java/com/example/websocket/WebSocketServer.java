package com.example.websocket;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import javax.websocket.OnClose;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

@Component
@ServerEndpoint("/webSocket/{oid}")
public class WebSocketServer {
    private static ConcurrentHashMap <String,Session > sessionMap=new ConcurrentHashMap<>() ;
    //前端请求建立webSocket连接，就会执行@OnOpen方法
    @OnOpen
    public void open(@PathParam("oid") String orderId, Session session){
        System.out.println("-------------建立连接:"+orderId);
        sessionMap.put(orderId ,session);

    }

    //前端关闭页面或者主动关闭websocket连接，都会执行close
    @OnClose
    public void close(@PathParam("oid") String orderId){
        sessionMap .remove(orderId) ;
    }

    public static void sendMsg(String orderId,String msg) {
         try {
            Session session = sessionMap .get(orderId );

            session.getBasicRemote() .sendText(msg) ;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
