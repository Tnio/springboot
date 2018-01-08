package com.vcredit.hello.controller;

import com.vcredit.hello.param.UserParam;
import com.vcredit.hello.service.CommonService;
import com.vcredit.hello.service.UserService;
import com.vcredit.hello.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping(path = "/user")
public class UserController {


    @Autowired
    private UserService userService;

    @Autowired
    private CommonService commonService;

    @PostMapping(path = "/add")
    @ResponseBody
    public String addNewUser(@RequestBody UserParam userParam, HttpServletRequest request) {
        User user=new User();
        user.setId(commonService.getNextId());
        user.setName(userParam.getName());
        user.setEmail(userParam.getEmail());
        userService.saveUser(user);
        return user.toString();
    }
}
