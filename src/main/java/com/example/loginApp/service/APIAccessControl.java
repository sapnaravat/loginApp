package com.example.loginApp.service;

import com.example.loginApp.model.UserVO;
import com.example.loginApp.repository.UserRepo;

public class APIAccessControl {
    private final UserRepo userRepo;

    public APIAccessControl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public boolean hasPermission(String token, String permission) {
        UserVO user = userRepo.findByToken(token);
        if (user != null) {
            return user.getRoles().stream()
                    .flatMap(role -> role.getPermissions().stream())
                    .anyMatch(p -> p.getName().equals(permission));
        }
        return false;
    }
}
