package com.example.fmmall.dao;

import com.example.fmmall.entity.Product;
import com.example.fmmall.entity.ProductVO;
import com.example.fmmall.general.GeneralDAO;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductMapper extends GeneralDAO<Product> {
    public List<ProductVO> selectRecommendProducts();

    public List<ProductVO> selectTop6ByCategory(int cid);

}