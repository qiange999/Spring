package com.cqh.spring.demo.controller;

import com.cqh.spring.demo.entity.User;
import com.cqh.spring.demo.service.UserService;
import org.springframework.stereotype.Controller;

/*
控制层，在web项目中一般提供 restful接口

 */
@Controller
public class UserController {
        UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    public String addUser(User user){
        //一般判断用户是否有权限添加或修改等
        userService.addUser(user);
        return user.getName();
    }

    @Override
    public String toString() {
        return "UserController{" +
                "userService=" + userService +
                '}';
    }
}
