package com.example.fmmall.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Useraddr {
    /**
     * 地址主键id
     */
    @Id
    @Column(name = "addrId")
    private String addrid;

    /**
     * 用户ID
     */
    @Column(name = "userId")
    private String userid;

    /**
     * 收件人姓名
     */
    @Column(name = "receiverName")
    private String receivername;

    /**
     * 收件人手机号
     */
    @Column(name = "receiverMobile")
    private String receivermobile;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 区县
     */
    private String area;

    /**
     * 详细地址
     */
    private String addr;

    /**
     * 邮编
     */
    private String postcode;

    /**
     * 状态,1正常，0无效
     */
    private Integer status;

    /**
     * 是否默认地址 1是 1:是  0:否
     */
    @Column(name = "commonAddr")
    private Integer commonaddr;

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
     * 获取地址主键id
     *
     * @return addrId - 地址主键id
     */
    public String getAddrid() {
        return addrid;
    }

    /**
     * 设置地址主键id
     *
     * @param addrid 地址主键id
     */
    public void setAddrid(String addrid) {
        this.addrid = addrid;
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
     * 获取收件人姓名
     *
     * @return receiverName - 收件人姓名
     */
    public String getReceivername() {
        return receivername;
    }

    /**
     * 设置收件人姓名
     *
     * @param receivername 收件人姓名
     */
    public void setReceivername(String receivername) {
        this.receivername = receivername;
    }

    /**
     * 获取收件人手机号
     *
     * @return receiverMobile - 收件人手机号
     */
    public String getReceivermobile() {
        return receivermobile;
    }

    /**
     * 设置收件人手机号
     *
     * @param receivermobile 收件人手机号
     */
    public void setReceivermobile(String receivermobile) {
        this.receivermobile = receivermobile;
    }

    /**
     * 获取省份
     *
     * @return province - 省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份
     *
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取城市
     *
     * @return city - 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取区县
     *
     * @return area - 区县
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置区县
     *
     * @param area 区县
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 获取详细地址
     *
     * @return addr - 详细地址
     */
    public String getAddr() {
        return addr;
    }

    /**
     * 设置详细地址
     *
     * @param addr 详细地址
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
     * 获取邮编
     *
     * @return postcode - 邮编
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * 设置邮编
     *
     * @param postcode 邮编
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * 获取状态,1正常，0无效
     *
     * @return status - 状态,1正常，0无效
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态,1正常，0无效
     *
     * @param status 状态,1正常，0无效
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取是否默认地址 1是 1:是  0:否
     *
     * @return commonAddr - 是否默认地址 1是 1:是  0:否
     */
    public Integer getCommonaddr() {
        return commonaddr;
    }

    /**
     * 设置是否默认地址 1是 1:是  0:否
     *
     * @param commonaddr 是否默认地址 1是 1:是  0:否
     */
    public void setCommonaddr(Integer commonaddr) {
        this.commonaddr = commonaddr;
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