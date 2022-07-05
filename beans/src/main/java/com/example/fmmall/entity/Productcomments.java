package com.example.fmmall.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Productcomments {
    /**
     * ID
     */
    @Id
    @Column(name = "commId")
    private String commid;

    /**
     * 商品id
     */
    @Column(name = "productId")
    private String productid;

    /**
     * 商品名称
     */
    @Column(name = "productName")
    private String productname;

    /**
     * 订单项(商品快照)ID 可为空
     */
    @Column(name = "orderitemId")
    private String orderitemid;

    /**
     * 评论用户id 用户名须脱敏
     */
    @Column(name = "userId")
    private String userid;

    /**
     * 是否匿名（1:是，0:否）
     */
    @Column(name = "isAnonymous")
    private Integer isanonymous;

    /**
     * 评价类型（1好评，0中评，-1差评）
     */
    @Column(name = "commType")
    private Integer commtype;

    /**
     * 评价等级 1：好评 2：中评 3：差评
     */
    @Column(name = "commLevel")
    private Integer commlevel;

    /**
     * 评价内容
     */
    @Column(name = "commContent")
    private String commcontent;

    /**
     * 评价晒图(JSON {img1:url1,img2:url2}  )
     */
    @Column(name = "commImgs")
    private String commimgs;

    /**
     * 评价时间 可为空
     */
    @Column(name = "sepcName")
    private Date sepcname;

    /**
     * 是否回复（0:未回复，1:已回复）
     */
    @Column(name = "replyStatus")
    private Integer replystatus;

    /**
     * 回复内容
     */
    @Column(name = "replyContent")
    private String replycontent;

    /**
     * 回复时间
     */
    @Column(name = "replyTime")
    private Date replytime;

    /**
     * 是否显示（1:是，0:否）
     */
    @Column(name = "isShow")
    private Integer isshow;

    /**
     * 获取ID
     *
     * @return commId - ID
     */
    public String getCommid() {
        return commid;
    }

    /**
     * 设置ID
     *
     * @param commid ID
     */
    public void setCommid(String commid) {
        this.commid = commid;
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
     * 获取订单项(商品快照)ID 可为空
     *
     * @return orderitemId - 订单项(商品快照)ID 可为空
     */
    public String getOrderitemid() {
        return orderitemid;
    }

    /**
     * 设置订单项(商品快照)ID 可为空
     *
     * @param orderitemid 订单项(商品快照)ID 可为空
     */
    public void setOrderitemid(String orderitemid) {
        this.orderitemid = orderitemid;
    }

    /**
     * 获取评论用户id 用户名须脱敏
     *
     * @return userId - 评论用户id 用户名须脱敏
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置评论用户id 用户名须脱敏
     *
     * @param userid 评论用户id 用户名须脱敏
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取是否匿名（1:是，0:否）
     *
     * @return isAnonymous - 是否匿名（1:是，0:否）
     */
    public Integer getIsanonymous() {
        return isanonymous;
    }

    /**
     * 设置是否匿名（1:是，0:否）
     *
     * @param isanonymous 是否匿名（1:是，0:否）
     */
    public void setIsanonymous(Integer isanonymous) {
        this.isanonymous = isanonymous;
    }

    /**
     * 获取评价类型（1好评，0中评，-1差评）
     *
     * @return commType - 评价类型（1好评，0中评，-1差评）
     */
    public Integer getCommtype() {
        return commtype;
    }

    /**
     * 设置评价类型（1好评，0中评，-1差评）
     *
     * @param commtype 评价类型（1好评，0中评，-1差评）
     */
    public void setCommtype(Integer commtype) {
        this.commtype = commtype;
    }

    /**
     * 获取评价等级 1：好评 2：中评 3：差评
     *
     * @return commLevel - 评价等级 1：好评 2：中评 3：差评
     */
    public Integer getCommlevel() {
        return commlevel;
    }

    /**
     * 设置评价等级 1：好评 2：中评 3：差评
     *
     * @param commlevel 评价等级 1：好评 2：中评 3：差评
     */
    public void setCommlevel(Integer commlevel) {
        this.commlevel = commlevel;
    }

    /**
     * 获取评价内容
     *
     * @return commContent - 评价内容
     */
    public String getCommcontent() {
        return commcontent;
    }

    /**
     * 设置评价内容
     *
     * @param commcontent 评价内容
     */
    public void setCommcontent(String commcontent) {
        this.commcontent = commcontent;
    }

    /**
     * 获取评价晒图(JSON {img1:url1,img2:url2}  )
     *
     * @return commImgs - 评价晒图(JSON {img1:url1,img2:url2}  )
     */
    public String getCommimgs() {
        return commimgs;
    }

    /**
     * 设置评价晒图(JSON {img1:url1,img2:url2}  )
     *
     * @param commimgs 评价晒图(JSON {img1:url1,img2:url2}  )
     */
    public void setCommimgs(String commimgs) {
        this.commimgs = commimgs;
    }

    /**
     * 获取评价时间 可为空
     *
     * @return sepcName - 评价时间 可为空
     */
    public Date getSepcname() {
        return sepcname;
    }

    /**
     * 设置评价时间 可为空
     *
     * @param sepcname 评价时间 可为空
     */
    public void setSepcname(Date sepcname) {
        this.sepcname = sepcname;
    }

    /**
     * 获取是否回复（0:未回复，1:已回复）
     *
     * @return replyStatus - 是否回复（0:未回复，1:已回复）
     */
    public Integer getReplystatus() {
        return replystatus;
    }

    /**
     * 设置是否回复（0:未回复，1:已回复）
     *
     * @param replystatus 是否回复（0:未回复，1:已回复）
     */
    public void setReplystatus(Integer replystatus) {
        this.replystatus = replystatus;
    }

    /**
     * 获取回复内容
     *
     * @return replyContent - 回复内容
     */
    public String getReplycontent() {
        return replycontent;
    }

    /**
     * 设置回复内容
     *
     * @param replycontent 回复内容
     */
    public void setReplycontent(String replycontent) {
        this.replycontent = replycontent;
    }

    /**
     * 获取回复时间
     *
     * @return replyTime - 回复时间
     */
    public Date getReplytime() {
        return replytime;
    }

    /**
     * 设置回复时间
     *
     * @param replytime 回复时间
     */
    public void setReplytime(Date replytime) {
        this.replytime = replytime;
    }

    /**
     * 获取是否显示（1:是，0:否）
     *
     * @return isShow - 是否显示（1:是，0:否）
     */
    public Integer getIsshow() {
        return isshow;
    }

    /**
     * 设置是否显示（1:是，0:否）
     *
     * @param isshow 是否显示（1:是，0:否）
     */
    public void setIsshow(Integer isshow) {
        this.isshow = isshow;
    }
}