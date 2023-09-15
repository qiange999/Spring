package com.cqh.spring.demo.dao;

import com.cqh.spring.demo.entity.User;
import org.springframework.stereotype.Repository;

/*
DAO一般指的是持久化层，和数据打交道
 */
@Repository
public class UserDao {
    public void addUser(User user){
        //真实情况下，会连接数据库，去添加用户到数据库中的表
        System.out.println("添加用户" + user);
    }
}
