package com.cqh.spring.demo.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AspectBeans.xml");
        UserService service = context.getBean(UserService.class);
        service.updateUser(1,"zhangsan");
    }
}
