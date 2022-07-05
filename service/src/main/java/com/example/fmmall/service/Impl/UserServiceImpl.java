package com.example.fmmall.service.Impl;

import com.example.fmmall.dao.UsersMapper;
import com.example.fmmall.entity.Users;
import com.example.fmmall.service.UserService;
import com.example.fmmall.utils.MD5Utils;
import com.example.fmmall.vo.ResStatus;
import com.example.fmmall.vo.ResultVO;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

@Service
public class UserServiceImpl implements UserService  {

    @Autowired
    private UsersMapper  usersMapper ;

    @Transactional
    @Override
    public ResultVO userResgit(String name, String pwd) {

        //根据用户查询，这个用户是否已经被注册
        Example example =new Example(Users.class );
        Example.Criteria criteria = example.createCriteria();

        criteria.andEqualTo("username",name);
        List<Users> users= usersMapper .selectByExample(example) ;

        //根据用户查询，这个用户是否已经被注册
      if(users.size()==0){
          String md5Pwd=MD5Utils .md5(pwd);
          Users user=new Users();
          user.setUsername(name) ;
          user.setPassword(md5Pwd);
          user.setUserimg("img/default.png");
          user.setUserregtime(new Date() );
          user.setUsermodtime(new Date() );
          int i=usersMapper .insertUseGeneratedKeys(user) ;
           if(i>0){
               return new ResultVO(ResStatus.OK,"用户名注册成功",user);
           }else{
               return new ResultVO(ResStatus.NO,"注册失败",null);
           }

      }else{
          return new ResultVO(ResStatus.NO,"用户名已经被占用",null) ;
      }


    }

   @Override
    public ResultVO  checkLogin(String name, String pwd) {
       Example example =new Example(Users.class);
       Example.Criteria criteria = example.createCriteria();

       criteria.andEqualTo("username",name);
       List<Users> users= usersMapper.selectByExample(example) ;


         if(users.size()==0){
             return new ResultVO(ResStatus.NO,"登陆失败，用户名不存在",null);
         }else{
            String md5Pwd= MD5Utils.md5(pwd);
            if(md5Pwd .equals(users.get(0).getPassword() ) ){
                //使用jwt规则生成token字符串
                JwtBuilder builder =Jwts.builder();
                HashMap<String,Object> map=new HashMap<>();
               String token = builder.setSubject(name)                    //主题:token中携带的数据
                        .setIssuedAt(new Date())                         //设置token的生成时间
                        .setId(users.get(0).getUserid()+"")            //设置用户id为token id
                        .setClaims(map)                                //map中可以存放用户角色权限信息
                        .setExpiration(new Date(System.currentTimeMillis() + 24*60*60*1000))//设置token过期时间
                        .signWith(SignatureAlgorithm.HS256 ,"pengxiuping")          //设置加密方式和加密密码
                        .compact();

                return new ResultVO(ResStatus.OK, token , users.get(0));
            }else{
                return new ResultVO(ResStatus.NO,"登录失败，密码错误",null);
            }
         }

   }
}
