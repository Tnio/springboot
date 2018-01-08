package com.vcredit.service;


import com.vcredit.data.model.mysql.User;
import com.vcredit.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tangzhiqiang on 2018/1/2.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void saveUser(User user) {
        userMapper.insertUser(user);
    }

    public User findUserByName(String name){
       return userMapper.findUserByName(name);
    }


}
