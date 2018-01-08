package com.vcredit.hello.service;

import com.vcredit.hello.mapper.UserMapper;
import com.vcredit.hello.user.User;
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
}
