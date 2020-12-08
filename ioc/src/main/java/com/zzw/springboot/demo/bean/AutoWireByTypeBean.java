package com.zzw.springboot.demo.bean;

import com.zzw.springboot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class AutoWireByTypeBean {
    @Autowired
    Map<String, UserService> userServiceMap;

    public int size() {
        return userServiceMap.size();
    }
}
