package com.zzw.springboot.demo.methodinjection;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

//查找方法注入
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public abstract class CommandManager {
    public void process(Object commandState) {
        Command command = createCommand();
        command.setState(commandState);
        command.excute();
    }

    @Lookup("myCommand")
    protected abstract Command createCommand();
}
