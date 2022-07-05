package com.example.fmmall.dao;

import com.example.fmmall.entity.Indeximg;
import com.example.fmmall.general.GeneralDAO;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IndeximgMapper extends GeneralDAO<Indeximg> {
    //查询轮播图信息 查询status=1按照seq排序
    public List<Indeximg> listIndexImgs();


}
