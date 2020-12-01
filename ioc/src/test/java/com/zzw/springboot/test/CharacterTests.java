package com.zzw.springboot.test;

import com.zzw.springboot.demo.config.BeanUtils;
import com.zzw.springboot.demo.event.TestPublisher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class CharacterTests {
    @Autowired
    private BeanUtils beanUtils;
    @Autowired
    private TestPublisher testPublisher;
    @Test
    void contextLoads() {
        beanUtils.getBean("testBean");
    }

    @Test
    void eventListenerTest() {
        testPublisher.method();
    }
}