package com.zzw.springboot.demo.methodinjection;

import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

public class ReplacementComputeValue implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        String name = (String) args[0];
        return "replace-" + name;
    }
}
