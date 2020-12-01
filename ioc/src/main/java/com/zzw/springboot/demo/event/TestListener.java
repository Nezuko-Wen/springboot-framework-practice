package com.zzw.springboot.demo.event;

import com.zzw.springboot.demo.consts.EventState;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class TestListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof TestEvent) {
            TestEvent testEvent = (TestEvent) event;
            if (testEvent.getEventState() == EventState.START) {
                System.out.println("listener-start:" + System.currentTimeMillis());
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("listener-end:" + System.currentTimeMillis());
            }
        }
    }
}
