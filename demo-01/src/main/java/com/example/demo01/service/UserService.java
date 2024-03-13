package com.example.demo01.service;

/**
 * @Classname UserService
 * @Description TODO
 * @Date 2023/10/11 12:34
 * @Author ChangWang
 */
import com.example.demo01.entity.User;
import com.example.demo01.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User getUserInfo(int id) {
        return userMapper.getUserInfo(id);
    }

    public int deleteById(int id) {
        return userMapper.deleteById(id);
    }

    public int Update(User user) {
        return userMapper.update(user);
    }

    public User save(User user) {
        int save = userMapper.save(user);
        return user;
    }

    public List<User> selectAll() {
        return userMapper.selectAll();
    }

}
