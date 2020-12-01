package com.zzw.springboot.demo.ignore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

//容器初始化过程中执行
@Component
public class TestBeanFactoryPostProcesser implements BeanFactoryPostProcessor {
    //ignoreDependencyInterface忽略接口实现类中set注入的自动装配
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        beanFactory.ignoreDependencyInterface(TestAware.class);
    }
}
