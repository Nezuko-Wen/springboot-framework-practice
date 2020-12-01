package com.zzw.springboot.demo.ignore;

import com.zzw.springboot.demo.domain.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class TestBeanPostProcesser implements BeanPostProcessor {
    @Autowired
    private User user;
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof TestAware) {
            ((TestAware) bean).setUser(user);
        }
        return null;
    }
}
