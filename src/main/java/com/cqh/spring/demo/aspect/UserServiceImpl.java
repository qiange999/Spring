package com.cqh.spring.demo.aspect;
import com.cqh.spring.demo.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
/*
逻辑实现类
 */
@Component
public class UserServiceImpl implements UserService{

    @Override
    public List<User> getUser() {

        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1,"zhangsan",18));
        users.add(new User(2,"lisi",19));
        users.add(new User(3,"wangwu",20));
        return users;
    }

    @Override
    public boolean updateUser(int id, String name) {
        return false;
    }
}
