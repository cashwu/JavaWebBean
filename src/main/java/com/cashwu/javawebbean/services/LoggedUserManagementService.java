package com.cashwu.javawebbean.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

/**
 * @author cash.wu
 * @since 2024/05/07
 */
@Service
@SessionScope
public class LoggedUserManagementService {

    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
