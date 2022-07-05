package com.example.fmmall.service.Impl;

import com.example.fmmall.dao.ProductMapper;
import com.example.fmmall.dao.ProductimgMapper;
import com.example.fmmall.dao.ProductskuMapper;
import com.example.fmmall.entity.Product;
import com.example.fmmall.entity.ProductVO;
import com.example.fmmall.entity.Productimg;
import com.example.fmmall.entity.Productsku;
import com.example.fmmall.service.ProductService;
import com.example.fmmall.vo.ResStatus;
import com.example.fmmall.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.HashMap;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService  {
    @Autowired
    private ProductMapper productMapper ;
    @Autowired
    private ProductimgMapper productimgMapper ;
    @Autowired
    private ProductskuMapper productskuMapper ;

    @Override
    public ResultVO listRecommendProducts() {
        List<ProductVO> productVOS =productMapper.selectRecommendProducts();
       ResultVO resultVO =new ResultVO(ResStatus.OK,"success",productVOS );
       return resultVO ;

    }
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public ResultVO getProductBasicInfo(String productId) {
        //1.商品基本信息
        Example example=new Example(Product.class) ;
        Example.Criteria criteria= example.createCriteria();
        criteria.andEqualTo("productid",productId);

        criteria .andEqualTo("productstatus",1);//状态为1表示上架商品
        List<Product> products=productMapper .selectByExample(example) ;

        if(products.size()>0){
            //2.商品图片
           Example example1 =new Example(Productimg.class);
          Example.Criteria criteria1 =example1 .createCriteria() ;
          criteria1 .andEqualTo("itemid",productId) ;
         List<Productimg> productimgs =productimgMapper .selectByExample(example1 ) ;

            //3.商品套餐

            Example example2 =new Example(Productsku.class);
            Example .Criteria criteria2 =example2 .createCriteria() ;
            criteria2 .andEqualTo("productid",productId) ;
            criteria2 .andEqualTo("status",1) ;

            List<Productsku> productskus =productskuMapper .selectByExample(example2) ;

            HashMap<String,Object> basicInfo=new HashMap<>() ;

            basicInfo .put("product",products.get(0));
            basicInfo.put("productimgs",productimgs);
            basicInfo .put("productskus",productskus );

            return new ResultVO(ResStatus.OK,"success",basicInfo) ;
        }else{
            return new ResultVO(ResStatus.NO,"查询商品不存在",null) ;
        }


    }
}
