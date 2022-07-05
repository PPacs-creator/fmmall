package com.example.fmmall.service.Impl;

import com.example.fmmall.dao.IndeximgMapper;
import com.example.fmmall.entity.Indeximg;
import com.example.fmmall.service.IndexImgService;
import com.example.fmmall.vo.ResStatus;
import com.example.fmmall.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexImgServiceImpl implements IndexImgService  {
    @Autowired
    private IndeximgMapper indeximgMapper ;
    @Override
    public ResultVO listIndexImgs() {
        List<Indeximg> indexImgs=indeximgMapper .listIndexImgs();
        if(indexImgs.size()==0){
            return new ResultVO(ResStatus.NO,"fail",null);

        }else{
            return new ResultVO(ResStatus.OK,"success",indexImgs);
        }
    }
}
