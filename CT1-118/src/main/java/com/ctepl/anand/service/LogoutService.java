package com.ctepl.anand.service;

import org.springframework.stereotype.Service;
import com.ctepl.anand.repository.LogoutRepository;

@Service
public class LogoutService {

    private LogoutRepository logoutRepository;

    public LogoutService(LogoutRepository logoutRepository) {
        this.logoutRepository = logoutRepository;
    }

    public void logout() {
        logoutRepository.logout();
    }

    public boolean isLoggedOut() {
        return logoutRepository.isLoggedOut();
    }

    public void redirectToLoginScreen() {
        logoutRepository.redirectToLoginScreen();
    }
}