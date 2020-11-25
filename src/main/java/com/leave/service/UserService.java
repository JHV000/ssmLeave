package com.leave.service;

import java.util.List;
import java.util.Map;

import com.leave.model.User;

/**
 * service层
 * 业务逻辑
 * 是个接口，所以只是定义了方法
 */
public interface UserService {


    //登录
    int queryUser(Map<String,Object> map);
    //查询
    User query(String username);
    //注册
    int addUser(Map<String,Object> map);













//    List<User> queryUserPage(Integer startRows);
//
//    /**
//     * 分页查询 User 带条件
//     * @param userName
//     * @param userSex
//     * @param startRows
//     * @return
//     */
//    List<User> selectUserPage(@Param("userName")String userName, @Param("userSex")String userSex, @Param("startRows")Integer startRows);
//
//    /**
//     * 查询 User 个数
//     * @param userName
//     * @param userSex
//     * @return
//     */
//    Integer getRowCount(@Param("userName")String userName, @Param("userSex")String userSex);
//
//    /**
//     * 添加 User
//     * @param user
//     * @return 返回码
//     */
//    Integer createUser(User user);
//
//    /**
//     * 根据 userId 删除用户
//     * @return 返回码
//     */
//    Integer deleteUserById(String userId);
//
//    /**
//     * 根据 userId 批量删除用户
//     * @param userIds
//     * @return
//     */
//    Integer deleteUserByIdList(@Param("list") List userIds);
//

}
