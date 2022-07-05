package com.example.fmmall.service.Impl;

import com.example.fmmall.dao.ShoppingcartMapper;
import com.example.fmmall.entity.Shoppingcart;
import com.example.fmmall.entity.ShoppingcartVO;
import com.example.fmmall.service.ShoppingCartService;
import com.example.fmmall.vo.ResStatus;
import com.example.fmmall.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService  {
    @Autowired
    private ShoppingcartMapper shoppingcartMapper ;
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    @Override
    public ResultVO addShoppingCart(Shoppingcart cart) {
        cart.setCarttime(sdf.format(new Date()));
       int i= shoppingcartMapper .insert(cart) ;
       if(i>0){
           return new ResultVO(ResStatus.OK,"success",null) ;
       }else{
           return new ResultVO(ResStatus.NO,"fail",null) ;
       }
    }

    @Override

    @Transactional(propagation = Propagation.SUPPORTS)
    public ResultVO listShoppingCartsByUserId(int userId) {
        List<ShoppingcartVO> list = shoppingcartMapper.selectShopcartByUserId(userId);
        ResultVO resultVO = new ResultVO(ResStatus.OK, "success", list);
        return resultVO;
    }

    @Override
    public ResultVO updateCartNum(int cartId, int cartNum) {
       int i= shoppingcartMapper .updateCartnumByByCartid(cartId,cartNum) ;
       if(i>0) {
           return new ResultVO(ResStatus.OK,"update success",null);
       }else{
           return new ResultVO(ResStatus.NO,"update fail",null) ;
       }
    }

    @Override
    public ResultVO listShoppingCartsByCids(String cids) {
        String[] arr=cids.split(",");
        List<Integer> cartIds = new ArrayList<>();
        for (int i=0; i<arr.length; i++){
            cartIds.add(Integer.parseInt(arr[i]));
        }
        List<ShoppingcartVO> list = shoppingcartMapper.selectShopcartByCids(cartIds);
        ResultVO resultVO = new ResultVO(ResStatus.OK, "success", list);
        return resultVO;


    }
}
