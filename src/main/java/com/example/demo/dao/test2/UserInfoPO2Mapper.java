package com.example.demo.dao.test2;

import com.example.demo.entity.test2.UserInfoPO2;

public interface UserInfoPO2Mapper {
    int deleteByPrimaryKey(String id);

    int insert(UserInfoPO2 record);

    int insertSelective(UserInfoPO2 record);

    UserInfoPO2 selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserInfoPO2 record);

    int updateByPrimaryKey(UserInfoPO2 record);
}