package com.cqh.spring.demo;

import com.cqh.spring.demo.controller.UserController;
import com.cqh.spring.demo.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Annoconfiguration.class);

        User user = new User(1,"zhangsan",18);
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("anno-beans.xml");
        UserController controller = context.getBean(UserController.class);
        controller.addUser(user);
    }
}
