package com.example.fmmall.service;

import com.example.fmmall.vo.ResultVO;


public interface UserService {
    public ResultVO userResgit(String name,String pwd);
    public ResultVO  checkLogin(String name, String pwd);
}
