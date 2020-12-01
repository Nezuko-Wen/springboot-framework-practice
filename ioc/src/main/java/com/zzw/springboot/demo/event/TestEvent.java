package com.zzw.springboot.demo.event;

import com.zzw.springboot.demo.consts.EventState;
import org.springframework.context.ApplicationEvent;

public class TestEvent extends ApplicationEvent {
    private String condition;

    private EventState eventState;

    public TestEvent(Object source) {
        super(source);
    }

    public TestEvent(Object source, String condition, EventState eventState) {
        super(source);
        this.condition = condition;
        this.eventState = eventState;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public EventState getEventState() {
        return eventState;
    }

    public void setEventState(EventState eventState) {
        this.eventState = eventState;
    }
}
