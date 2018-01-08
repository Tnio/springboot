package com.vcredit.mapper;


import com.vcredit.data.model.mysql.User;

/**
 * Created by tangzhiqiang on 2018/1/2.
 */
public interface UserMapper {

    public void insertUser(User user);

    long getNextId();

    public User findUserByName(String name);
}
