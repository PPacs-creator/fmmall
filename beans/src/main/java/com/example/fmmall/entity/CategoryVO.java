package com.example.fmmall.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor

@ToString
public class CategoryVO {
    private Integer categoryid;
    private String categoryname;
    private Integer categorylevel;
    private Integer parentid;
    private String categoryicon;
    private String categoryslogan;
    private String categorypic;
    private String categorybgcolor;
    //实现首页的类别显示
    private List<CategoryVO> categories;
    //实现首页分类商品推荐
    private List<ProductVO> products;
}
