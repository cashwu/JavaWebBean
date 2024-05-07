package com.cashwu.javawebbean.controller;

import com.cashwu.javawebbean.services.LoginProcessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author cash.wu
 * @since 2024/05/07
 */
@Controller
public class LoginController {

    private final LoginProcessor loginProcessor;

    public LoginController(LoginProcessor loginProcess) {
        this.loginProcessor = loginProcess;
    }

    @GetMapping("/")
    public String loginGet() {

        return "login";
    }

    @PostMapping("/")
    public String loginPost(@RequestParam String username,
                            @RequestParam String password,
                            Model model) {

        loginProcessor.setUsername(username);
        loginProcessor.setPassword(password);

        boolean isLoggedIn = loginProcessor.login();

        if (isLoggedIn) {
            return "redirect:/main";
        }

        model.addAttribute("message", "Invalid username or password");

        return "login";
    }
}


