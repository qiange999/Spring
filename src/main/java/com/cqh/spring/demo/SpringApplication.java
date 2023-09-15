package com.cqh.spring.demo;

import com.cqh.spring.demo.controller.UserController;
import com.cqh.spring.demo.entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*

用一个配置类来代替xml的方式。差不多。
 */
public class SpringApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Object zhangsan = context.getBean("zhangsan");
        System.out.println(zhangsan);
//        Object lisi = context.getBean("lisi");
//        System.out.println(lisi);
        UserController userController = context.getBean(UserController.class);
        userController.addUser((User) zhangsan);
//        System.out.println("userController = " + userController);
    }
}
