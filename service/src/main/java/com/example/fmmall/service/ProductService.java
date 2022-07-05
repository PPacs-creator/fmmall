package com.example.fmmall.service;

import com.example.fmmall.vo.ResultVO;

public interface ProductService {
    public ResultVO listRecommendProducts();
    public ResultVO getProductBasicInfo(String productId);
}
