package com.example.fmmall.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    /**
     * 订单ID 同时也是订单编号
     */
    @Id
    @Column(name = "orderId")
    private String orderid;

    /**
     * 用户ID
     */
    @Column(name = "userId")
    private String userid;

    /**
     * 产品名称（多个产品用,隔开）
     */
    private String unitled;

    /**
     * 收货人快照
     */
    @Column(name = "receiverName")
    private String receivername;

    /**
     * 收货人手机号快照
     */
    @Column(name = "receiverMobile")
    private String receivermobile;

    /**
     * 收货地址快照
     */
    @Column(name = "receiverAddress")
    private String receiveraddress;

    /**
     * 订单总价格
     */
    @Column(name = "totalAmount")
    private BigDecimal totalamount;

    /**
     * 实际支付总价格
     */
    @Column(name = "actualAmount")
    private Integer actualamount;

    /**
     * 支付方式 1:微信 2:支付宝
     */
    @Column(name = "payType")
    private Integer paytype;

    /**
     * 订单备注
     */
    @Column(name = "orderRemark")
    private String orderremark;

    /**
     * 订单状态 1:待付款 2:待发货 3:待收货 4:待评价 5:已完成 6:已关闭
     */
    private String status;

    /**
     * 配送方式
     */
    @Column(name = "deliveryType")
    private String deliverytype;

    /**
     * 物流单号
     */
    @Column(name = "deliveryFlowid")
    private String deliveryflowid;

    /**
     * 订单运费 默认可以为零，代表包邮
     */
    @Column(name = "orderFreight")
    private BigDecimal orderfreight;

    /**
     * 逻辑删除状态 1: 删除 0:未删除
     */
    @Column(name = "deleteStatus")
    private Integer deletestatus;

    /**
     * 创建时间（成交时间）
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 更新时间
     */
    @Column(name = "updateTime")
    private Date updatetime;

    /**
     * 付款时间
     */
    @Column(name = "payTime")
    private Date paytime;

    /**
     * 发货时间
     */
    @Column(name = "delivery_time")
    private Date deliveryTime;

    /**
     * 完成时间
     */
    @Column(name = "flish_time")
    private Date flishTime;

    /**
     * 取消时间
     */
    @Column(name = "cancel_time")
    private Date cancelTime;

    /**
     * 订单关闭类型1-超时未支付 2-退款关闭 4-买家取消 15-已通过货到付款交易
     */
    @Column(name = "close_type")
    private Integer closeType;

    /**
     * 获取订单ID 同时也是订单编号
     *
     * @return orderId - 订单ID 同时也是订单编号
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * 设置订单ID 同时也是订单编号
     *
     * @param orderid 订单ID 同时也是订单编号
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid;
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
     * 获取产品名称（多个产品用,隔开）
     *
     * @return unitled - 产品名称（多个产品用,隔开）
     */
    public String getUnitled() {
        return unitled;
    }

    /**
     * 设置产品名称（多个产品用,隔开）
     *
     * @param unitled 产品名称（多个产品用,隔开）
     */
    public void setUnitled(String unitled) {
        this.unitled = unitled;
    }

    /**
     * 获取收货人快照
     *
     * @return receiverName - 收货人快照
     */
    public String getReceivername() {
        return receivername;
    }

    /**
     * 设置收货人快照
     *
     * @param receivername 收货人快照
     */
    public void setReceivername(String receivername) {
        this.receivername = receivername;
    }

    /**
     * 获取收货人手机号快照
     *
     * @return receiverMobile - 收货人手机号快照
     */
    public String getReceivermobile() {
        return receivermobile;
    }

    /**
     * 设置收货人手机号快照
     *
     * @param receivermobile 收货人手机号快照
     */
    public void setReceivermobile(String receivermobile) {
        this.receivermobile = receivermobile;
    }

    /**
     * 获取收货地址快照
     *
     * @return receiverAddress - 收货地址快照
     */
    public String getReceiveraddress() {
        return receiveraddress;
    }

    /**
     * 设置收货地址快照
     *
     * @param receiveraddress 收货地址快照
     */
    public void setReceiveraddress(String receiveraddress) {
        this.receiveraddress = receiveraddress;
    }

    /**
     * 获取订单总价格
     *
     * @return totalAmount - 订单总价格
     */
    public BigDecimal getTotalamount() {
        return totalamount;
    }

    /**
     * 设置订单总价格
     *
     * @param totalamount 订单总价格
     */
    public void setTotalamount(BigDecimal totalamount) {
        this.totalamount = totalamount;
    }

    /**
     * 获取实际支付总价格
     *
     * @return actualAmount - 实际支付总价格
     */
    public Integer getActualamount() {
        return actualamount;
    }

    /**
     * 设置实际支付总价格
     *
     * @param actualamount 实际支付总价格
     */
    public void setActualamount(Integer actualamount) {
        this.actualamount = actualamount;
    }

    /**
     * 获取支付方式 1:微信 2:支付宝
     *
     * @return payType - 支付方式 1:微信 2:支付宝
     */
    public Integer getPaytype() {
        return paytype;
    }

    /**
     * 设置支付方式 1:微信 2:支付宝
     *
     * @param paytype 支付方式 1:微信 2:支付宝
     */
    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    /**
     * 获取订单备注
     *
     * @return orderRemark - 订单备注
     */
    public String getOrderremark() {
        return orderremark;
    }

    /**
     * 设置订单备注
     *
     * @param orderremark 订单备注
     */
    public void setOrderremark(String orderremark) {
        this.orderremark = orderremark;
    }

    /**
     * 获取订单状态 1:待付款 2:待发货 3:待收货 4:待评价 5:已完成 6:已关闭
     *
     * @return status - 订单状态 1:待付款 2:待发货 3:待收货 4:待评价 5:已完成 6:已关闭
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置订单状态 1:待付款 2:待发货 3:待收货 4:待评价 5:已完成 6:已关闭
     *
     * @param status 订单状态 1:待付款 2:待发货 3:待收货 4:待评价 5:已完成 6:已关闭
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取配送方式
     *
     * @return deliveryType - 配送方式
     */
    public String getDeliverytype() {
        return deliverytype;
    }

    /**
     * 设置配送方式
     *
     * @param deliverytype 配送方式
     */
    public void setDeliverytype(String deliverytype) {
        this.deliverytype = deliverytype;
    }

    /**
     * 获取物流单号
     *
     * @return deliveryFlowid - 物流单号
     */
    public String getDeliveryflowid() {
        return deliveryflowid;
    }

    /**
     * 设置物流单号
     *
     * @param deliveryflowid 物流单号
     */
    public void setDeliveryflowid(String deliveryflowid) {
        this.deliveryflowid = deliveryflowid;
    }

    /**
     * 获取订单运费 默认可以为零，代表包邮
     *
     * @return orderFreight - 订单运费 默认可以为零，代表包邮
     */
    public BigDecimal getOrderfreight() {
        return orderfreight;
    }

    /**
     * 设置订单运费 默认可以为零，代表包邮
     *
     * @param orderfreight 订单运费 默认可以为零，代表包邮
     */
    public void setOrderfreight(BigDecimal orderfreight) {
        this.orderfreight = orderfreight;
    }

    /**
     * 获取逻辑删除状态 1: 删除 0:未删除
     *
     * @return deleteStatus - 逻辑删除状态 1: 删除 0:未删除
     */
    public Integer getDeletestatus() {
        return deletestatus;
    }

    /**
     * 设置逻辑删除状态 1: 删除 0:未删除
     *
     * @param deletestatus 逻辑删除状态 1: 删除 0:未删除
     */
    public void setDeletestatus(Integer deletestatus) {
        this.deletestatus = deletestatus;
    }

    /**
     * 获取创建时间（成交时间）
     *
     * @return createTime - 创建时间（成交时间）
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间（成交时间）
     *
     * @param createtime 创建时间（成交时间）
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
     * 获取付款时间
     *
     * @return payTime - 付款时间
     */
    public Date getPaytime() {
        return paytime;
    }

    /**
     * 设置付款时间
     *
     * @param paytime 付款时间
     */
    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    /**
     * 获取发货时间
     *
     * @return delivery_time - 发货时间
     */
    public Date getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * 设置发货时间
     *
     * @param deliveryTime 发货时间
     */
    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * 获取完成时间
     *
     * @return flish_time - 完成时间
     */
    public Date getFlishTime() {
        return flishTime;
    }

    /**
     * 设置完成时间
     *
     * @param flishTime 完成时间
     */
    public void setFlishTime(Date flishTime) {
        this.flishTime = flishTime;
    }

    /**
     * 获取取消时间
     *
     * @return cancel_time - 取消时间
     */
    public Date getCancelTime() {
        return cancelTime;
    }

    /**
     * 设置取消时间
     *
     * @param cancelTime 取消时间
     */
    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    /**
     * 获取订单关闭类型1-超时未支付 2-退款关闭 4-买家取消 15-已通过货到付款交易
     *
     * @return close_type - 订单关闭类型1-超时未支付 2-退款关闭 4-买家取消 15-已通过货到付款交易
     */
    public Integer getCloseType() {
        return closeType;
    }

    /**
     * 设置订单关闭类型1-超时未支付 2-退款关闭 4-买家取消 15-已通过货到付款交易
     *
     * @param closeType 订单关闭类型1-超时未支付 2-退款关闭 4-买家取消 15-已通过货到付款交易
     */
    public void setCloseType(Integer closeType) {
        this.closeType = closeType;
    }
}