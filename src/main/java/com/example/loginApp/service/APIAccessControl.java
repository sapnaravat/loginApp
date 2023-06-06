package com.example.loginApp.service;

import com.example.loginApp.model.PermissionVO;
import com.example.loginApp.model.RoleVO;
import com.example.loginApp.model.UserVO;
import com.example.loginApp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class APIAccessControl {
    @Autowired
    UserService userService;

    @Autowired
     RoleService roleService;

    @Autowired
     PermissionService permissionService;
    @Bean
    public boolean hasPermission(String token, String permission) {
        UserVO user = userService.getUserByToken(token);
        if (user != null) {
            RoleVO roleVO = roleService.getRoleById(user.getRoleId());
            PermissionVO permissionVO =permissionService.getPermissioById(roleVO.getPermissionId());
            if(permissionVO.getName().equals(permission)){
                return true;
            }
        }
        return false;
    }
}
