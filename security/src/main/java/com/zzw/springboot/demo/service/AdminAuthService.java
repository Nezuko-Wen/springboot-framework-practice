package com.zzw.springboot.demo.service;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class AdminAuthService {
    public boolean canAccess(HttpServletRequest request, Authentication authentication) {
        return true;
    }
}
