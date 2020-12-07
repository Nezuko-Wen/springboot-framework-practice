package com.zzw.springboot.demo.controller;

import com.zzw.springboot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userServiceImpl1;
    @Autowired
    private UserService userServiceImpl2;

    @RequestMapping("test")
    public void test() {
        userServiceImpl1.showName();
        userServiceImpl2.showName();
    }

}
