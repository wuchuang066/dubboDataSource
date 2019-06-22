package com.example.demo.dao.test;

import com.example.demo.entity.test.UserInfoPO;

public interface UserInfoPOMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserInfoPO record);

    int insertSelective(UserInfoPO record);

    UserInfoPO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserInfoPO record);

    int updateByPrimaryKey(UserInfoPO record);
}