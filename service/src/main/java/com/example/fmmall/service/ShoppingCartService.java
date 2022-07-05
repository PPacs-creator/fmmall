package com.example.fmmall.service;

import com.example.fmmall.entity.Shoppingcart;
import com.example.fmmall.vo.ResultVO;

import java.util.List;

public interface ShoppingCartService {
    public ResultVO addShoppingCart(Shoppingcart cart);
    public ResultVO listShoppingCartsByUserId(int userId);
    public ResultVO updateCartNum(int cartId,int cartNum);
    public ResultVO listShoppingCartsByCids(String cids);
}
