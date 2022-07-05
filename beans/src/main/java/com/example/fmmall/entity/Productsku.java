package com.example.fmmall.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

public class Productsku {
    /**
     * sku编号
     */
    @Id
    @Column(name = "skuId")
    private String skuid;

    /**
     * 商品id
     */
    @Column(name = "productId")
    private String productid;

    /**
     * sku名称
     */
    @Column(name = "skuName")
    private String skuname;

    /**
     * sku图片
     */
    @Column(name = "skuImg")
    private String skuimg;

    /**
     * 属性组合（格式是p1:v1;p2:v2）
     */
    private String untitled;

    /**
     * 原价
     */
    @Column(name = "originalPrice")
    private Integer originalprice;

    /**
     * 销售价格
     */
    @Column(name = "sellPrice")
    private Integer sellprice;

    /**
     * 折扣力度
     */
    private BigDecimal discounts;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 创建时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 更新时间
     */
    @Column(name = "updateTime")
    private Date updatetime;

    /**
     * sku状态(1启用，0禁用，-1删除)
     */
    private Integer status;

    /**
     * 获取sku编号
     *
     * @return skuId - sku编号
     */
    public String getSkuid() {
        return skuid;
    }

    /**
     * 设置sku编号
     *
     * @param skuid sku编号
     */
    public void setSkuid(String skuid) {
        this.skuid = skuid;
    }

    /**
     * 获取商品id
     *
     * @return productId - 商品id
     */
    public String getProductid() {
        return productid;
    }

    /**
     * 设置商品id
     *
     * @param productid 商品id
     */
    public void setProductid(String productid) {
        this.productid = productid;
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
     * 获取sku图片
     *
     * @return skuImg - sku图片
     */
    public String getSkuimg() {
        return skuimg;
    }

    /**
     * 设置sku图片
     *
     * @param skuimg sku图片
     */
    public void setSkuimg(String skuimg) {
        this.skuimg = skuimg;
    }

    /**
     * 获取属性组合（格式是p1:v1;p2:v2）
     *
     * @return untitled - 属性组合（格式是p1:v1;p2:v2）
     */
    public String getUntitled() {
        return untitled;
    }

    /**
     * 设置属性组合（格式是p1:v1;p2:v2）
     *
     * @param untitled 属性组合（格式是p1:v1;p2:v2）
     */
    public void setUntitled(String untitled) {
        this.untitled = untitled;
    }

    /**
     * 获取原价
     *
     * @return originalPrice - 原价
     */
    public Integer getOriginalprice() {
        return originalprice;
    }

    /**
     * 设置原价
     *
     * @param originalprice 原价
     */
    public void setOriginalprice(Integer originalprice) {
        this.originalprice = originalprice;
    }

    /**
     * 获取销售价格
     *
     * @return sellPrice - 销售价格
     */
    public Integer getSellprice() {
        return sellprice;
    }

    /**
     * 设置销售价格
     *
     * @param sellprice 销售价格
     */
    public void setSellprice(Integer sellprice) {
        this.sellprice = sellprice;
    }

    /**
     * 获取折扣力度
     *
     * @return discounts - 折扣力度
     */
    public BigDecimal getDiscounts() {
        return discounts;
    }

    /**
     * 设置折扣力度
     *
     * @param discounts 折扣力度
     */
    public void setDiscounts(BigDecimal discounts) {
        this.discounts = discounts;
    }

    /**
     * 获取库存
     *
     * @return stock - 库存
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 设置库存
     *
     * @param stock 库存
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * 获取创建时间
     *
     * @return createTime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取更新时间
     *
     * @return updateTime - 更新时间
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 设置更新时间
     *
     * @param updatetime 更新时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * 获取sku状态(1启用，0禁用，-1删除)
     *
     * @return status - sku状态(1启用，0禁用，-1删除)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置sku状态(1启用，0禁用，-1删除)
     *
     * @param status sku状态(1启用，0禁用，-1删除)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}