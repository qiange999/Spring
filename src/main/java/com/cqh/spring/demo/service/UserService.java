package com.cqh.spring.demo.service;

import com.cqh.spring.demo.dao.UserDao;
import com.cqh.spring.demo.entity.User;
import org.springframework.stereotype.Service;

/*
service一般用来做业务逻辑
通常需要引入userDAO

 */
@Service
public class UserService {
    UserDao dao;

    public UserService(UserDao dao) {
        this.dao = dao;
    }
    public void addUser(User user){
        //一般会有前置处理，什么判断，属性修改
        dao.addUser(user);
        //加完user以后的后置处理
    }
}
