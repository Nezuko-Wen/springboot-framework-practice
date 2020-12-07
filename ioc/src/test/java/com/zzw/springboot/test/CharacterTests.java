package com.zzw.springboot.test;

import com.zzw.springboot.demo.SpringbootDemoApplication;
import com.zzw.springboot.demo.config.BeanUtils;
import com.zzw.springboot.demo.event.TestPublisher;
import com.zzw.springboot.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootDemoApplication.class)
public class CharacterTests {

    @Autowired
    private BeanUtils beanUtils;
    @Autowired
    private TestPublisher testPublisher;
    @Autowired
    private UserService userServiceImpl1;
    @Autowired
    private UserService userServiceImpl2;

    @Test
    void contextLoads() {
        beanUtils.getBean("testBean");
    }

    @Test
    void eventListenerTest() {
        testPublisher.method();
    }

    @Test
    void iocTest() {
        userServiceImpl1.showName();
        userServiceImpl2.showName();
    }
}