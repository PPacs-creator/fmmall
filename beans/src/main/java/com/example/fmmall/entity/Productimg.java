package com.example.fmmall.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Productimg {
    @Override
    public String toString() {
        return "Productimg{" +
                "id='" + id + '\'' +
                ", itemid='" + itemid + '\'' +
                ", url='" + url + '\'' +
                ", sort=" + sort +
                ", ismain=" + ismain +
                ", createdtime=" + createdtime +
                ", updatedtime=" + updatedtime +
                '}';
    }

    /**
     * 图片主键
     */
    @Id
    private String id;

    /**
     * 商品外键id 商品外键id
     */
    @Column(name = "itemId")
    private String itemid;

    /**
     * 图片地址 图片地址
     */
    private String url;

    /**
     * 顺序 图片顺序，从小到大
     */
    private Integer sort;

    /**
     * 是否主图 是否主图，1：是，0：否
     */
    @Column(name = "isMain")
    private Integer ismain;

    /**
     * 创建时间
     */
    @Column(name = "createdTime")
    private Date createdtime;

    /**
     * 更新时间
     */
    @Column(name = "updatedTime")
    private Date updatedtime;

    /**
     * 获取图片主键
     *
     * @return id - 图片主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置图片主键
     *
     * @param id 图片主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取商品外键id 商品外键id
     *
     * @return itemId - 商品外键id 商品外键id
     */
    public String getItemid() {
        return itemid;
    }

    /**
     * 设置商品外键id 商品外键id
     *
     * @param itemid 商品外键id 商品外键id
     */
    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    /**
     * 获取图片地址 图片地址
     *
     * @return url - 图片地址 图片地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置图片地址 图片地址
     *
     * @param url 图片地址 图片地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取顺序 图片顺序，从小到大
     *
     * @return sort - 顺序 图片顺序，从小到大
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置顺序 图片顺序，从小到大
     *
     * @param sort 顺序 图片顺序，从小到大
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取是否主图 是否主图，1：是，0：否
     *
     * @return isMain - 是否主图 是否主图，1：是，0：否
     */
    public Integer getIsmain() {
        return ismain;
    }

    /**
     * 设置是否主图 是否主图，1：是，0：否
     *
     * @param ismain 是否主图 是否主图，1：是，0：否
     */
    public void setIsmain(Integer ismain) {
        this.ismain = ismain;
    }

    /**
     * 获取创建时间
     *
     * @return createdTime - 创建时间
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * 设置创建时间
     *
     * @param createdtime 创建时间
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * 获取更新时间
     *
     * @return updatedTime - 更新时间
     */
    public Date getUpdatedtime() {
        return updatedtime;
    }

    /**
     * 设置更新时间
     *
     * @param updatedtime 更新时间
     */
    public void setUpdatedtime(Date updatedtime) {
        this.updatedtime = updatedtime;
    }
}