package com.example.fmmall.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingcartVO {
    private Integer cartid;
    private String productid;
    private String skuid;
    private String userid;
    private String cartnum;
    private String carttime;
    private BigDecimal productprice;
    private String skuprops;

    private String productname;
    private String productimg;
    private double originalprice;
    private double sellprice;
    private String skuname;
    private int skustock;

}
