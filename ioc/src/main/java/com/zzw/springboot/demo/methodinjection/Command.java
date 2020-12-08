package com.zzw.springboot.demo.methodinjection;

import lombok.Data;
@Data
public class Command {
    public Object state;

    public void excute() {
        System.out.println(state);
    }
}
