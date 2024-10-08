package com.example.controller;

import com.example.fmmall.service.ProductService;
import com.example.fmmall.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping ("/product")
@Api(value="提供商品信息相关的接口",tags="商品管理")
public class ProductController {
    @Autowired
    private ProductService productService ;
    @ApiOperation("商品基本信息查询接口")
    @GetMapping ("/detail-info/{pid}")
    public ResultVO getProductBasicInfo(@PathVariable ("pid") String pid){
        return productService.getProductBasicInfo(pid);

    }

    public void test(){
       System.out.println("aa");
    }
    //删除


    public void test2(){
        System.out.println("bbb");
    }
}
