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

    //登录
    @Override
    public int queryUser(Map<String,Object> map) {
        return userMapper.queryUser(map);
    }
    //注册
    @Override
    public int addUser(Map<String, Object> map) {
          return userMapper.addUser(map);
    }

    @Override
    public int deleteUser(int uid) {
        return userMapper.deleteUser(uid);
    }

    @Override
    public List<User> queryAll(int index) {
        return userMapper.queryAll(index);
    }

    @Override
    public List<User> search(String chara) {
        return userMapper.search(chara);
    }

    @Override
    public int update(Map<String,Object> map) {
        return userMapper.update(map);
    }

    //查询
    @Override
    public User query(int uid) {
        return userMapper.query(uid);
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
