package com.example.loginApp.service;

import com.example.loginApp.model.UserVO;
import com.example.loginApp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    @Autowired
    private  UserService userService;

    @Autowired
    private TokenGenerator tokenGenerator;

    public String login(String username, String password) {
        UserVO user = userService.getUserByUserName(username);
        if(user != null && user.getPassword().equals(password)){
            String token = tokenGenerator.generateToken(user);
            user.setToken(token);
            userService.saveOrUpdateUser(user);
            return token;
        }
        return null;
    }
}
