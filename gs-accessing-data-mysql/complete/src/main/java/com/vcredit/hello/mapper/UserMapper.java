package com.vcredit.hello.mapper;


import com.vcredit.hello.user.User;

/**
 * Created by tangzhiqiang on 2018/1/2.
 */
public interface UserMapper {

    public void insertUser(User user);

    long getNextId();
}
