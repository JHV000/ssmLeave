package com.leave.service.impl;

import java.util.List;
import java.util.Map;

import com.leave.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leave.mapper.UserMapper;
import com.leave.service.UserService;

/**
 * impl
 * 是对mapper和service的整合
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int queryUser(Map<String,Object> map) {
        return userMapper.queryUser(map);
    }

    @Override
    public void addUser(Map<String, Object> map) {
        userMapper.addUser(map);
    }
    @Override
    public User query(String username) {

        return userMapper.query(username);
    }


    @Override
    public List<User> queryUserPage(Integer startRows) {
        return userMapper.queryUserPage(startRows);
    }

//    @Override
//    public List<User> selectUserPage(String userName, String userSex, Integer startRows) {
//        return userMapper.selectUserPage(userName, userSex, startRows);
//    }
//
//    @Override
//    public Integer getRowCount(String userName, String userSex) {
//        return userMapper.getRowCount(userName, userSex);
//    }
//
//    @Override
//    public Integer createUser(User user) {
//        return userMapper.createUser(user);
//    }
//
//    @Override
//    public Integer deleteUserById(String userId) {
//        return userMapper.deleteUserById(userId);
//    }
//
//    @Override
//    public Integer deleteUserByIdList(@Param("list") List userIds) {
//        return userMapper.deleteUserByIdList(userIds);
//    }




}