package com.example.fmmall.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigDecimal;

public class Shoppingcart {
    /**
     * 主键
     */
    @Id
    @Column(name = "cartId")
    private Integer cartid;

    /**
     * 商品ID
     */
    @Column(name = "productId")
    private String productid;

    /**
     * skuID
     */
    @Column(name = "skuId")
    private String skuid;

    /**
     * 用户ID
     */
    @Column(name = "userId")
    private String userid;

    /**
     * 购物车商品数量
     */
    @Column(name = "cartNum")
    private String cartnum;

    /**
     * 添加购物车时间
     */
    @Column(name = "cartTime")
    private String carttime;

    /**
     * 添加购物车时商品价格
     */
    @Column(name = "productPrice")
    private BigDecimal productprice;

    /**
     * 选择的套餐的属性
     */
    @Column(name = "skuProps")
    private String skuprops;

    /**
     * 获取主键
     *
     * @return cartId - 主键
     */
    public Integer getCartid() {
        return cartid;
    }

    /**
     * 设置主键
     *
     * @param cartid 主键
     */
    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

    /**
     * 获取商品ID
     *
     * @return productId - 商品ID
     */
    public String getProductid() {
        return productid;
    }

    /**
     * 设置商品ID
     *
     * @param productid 商品ID
     */
    public void setProductid(String productid) {
        this.productid = productid;
    }

    /**
     * 获取skuID
     *
     * @return skuId - skuID
     */
    public String getSkuid() {
        return skuid;
    }

    /**
     * 设置skuID
     *
     * @param skuid skuID
     */
    public void setSkuid(String skuid) {
        this.skuid = skuid;
    }

    /**
     * 获取用户ID
     *
     * @return userId - 用户ID
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置用户ID
     *
     * @param userid 用户ID
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取购物车商品数量
     *
     * @return cartNum - 购物车商品数量
     */
    public String getCartnum() {
        return cartnum;
    }

    /**
     * 设置购物车商品数量
     *
     * @param cartnum 购物车商品数量
     */
    public void setCartnum(String cartnum) {
        this.cartnum = cartnum;
    }

    /**
     * 获取添加购物车时间
     *
     * @return cartTime - 添加购物车时间
     */
    public String getCarttime() {
        return carttime;
    }

    /**
     * 设置添加购物车时间
     *
     * @param carttime 添加购物车时间
     */
    public void setCarttime(String carttime) {
        this.carttime = carttime;
    }

    /**
     * 获取添加购物车时商品价格
     *
     * @return productPrice - 添加购物车时商品价格
     */
    public BigDecimal getProductprice() {
        return productprice;
    }

    /**
     * 设置添加购物车时商品价格
     *
     * @param productprice 添加购物车时商品价格
     */
    public void setProductprice(BigDecimal productprice) {
        this.productprice = productprice;
    }

    /**
     * 获取选择的套餐的属性
     *
     * @return skuProps - 选择的套餐的属性
     */
    public String getSkuprops() {
        return skuprops;
    }

    /**
     * 设置选择的套餐的属性
     *
     * @param skuprops 选择的套餐的属性
     */
    public void setSkuprops(String skuprops) {
        this.skuprops = skuprops;
    }
}