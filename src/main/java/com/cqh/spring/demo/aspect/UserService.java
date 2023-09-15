package com.cqh.spring.demo.aspect;
import com.cqh.spring.demo.entity.User;
import java.util.List;
/*
用户服务接口
 */
public interface UserService {
    public List<User> getUser();
    public boolean updateUser(int id, String name);
}
