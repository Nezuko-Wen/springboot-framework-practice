package com.zzw.springboot.demo.event;

import com.zzw.springboot.demo.consts.EventState;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class TestPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher applicationEventPublisher;

    public void method() {
        TestEvent testEvent = new TestEvent(this, "method", EventState.START);
        applicationEventPublisher.publishEvent(testEvent);
        //同步调用过程
        TestEvent testEvent1 = new TestEvent(this, "method", EventState.END);
        applicationEventPublisher.publishEvent(testEvent1);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
