package com.cashwu.javawebbean.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

/**
 * @author cash.wu
 * @since 2024/05/07
 */
@Service
@ApplicationScope
public class LoginCountService {

    private int loginCount;

    public int getLoginCount() {
        return loginCount;
    }

    public void setLoginCount() {
        this.loginCount++;
    }
}
