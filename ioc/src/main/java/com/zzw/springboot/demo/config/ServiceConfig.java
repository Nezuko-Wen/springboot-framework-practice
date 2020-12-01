package com.zzw.springboot.demo.config;

import com.zzw.springboot.demo.domain.User;
import com.zzw.springboot.demo.ignore.TestBean;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public User user() {
        return new User();
    }

    @Bean
    public TestFactoryBean testFactoryBean(User user) {
        return new TestFactoryBean(user);
    }

    //ignoreDependencyInterface功能测试,必须这么设置
    @Bean(autowire = Autowire.BY_TYPE)
    public TestBean testBean() {
        TestBean testBean = new TestBean();
        return testBean;
    }

}
