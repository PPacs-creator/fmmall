package com.example.fmmall.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Users {
    /**
     * 主键id 用户id
     */
    @Id
    @Column(name = "userId")
    private Integer userid;

    /**
     * 用户名 用户名
     */
    private String username;

    /**
     * 密码 密码
     */
    private String password;

    /**
     * 昵称 昵称
     */
    private String nickname;

    /**
     * 真实姓名 真实姓名
     */
    private String realname;

    /**
     * 头像 头像
     */
    @Column(name = "userImg")
    private String userimg;

    /**
     * 手机号 手机号
     */
    @Column(name = "userMobile")
    private String usermobile;

    /**
     * 邮箱地址 邮箱地址
     */
    @Column(name = "userEmail")
    private String useremail;

    /**
     * 性别 M(男) or F(女)
     */
    @Column(name = "userSex")
    private String usersex;

    /**
     * 生日 生日
     */
    @Column(name = "userBirth")
    private Date userbirth;

    /**
     * 注册时间 创建时间
     */
    @Column(name = "userRegtime")
    private Date userregtime;

    /**
     * 更新时间 更新时间
     */
    @Column(name = "userModtime")
    private Date usermodtime;

    /**
     * 获取主键id 用户id
     *
     * @return userId - 主键id 用户id
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置主键id 用户id
     *
     * @param userid 主键id 用户id
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 获取用户名 用户名
     *
     * @return username - 用户名 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名 用户名
     *
     * @param username 用户名 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码 密码
     *
     * @return password - 密码 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码 密码
     *
     * @param password 密码 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取昵称 昵称
     *
     * @return nickname - 昵称 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称 昵称
     *
     * @param nickname 昵称 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取真实姓名 真实姓名
     *
     * @return realname - 真实姓名 真实姓名
     */
    public String getRealname() {
        return realname;
    }

    /**
     * 设置真实姓名 真实姓名
     *
     * @param realname 真实姓名 真实姓名
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * 获取头像 头像
     *
     * @return userImg - 头像 头像
     */
    public String getUserimg() {
        return userimg;
    }

    /**
     * 设置头像 头像
     *
     * @param userimg 头像 头像
     */
    public void setUserimg(String userimg) {
        this.userimg = userimg;
    }

    /**
     * 获取手机号 手机号
     *
     * @return userMobile - 手机号 手机号
     */
    public String getUsermobile() {
        return usermobile;
    }

    /**
     * 设置手机号 手机号
     *
     * @param usermobile 手机号 手机号
     */
    public void setUsermobile(String usermobile) {
        this.usermobile = usermobile;
    }

    /**
     * 获取邮箱地址 邮箱地址
     *
     * @return userEmail - 邮箱地址 邮箱地址
     */
    public String getUseremail() {
        return useremail;
    }

    /**
     * 设置邮箱地址 邮箱地址
     *
     * @param useremail 邮箱地址 邮箱地址
     */
    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    /**
     * 获取性别 M(男) or F(女)
     *
     * @return userSex - 性别 M(男) or F(女)
     */
    public String getUsersex() {
        return usersex;
    }

    /**
     * 设置性别 M(男) or F(女)
     *
     * @param usersex 性别 M(男) or F(女)
     */
    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    /**
     * 获取生日 生日
     *
     * @return userBirth - 生日 生日
     */
    public Date getUserbirth() {
        return userbirth;
    }

    /**
     * 设置生日 生日
     *
     * @param userbirth 生日 生日
     */
    public void setUserbirth(Date userbirth) {
        this.userbirth = userbirth;
    }

    /**
     * 获取注册时间 创建时间
     *
     * @return userRegtime - 注册时间 创建时间
     */
    public Date getUserregtime() {
        return userregtime;
    }

    /**
     * 设置注册时间 创建时间
     *
     * @param userregtime 注册时间 创建时间
     */
    public void setUserregtime(Date userregtime) {
        this.userregtime = userregtime;
    }

    /**
     * 获取更新时间 更新时间
     *
     * @return userModtime - 更新时间 更新时间
     */
    public Date getUsermodtime() {
        return usermodtime;
    }

    /**
     * 设置更新时间 更新时间
     *
     * @param usermodtime 更新时间 更新时间
     */
    public void setUsermodtime(Date usermodtime) {
        this.usermodtime = usermodtime;
    }
}