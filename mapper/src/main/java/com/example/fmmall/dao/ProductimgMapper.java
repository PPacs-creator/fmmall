package com.example.fmmall.dao;

import com.example.fmmall.entity.Productimg;
import com.example.fmmall.general.GeneralDAO;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductimgMapper extends GeneralDAO<Productimg> {
    public List<Productimg> selectProductImgByProductId(int productId);

}