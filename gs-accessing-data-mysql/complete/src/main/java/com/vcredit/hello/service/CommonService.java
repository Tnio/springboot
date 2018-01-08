package com.vcredit.hello.service;

import com.vcredit.hello.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tangzhiqiang on 2018/1/2.
 */
@Service
public class CommonService {
    @Autowired
    private UserMapper userMapper;

    public long getNextId() {
      return userMapper.getNextId();
    }
}
