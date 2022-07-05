package com.example.fmmall.service.Impl;

import com.example.fmmall.dao.CategoryMapper;
import com.example.fmmall.entity.CategoryVO;
import com.example.fmmall.service.CategoryService;
import com.example.fmmall.vo.ResStatus;
import com.example.fmmall.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {


    @Autowired
    private CategoryMapper categoryMapper ;
    //查询分类列表
    @Override
    public ResultVO listCategories() {
        List<CategoryVO> categoryVOList =categoryMapper.selectAllCategories() ;
        ResultVO resultVO =new ResultVO(ResStatus.OK,"success",categoryVOList);
        return resultVO ;
    }
    //查询一级同时查询一级分类下销量最高的商品
    @Override
    public ResultVO listFirstLevelCategories() {
        List<CategoryVO> categoryVOS=categoryMapper .selectFirstLevelCategories() ;
        ResultVO resultVO =new ResultVO(ResStatus.OK,"success",categoryVOS);
        return resultVO ;

    }
}
