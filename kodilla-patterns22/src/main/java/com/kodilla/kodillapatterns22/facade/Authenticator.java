package com.kodilla.kodillapatterns22.facade;

import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class Authenticator {
    public boolean isAuthenticated(Long userId) {
        Random random = new Random();
        return random.nextBoolean();
    }
}
