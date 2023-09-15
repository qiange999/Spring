package com.cqh.spring.demo;

import com.cqh.spring.demo.controller.UserController;
import com.cqh.spring.demo.dao.UserDao;
import com.cqh.spring.demo.entity.User;
import com.cqh.spring.demo.service.UserService;

public class Application {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("zhangsan");
        user.setAge(18);

        UserController userController = new UserController(new UserService(new UserDao()));
        userController.addUser(user);
    }
}
