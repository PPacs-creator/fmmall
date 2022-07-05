package com.example.fmmall.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

public class ProductVO {
    /**
     * 商品主键id
     */
    @Id
    @Column(name = "productId")
    private String productid;

    /**
     * 商品名称 商品名称
     */
    @Column(name = "productName")
    private String productname;

    /**
     * 分类外键id 分类id
     */
    @Column(name = "categoryId")
    private Integer categoryid;

    /**
     * 一级分类外键id 一级分类id，用于优化查询
     */
    @Column(name = "rootCategoryid")
    private Integer rootcategoryid;

    /**
     * 销量 累计销售
     */
    @Column(name = "soldNum")
    private Integer soldnum;

    /**
     * 默认是1，表示正常状态, -1表示删除, 0下架 默认是1，表示正常状态, -1表示删除, 0下架
     */
    @Column(name = "productStatus")
    private Integer productstatus;

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

    private List<Productimg> imgs;

    public List<Productimg> getImgs() {
        return imgs;
    }

    public void setImgs(List<Productimg> imgs) {
        this.imgs = imgs;
    }

    /**
     * 商品内容 商品内容
     */

    private String content;

    /**
     * 获取商品主键id
     *
     * @return productId - 商品主键id
     */
    public String getProductid() {
        return productid;
    }

    /**
     * 设置商品主键id
     *
     * @param productid 商品主键id
     */
    public void setProductid(String productid) {
        this.productid = productid;
    }

    /**
     * 获取商品名称 商品名称
     *
     * @return productName - 商品名称 商品名称
     */
    public String getProductname() {
        return productname;
    }

    /**
     * 设置商品名称 商品名称
     *
     * @param productname 商品名称 商品名称
     */
    public void setProductname(String productname) {
        this.productname = productname;
    }

    /**
     * 获取分类外键id 分类id
     *
     * @return categoryId - 分类外键id 分类id
     */
    public Integer getCategoryid() {
        return categoryid;
    }

    /**
     * 设置分类外键id 分类id
     *
     * @param categoryid 分类外键id 分类id
     */
    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    /**
     * 获取一级分类外键id 一级分类id，用于优化查询
     *
     * @return rootCategoryid - 一级分类外键id 一级分类id，用于优化查询
     */
    public Integer getRootcategoryid() {
        return rootcategoryid;
    }

    /**
     * 设置一级分类外键id 一级分类id，用于优化查询
     *
     * @param rootcategoryid 一级分类外键id 一级分类id，用于优化查询
     */
    public void setRootcategoryid(Integer rootcategoryid) {
        this.rootcategoryid = rootcategoryid;
    }

    /**
     * 获取销量 累计销售
     *
     * @return soldNum - 销量 累计销售
     */
    public Integer getSoldnum() {
        return soldnum;
    }

    /**
     * 设置销量 累计销售
     *
     * @param soldnum 销量 累计销售
     */
    public void setSoldnum(Integer soldnum) {
        this.soldnum = soldnum;
    }

    /**
     * 获取默认是1，表示正常状态, -1表示删除, 0下架 默认是1，表示正常状态, -1表示删除, 0下架
     *
     * @return productStatus - 默认是1，表示正常状态, -1表示删除, 0下架 默认是1，表示正常状态, -1表示删除, 0下架
     */
    public Integer getProductstatus() {
        return productstatus;
    }

    /**
     * 设置默认是1，表示正常状态, -1表示删除, 0下架 默认是1，表示正常状态, -1表示删除, 0下架
     *
     * @param productstatus 默认是1，表示正常状态, -1表示删除, 0下架 默认是1，表示正常状态, -1表示删除, 0下架
     */
    public void setProductstatus(Integer productstatus) {
        this.productstatus = productstatus;
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
     * 获取商品内容 商品内容
     *
     * @return content - 商品内容 商品内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置商品内容 商品内容
     *
     * @param content 商品内容 商品内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ProductVO{" +
                "productid='" + productid + '\'' +
                ", productname='" + productname + '\'' +
                ", categoryid=" + categoryid +
                ", rootcategoryid=" + rootcategoryid +
                ", soldnum=" + soldnum +
                ", productstatus=" + productstatus +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                ", imgs=" + imgs +
                ", content='" + content + '\'' +
                '}';
    }
}
