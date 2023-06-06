package com.example.loginApp.service;

import com.example.loginApp.model.PermissionVO;
import com.example.loginApp.repository.PermissionRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class PermissionService {
    @Autowired
    PermissionRepo permissionRepo;
    public PermissionVO getPermissioById(int id){
        return permissionRepo.findById(id).get();
    }
}
