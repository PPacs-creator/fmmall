package com.example.fmmall.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

public class Orderitem {
    public Orderitem(String itemid, String orderid, String productid, String productname, String productimg, String skuid, String skuname, BigDecimal productprice, Integer buycounts, BigDecimal totalamount, Date basketdate, Date buytime, Integer iscomment) {
        this.itemid = itemid;
        this.orderid = orderid;
        this.productid = productid;
        this.productname = productname;
        this.productimg = productimg;
        this.skuid = skuid;
        this.skuname = skuname;
        this.productprice = productprice;
        this.buycounts = buycounts;
        this.totalamount = totalamount;
        this.basketdate = basketdate;
        this.buytime = buytime;
        this.iscomment = iscomment;
    }

    /**
     * 订单项ID
     */
    @Id
    @Column(name = "itemId")
    private String itemid;

    /**
     * 订单ID
     */
    @Column(name = "orderId")
    private String orderid;

    /**
     * 商品ID
     */
    @Column(name = "productId")
    private String productid;

    /**
     * 商品名称
     */
    @Column(name = "productName")
    private String productname;

    /**
     * 商品图片
     */
    @Column(name = "productImg")
    private String productimg;

    /**
     * skuID
     */
    @Column(name = "skuId")
    private String skuid;

    /**
     * sku名称
     */
    @Column(name = "skuName")
    private String skuname;

    /**
     * 商品价格
     */
    @Column(name = "productPrice")
    private BigDecimal productprice;

    /**
     * 购买数量
     */
    @Column(name = "buyCounts")
    private Integer buycounts;

    /**
     * 商品总金额
     */
    @Column(name = "totalAmount")
    private BigDecimal totalamount;

    /**
     * 加入购物车时间
     */
    @Column(name = "basketDate")
    private Date basketdate;

    /**
     * 购买时间
     */
    @Column(name = "buyTime")
    private Date buytime;

    /**
     * 评论状态： 0 未评价  1 已评价
     */
    @Column(name = "isComment")
    private Integer iscomment;

    /**
     * 获取订单项ID
     *
     * @return itemId - 订单项ID
     */
    public String getItemid() {
        return itemid;
    }

    /**
     * 设置订单项ID
     *
     * @param itemid 订单项ID
     */
    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    /**
     * 获取订单ID
     *
     * @return orderId - 订单ID
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * 设置订单ID
     *
     * @param orderid 订单ID
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid;
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
     * 获取商品名称
     *
     * @return productName - 商品名称
     */
    public String getProductname() {
        return productname;
    }

    /**
     * 设置商品名称
     *
     * @param productname 商品名称
     */
    public void setProductname(String productname) {
        this.productname = productname;
    }

    /**
     * 获取商品图片
     *
     * @return productImg - 商品图片
     */
    public String getProductimg() {
        return productimg;
    }

    /**
     * 设置商品图片
     *
     * @param productimg 商品图片
     */
    public void setProductimg(String productimg) {
        this.productimg = productimg;
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
     * 获取sku名称
     *
     * @return skuName - sku名称
     */
    public String getSkuname() {
        return skuname;
    }

    /**
     * 设置sku名称
     *
     * @param skuname sku名称
     */
    public void setSkuname(String skuname) {
        this.skuname = skuname;
    }

    /**
     * 获取商品价格
     *
     * @return productPrice - 商品价格
     */
    public BigDecimal getProductprice() {
        return productprice;
    }

    /**
     * 设置商品价格
     *
     * @param productprice 商品价格
     */
    public void setProductprice(BigDecimal productprice) {
        this.productprice = productprice;
    }

    /**
     * 获取购买数量
     *
     * @return buyCounts - 购买数量
     */
    public Integer getBuycounts() {
        return buycounts;
    }

    /**
     * 设置购买数量
     *
     * @param buycounts 购买数量
     */
    public void setBuycounts(Integer buycounts) {
        this.buycounts = buycounts;
    }

    /**
     * 获取商品总金额
     *
     * @return totalAmount - 商品总金额
     */
    public BigDecimal getTotalamount() {
        return totalamount;
    }

    /**
     * 设置商品总金额
     *
     * @param totalamount 商品总金额
     */
    public void setTotalamount(BigDecimal totalamount) {
        this.totalamount = totalamount;
    }

    /**
     * 获取加入购物车时间
     *
     * @return basketDate - 加入购物车时间
     */
    public Date getBasketdate() {
        return basketdate;
    }

    /**
     * 设置加入购物车时间
     *
     * @param basketdate 加入购物车时间
     */
    public void setBasketdate(Date basketdate) {
        this.basketdate = basketdate;
    }

    /**
     * 获取购买时间
     *
     * @return buyTime - 购买时间
     */
    public Date getBuytime() {
        return buytime;
    }

    /**
     * 设置购买时间
     *
     * @param buytime 购买时间
     */
    public void setBuytime(Date buytime) {
        this.buytime = buytime;
    }

    /**
     * 获取评论状态： 0 未评价  1 已评价
     *
     * @return isComment - 评论状态： 0 未评价  1 已评价
     */
    public Integer getIscomment() {
        return iscomment;
    }

    /**
     * 设置评论状态： 0 未评价  1 已评价
     *
     * @param iscomment 评论状态： 0 未评价  1 已评价
     */
    public void setIscomment(Integer iscomment) {
        this.iscomment = iscomment;
    }
}