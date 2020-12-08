package com.zzw.springboot.demo.bean;

public class ExampleBean {
    private static ExampleBean clientService = new ExampleBean();
    private ExampleBean() {}

    public static ExampleBean createInstance() {
        return clientService;
    }
}
