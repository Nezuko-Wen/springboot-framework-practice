package com.zzw.springboot.demo.service.impl;

import com.zzw.springboot.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl2 implements UserService {
    @Override
    public void showName() {
        System.out.println(this.getClass().getName());
    }
}
