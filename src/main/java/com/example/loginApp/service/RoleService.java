package com.example.loginApp.service;

import com.example.loginApp.model.RoleVO;
import com.example.loginApp.repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    RoleRepo roleRepo;

    public RoleVO getRoleById(int roleId) {
        return roleRepo.findById(roleId).get();
    }
}
