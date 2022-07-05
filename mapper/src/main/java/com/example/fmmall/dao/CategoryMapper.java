package com.example.fmmall.dao;

import com.example.fmmall.entity.Category;
import com.example.fmmall.entity.CategoryVO;
import com.example.fmmall.general.GeneralDAO;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoryMapper extends GeneralDAO<Category> {
    public List<CategoryVO> selectAllCategories();

    public List<CategoryVO> selectFirstLevelCategories();

}