package com.example;

import com.example.fmmall.dao.CategoryMapper;
import com.example.fmmall.dao.ProductMapper;
import com.example.fmmall.dao.ShoppingcartMapper;
import com.example.fmmall.entity.Category;
import com.example.fmmall.entity.CategoryVO;
import com.example.fmmall.entity.ProductVO;
import com.example.fmmall.entity.ShoppingcartVO;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes =ApiApplication.class)
class ApiApplicationTests {
@Autowired
    private ProductMapper productMapper ;
@Autowired
private CategoryMapper categoryMapper ;
@Autowired
private ShoppingcartMapper shoppingcartMapper ;
@Test
public void testRecommend(){
    List<ProductVO> productVOS =productMapper .selectRecommendProducts() ;
    for(ProductVO p:productVOS ){
        System.out.println(p);
    }
}
@Test
public void testSelectFirstLevel(){
    List<CategoryVO> categoryVOS  =categoryMapper .selectFirstLevelCategories() ;
    for(CategoryVO c:categoryVOS ){
        System.out.println(c);
    }
}
@Test
    public void testShopCart(){
//    List<Integer> cids=new ArrayList<>() ;
//    cids.add(5);
//    cids.add(8);
//    cids.add(10) ;
//    List<ShoppingcartVO> shoppingcartVOS =shoppingcartMapper .selectShopcartByCids(cids) ;
//    System.out.println(shoppingcartVOS );
     String cids="5,8";
    String[] arr = cids.split(",");
    List<Integer> cidsList=new ArrayList<>() ;
    for(int i=0;i<arr.length;i++){
        cidsList .add(Integer.parseInt(arr[i]) ) ;
    }

    List<ShoppingcartVO> list = shoppingcartMapper.selectShopcartByCids(cidsList);
    for(ShoppingcartVO sc:list){
        System .out .println(sc) ;
    }
}

}
