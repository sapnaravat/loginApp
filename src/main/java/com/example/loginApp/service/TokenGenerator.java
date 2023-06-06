package com.example.loginApp.service;

import com.example.loginApp.model.UserVO;
import org.springframework.stereotype.Component;
import java.security.SecureRandom;
import java.util.Base64;

@Component
public class TokenGenerator {
    private static final int TOKEN_LENGTH = 32;

    public String generateToken(UserVO user) {
        String seed = user.getId() + user.getUsername() ;
        byte[] seedBytes = seed.getBytes();

        SecureRandom secureRandom = new SecureRandom(seedBytes);
        byte[] tokenBytes = new byte[TOKEN_LENGTH];
        secureRandom.nextBytes(tokenBytes);

        return Base64.getUrlEncoder().withoutPadding().encodeToString(tokenBytes);
    }
}
