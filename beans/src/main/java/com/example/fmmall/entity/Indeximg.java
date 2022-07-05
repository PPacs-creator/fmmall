package com.example.fmmall.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Indeximg {
    /**
     * 主键
     */
    @Id
    @Column(name = "imgId")
    private String imgid;

    /**
     * 图片 图片地址
     */
    @Column(name = "imgUrl")
    private String imgurl;

    /**
     * 背景色 背景颜色
     */
    @Column(name = "imgBgcolor")
    private String imgbgcolor;

    /**
     * 商品id 商品id
     */
    @Column(name = "prodId")
    private String prodid;

    /**
     * 商品分类id 商品分类id
     */
    @Column(name = "categoryId")
    private String categoryid;

    /**
     * 轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类
     */
    @Column(name = "indexType")
    private Integer indextype;

    /**
     * 轮播图展示顺序 轮播图展示顺序，从小到大
     */
    private Integer seq;

    /**
     * 是否展示:1表示正常显示，0表示下线 是否展示，1：展示    0：不展示
     */
    private Integer status;

    /**
     * 创建时间 创建时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 更新时间 更新
     */
    @Column(name = "updateTime")
    private Date updatetime;

    /**
     * 获取主键
     *
     * @return imgId - 主键
     */
    public String getImgid() {
        return imgid;
    }

    /**
     * 设置主键
     *
     * @param imgid 主键
     */
    public void setImgid(String imgid) {
        this.imgid = imgid;
    }

    /**
     * 获取图片 图片地址
     *
     * @return imgUrl - 图片 图片地址
     */
    public String getImgurl() {
        return imgurl;
    }

    /**
     * 设置图片 图片地址
     *
     * @param imgurl 图片 图片地址
     */
    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    /**
     * 获取背景色 背景颜色
     *
     * @return imgBgcolor - 背景色 背景颜色
     */
    public String getImgbgcolor() {
        return imgbgcolor;
    }

    /**
     * 设置背景色 背景颜色
     *
     * @param imgbgcolor 背景色 背景颜色
     */
    public void setImgbgcolor(String imgbgcolor) {
        this.imgbgcolor = imgbgcolor;
    }

    /**
     * 获取商品id 商品id
     *
     * @return prodId - 商品id 商品id
     */
    public String getProdid() {
        return prodid;
    }

    /**
     * 设置商品id 商品id
     *
     * @param prodid 商品id 商品id
     */
    public void setProdid(String prodid) {
        this.prodid = prodid;
    }

    /**
     * 获取商品分类id 商品分类id
     *
     * @return categoryId - 商品分类id 商品分类id
     */
    public String getCategoryid() {
        return categoryid;
    }

    /**
     * 设置商品分类id 商品分类id
     *
     * @param categoryid 商品分类id 商品分类id
     */
    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }

    /**
     * 获取轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类
     *
     * @return indexType - 轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类
     */
    public Integer getIndextype() {
        return indextype;
    }

    /**
     * 设置轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类
     *
     * @param indextype 轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类
     */
    public void setIndextype(Integer indextype) {
        this.indextype = indextype;
    }

    /**
     * 获取轮播图展示顺序 轮播图展示顺序，从小到大
     *
     * @return seq - 轮播图展示顺序 轮播图展示顺序，从小到大
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * 设置轮播图展示顺序 轮播图展示顺序，从小到大
     *
     * @param seq 轮播图展示顺序 轮播图展示顺序，从小到大
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * 获取是否展示:1表示正常显示，0表示下线 是否展示，1：展示    0：不展示
     *
     * @return status - 是否展示:1表示正常显示，0表示下线 是否展示，1：展示    0：不展示
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置是否展示:1表示正常显示，0表示下线 是否展示，1：展示    0：不展示
     *
     * @param status 是否展示:1表示正常显示，0表示下线 是否展示，1：展示    0：不展示
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取创建时间 创建时间
     *
     * @return createTime - 创建时间 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间 创建时间
     *
     * @param createtime 创建时间 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取更新时间 更新
     *
     * @return updateTime - 更新时间 更新
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 设置更新时间 更新
     *
     * @param updatetime 更新时间 更新
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}