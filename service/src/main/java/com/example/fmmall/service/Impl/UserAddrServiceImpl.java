package com.example.fmmall.service.Impl;

import com.example.fmmall.dao.UseraddrMapper;
import com.example.fmmall.entity.Useraddr;
import com.example.fmmall.service.UserAddrService;
import com.example.fmmall.vo.ResStatus;
import com.example.fmmall.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserAddrServiceImpl implements UserAddrService {
    @Autowired
    private UseraddrMapper useraddrMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    public ResultVO listAddrsByUid(int userId) {
        Example example = new Example(Useraddr.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userid",userId);
        criteria.andEqualTo("status",1);


        List<Useraddr> userAddrs = useraddrMapper.selectByExample(example);
        ResultVO resultVO = new ResultVO(ResStatus.OK, "success", userAddrs);
        return resultVO;
    }
}
