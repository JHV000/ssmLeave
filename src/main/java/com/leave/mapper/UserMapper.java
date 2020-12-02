package com.leave.mapper;

import java.util.List;
import java.util.Map;

import com.leave.model.User;
import org.apache.ibatis.annotations.Param;
/**
 * mapper层
 * 也是一个接口
 * 主要是对数据库进行持久化操作
 * 数据库的语法在对应的mapper.xml文件中
 */
public interface UserMapper {

    //查找用户，登录，并区分管理员和普通用户
    int queryUser(Map<String,Object> map);

    //根据姓名查询
    User query(int uid);
    //添加新用户，注册
    int addUser(Map<String,Object> map);

    //删除用户
    int deleteUser(int uid);

    //查询所有用户
    List<User> queryAll(int index);

    //模糊查找
    List<User> search(String chara);

    //更新信息
    int update(Map<String,Object> map);




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


}
