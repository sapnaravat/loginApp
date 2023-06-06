package com.example.loginApp.service;

import com.example.loginApp.model.UserVO;
import com.example.loginApp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.loginApp.repository.UserRepo.*;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public UserVO getUserByToken(String token){
        return userRepo.findByToken(token);
    }

    public UserVO getUserByUserName(String username){
        return userRepo.findByUsername(username);
    }

    public void saveOrUpdateUser(UserVO user) {
        userRepo.save(user);
    }
}
