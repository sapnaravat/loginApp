package com.example.loginApp.service;

import com.example.loginApp.model.UserVO;
import com.example.loginApp.repository.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    private final UserRepo userRepo;
    private final TokenGenerator tokenGenerator;

    public AuthenticationService(UserRepo userRepo, TokenGenerator tokenGenerator) {
        this.userRepo = userRepo;
        this.tokenGenerator = tokenGenerator;
    }

    public String login(String username, String password) {
        UserVO user = userRepo.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            String token = tokenGenerator.generateToken(user);
            // Save the token in the database or cache
            return token;
        }
        return null;
    }
}
