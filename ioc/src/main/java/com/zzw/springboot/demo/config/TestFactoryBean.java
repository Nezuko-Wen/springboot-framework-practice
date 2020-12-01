package com.zzw.springboot.demo.config;

import com.zzw.springboot.demo.domain.User;
import org.springframework.beans.factory.FactoryBean;

public class TestFactoryBean implements FactoryBean {

    private final User user;

    public TestFactoryBean(User user) {
        this.user = user;
    }

    @Override
    public Object getObject() throws Exception {
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
