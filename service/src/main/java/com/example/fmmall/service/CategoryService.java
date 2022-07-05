package com.example.fmmall.service;

import com.example.fmmall.vo.ResultVO;
import org.springframework.stereotype.Service;


public interface CategoryService {
    public ResultVO listCategories();

    public ResultVO listFirstLevelCategories();
}
