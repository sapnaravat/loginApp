package com.example.loginApp.service;

import com.example.loginApp.model.UserVO;
import org.springframework.stereotype.Component;

@Component
public class TokenGenerator {
    public String generateToken(UserVO user) {
        return "generated_token";
    }
}
