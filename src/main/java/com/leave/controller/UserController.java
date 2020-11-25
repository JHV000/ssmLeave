package com.leave.controller;

import java.util.List;
import java.util.Map;

import com.leave.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.leave.service.UserService;

/**
 * controller层
 * 接受前端传来的参数，进行业务操作
 * 返回一个路径或数据表
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/queryUser")
    public @ResponseBody
    int queryUser(@RequestBody Map<String, Object> map) {

        int flag = userService.queryUser(map);
        if(flag==1){
            System.out.println("登录成功");

        }else {
            System.out.println("登录失败");
        }
        return flag;

    }


    @PostMapping(value = "/addUser")
    public @ResponseBody
    int addUser(@RequestBody Map<String, Object> map) {
        int flag = userService.addUser(map);
       return flag;

    }


    @GetMapping(value = "/query")
    public @ResponseBody
    User query(@RequestParam String username) {

        return userService.query(username);
    }


//    @RequestMapping("/queryUserPage")
//    @ResponseBody
//    public List<User> queryUserPage(Integer page) {
//        int pageNow = page == null ? 1 : page;
//        int pageSize = 5;
//        int startRows = pageSize * (pageNow - 1);
//        return userService.queryUserPage(startRows);
//    }
//
//    @RequestMapping("/selectUserPage")
//    @ResponseBody
//    public List<User> selectUserPage(String userName, String userSex, Integer page) {
//        int pageNow = page == null ? 1 : page;
//        int pageSize = 5;
//        int startRows = pageSize * (pageNow - 1);
//        return userService.selectUserPage(userName, userSex, startRows);
//    }
//
//    @RequestMapping("/getRowCount")
//    @ResponseBody
//    public Integer getRowCount(String userName, String userSex) {
//        return userService.getRowCount(userName, userSex);
//    }
//
////    @RequestMapping("/createUser")
////    @ResponseBody
////    public Integer createUser(User user) {
////        Random random = new Random();
////        Integer number = random.nextInt(9000) + 1000;
////        user.setUserId(System.currentTimeMillis() + String.valueOf(number));
////        return userService.createUser(user);
////    }
//
//    @RequestMapping("/deleteUserById")
//    @ResponseBody
//    public Integer deleteUserById(String userId) {
//        return userService.deleteUserById(userId);
//    }


}
