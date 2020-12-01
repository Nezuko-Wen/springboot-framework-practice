package com.zzw.springboot.demo.ignore;

import com.zzw.springboot.demo.domain.User;

// @Component
public class TestBean implements TestAware{
    private User user;
    @Override
    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
