package com.example.fmmall.service;

import com.example.fmmall.entity.Orders;
import com.example.fmmall.vo.ResultVO;

import java.sql.SQLException;
import java.util.Map;

public interface OrderService {
    public Map<String,String> addOrder(String cids, Orders order)throws SQLException ;

    public int updateOrderStatus(String orderId,String status);

    public ResultVO getOrderById(String orderId);


}
