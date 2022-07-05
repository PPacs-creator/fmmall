package com.example.fmmall.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Productparams {
    /**
     * 商品参数id
     */
    @Id
    @Column(name = "paramId")
    private String paramid;

    /**
     * 商品id
     */
    @Column(name = "productId")
    private String productid;

    /**
     * 产地 产地，例：中国江苏
     */
    @Column(name = "productPlace")
    private String productplace;

    /**
     * 保质期 保质期，例：180天
     */
    @Column(name = "footPeriod")
    private String footperiod;

    /**
     * 品牌名 品牌名，例：三只大灰狼
     */
    private String brand;

    /**
     * 生产厂名 生产厂名，例：大灰狼工厂
     */
    @Column(name = "factoryName")
    private String factoryname;

    /**
     * 生产厂址 生产厂址，例：大灰狼生产基地
     */
    @Column(name = "factoryAddress")
    private String factoryaddress;

    /**
     * 包装方式 包装方式，例：袋装
     */
    @Column(name = "packagingMethod")
    private String packagingmethod;

    /**
     * 规格重量 规格重量，例：35g
     */
    private String weight;

    /**
     * 存储方法 存储方法，例：常温5~25°
     */
    @Column(name = "storageMethod")
    private String storagemethod;

    /**
     * 食用方式 食用方式，例：开袋即食
     */
    @Column(name = "eatMethod")
    private String eatmethod;

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
     * 获取商品参数id
     *
     * @return paramId - 商品参数id
     */
    public String getParamid() {
        return paramid;
    }

    /**
     * 设置商品参数id
     *
     * @param paramid 商品参数id
     */
    public void setParamid(String paramid) {
        this.paramid = paramid;
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
     * 获取产地 产地，例：中国江苏
     *
     * @return productPlace - 产地 产地，例：中国江苏
     */
    public String getProductplace() {
        return productplace;
    }

    /**
     * 设置产地 产地，例：中国江苏
     *
     * @param productplace 产地 产地，例：中国江苏
     */
    public void setProductplace(String productplace) {
        this.productplace = productplace;
    }

    /**
     * 获取保质期 保质期，例：180天
     *
     * @return footPeriod - 保质期 保质期，例：180天
     */
    public String getFootperiod() {
        return footperiod;
    }

    /**
     * 设置保质期 保质期，例：180天
     *
     * @param footperiod 保质期 保质期，例：180天
     */
    public void setFootperiod(String footperiod) {
        this.footperiod = footperiod;
    }

    /**
     * 获取品牌名 品牌名，例：三只大灰狼
     *
     * @return brand - 品牌名 品牌名，例：三只大灰狼
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置品牌名 品牌名，例：三只大灰狼
     *
     * @param brand 品牌名 品牌名，例：三只大灰狼
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取生产厂名 生产厂名，例：大灰狼工厂
     *
     * @return factoryName - 生产厂名 生产厂名，例：大灰狼工厂
     */
    public String getFactoryname() {
        return factoryname;
    }

    /**
     * 设置生产厂名 生产厂名，例：大灰狼工厂
     *
     * @param factoryname 生产厂名 生产厂名，例：大灰狼工厂
     */
    public void setFactoryname(String factoryname) {
        this.factoryname = factoryname;
    }

    /**
     * 获取生产厂址 生产厂址，例：大灰狼生产基地
     *
     * @return factoryAddress - 生产厂址 生产厂址，例：大灰狼生产基地
     */
    public String getFactoryaddress() {
        return factoryaddress;
    }

    /**
     * 设置生产厂址 生产厂址，例：大灰狼生产基地
     *
     * @param factoryaddress 生产厂址 生产厂址，例：大灰狼生产基地
     */
    public void setFactoryaddress(String factoryaddress) {
        this.factoryaddress = factoryaddress;
    }

    /**
     * 获取包装方式 包装方式，例：袋装
     *
     * @return packagingMethod - 包装方式 包装方式，例：袋装
     */
    public String getPackagingmethod() {
        return packagingmethod;
    }

    /**
     * 设置包装方式 包装方式，例：袋装
     *
     * @param packagingmethod 包装方式 包装方式，例：袋装
     */
    public void setPackagingmethod(String packagingmethod) {
        this.packagingmethod = packagingmethod;
    }

    /**
     * 获取规格重量 规格重量，例：35g
     *
     * @return weight - 规格重量 规格重量，例：35g
     */
    public String getWeight() {
        return weight;
    }

    /**
     * 设置规格重量 规格重量，例：35g
     *
     * @param weight 规格重量 规格重量，例：35g
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * 获取存储方法 存储方法，例：常温5~25°
     *
     * @return storageMethod - 存储方法 存储方法，例：常温5~25°
     */
    public String getStoragemethod() {
        return storagemethod;
    }

    /**
     * 设置存储方法 存储方法，例：常温5~25°
     *
     * @param storagemethod 存储方法 存储方法，例：常温5~25°
     */
    public void setStoragemethod(String storagemethod) {
        this.storagemethod = storagemethod;
    }

    /**
     * 获取食用方式 食用方式，例：开袋即食
     *
     * @return eatMethod - 食用方式 食用方式，例：开袋即食
     */
    public String getEatmethod() {
        return eatmethod;
    }

    /**
     * 设置食用方式 食用方式，例：开袋即食
     *
     * @param eatmethod 食用方式 食用方式，例：开袋即食
     */
    public void setEatmethod(String eatmethod) {
        this.eatmethod = eatmethod;
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
}