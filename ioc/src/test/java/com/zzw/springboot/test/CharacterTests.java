package com.zzw.springboot.test;

import com.zzw.springboot.demo.SpringbootDemoApplication;
import com.zzw.springboot.demo.bean.AutoWireByTypeBean;
import com.zzw.springboot.demo.methodinjection.CommandManager;
import com.zzw.springboot.demo.methodinjection.MyValueCalculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootDemoApplication.class)
public class CharacterTests {
    @Autowired
    private AutoWireByTypeBean autoWireByTypeBean;
    @Autowired
    private CommandManager commandManager;
    @Autowired
    private MyValueCalculator myValueCalculator;

    @Test
    public void autoWireByType() {
        autoWireByTypeBean.size();
    }

    @Test
    public void lookMethodInject() {
        for (;;) {
            commandManager.process(1);
        }
    }

    @Test
    public void replaceMethodInject() {
        System.out.println(myValueCalculator.computeValue("zzw"));
    }
}