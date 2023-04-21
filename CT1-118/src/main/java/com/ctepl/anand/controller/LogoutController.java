package com.ctepl.anand.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ctepl.anand.service.LogoutService;

@RestController
public class LogoutController {

    @Autowired
    private LogoutService logoutService;

    @PostMapping("/logout")
    public void logout() {
        logoutService.logout();
    }

    @GetMapping("/isLoggedOut")
    public boolean isLoggedOut() {
        return logoutService.isLoggedOut();
    }

    @PostMapping("/redirectToLoginScreen")
    public void redirectToLoginScreen() {
        logoutService.redirectToLoginScreen();
    }
}