package com.example.fmmall.dao;

import com.example.fmmall.entity.Shoppingcart;
import com.example.fmmall.entity.ShoppingcartVO;
import com.example.fmmall.general.GeneralDAO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoppingcartMapper extends GeneralDAO<Shoppingcart> {
    public List<ShoppingcartVO> selectShopcartByUserId(int userId);

    public int updateCartnumByByCartid(@Param("cartId") int cartId,@Param("cartNum")int cartNum);

    public List<ShoppingcartVO> selectShopcartByCids(List<Integer> cids);



}