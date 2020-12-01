package com.zzw.springboot.demo.ignore;

import com.zzw.springboot.demo.domain.User;
import org.springframework.beans.factory.Aware;

public interface TestAware extends Aware {
    void setUser(User user);
}
