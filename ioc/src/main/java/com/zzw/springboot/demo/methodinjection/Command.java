package com.zzw.springboot.demo.methodinjection;

public class Command {
    public Object state;

    public void setState(Object state) {
        this.state = state;
    }

    public void excute() {
        System.out.println(this.state);
    }
}
