package com.example.demo.service;

import com.example.demo.dao.test.UserInfoPOMapper;
import com.example.demo.dao.test2.UserInfoPO2Mapper;
import com.example.demo.entity.test.UserInfoPO;
import com.example.demo.entity.test2.UserInfoPO2;
import com.example.demo.utils.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestService {

    @Autowired
    private UserInfoPOMapper mapper;

    @Autowired
    private UserInfoPO2Mapper mapper2;

    public List<Object> query() throws Exception {
        UserInfoPO userInfoPO1 = mapper.selectByPrimaryKey("1");
        UserInfoPO2 userInfoPO2 = mapper2.selectByPrimaryKey("1");
        List<Object> list = new ArrayList<>();
        list.add(userInfoPO1);
        list.add(userInfoPO2);
        return list;
    }

    public int insert() throws Exception {
        UserInfoPO userInfoPO = new UserInfoPO();
        userInfoPO.setId(CommonUtil.generateRandomNumber(4));
        userInfoPO.setCode("003");
        userInfoPO.setName("哈哈哈");
        int insert = mapper.insert(userInfoPO);
        System.out.println("insert " + insert);
        return insert;
    }

}
