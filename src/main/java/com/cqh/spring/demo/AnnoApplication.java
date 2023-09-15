package com.cqh.spring.demo;

import com.cqh.spring.demo.controller.UserController;
import com.cqh.spring.demo.entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnoApplication {
    public static void main(String[] args) {
        User user = new User(1,"zhangsan",18);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("anno-beans.xml");
        UserController controller = context.getBean(UserController.class);
        controller.addUser(user);
    }
}
