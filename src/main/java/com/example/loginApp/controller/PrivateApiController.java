package com.example.loginApp.controller;

import com.example.loginApp.service.APIAccessControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrivateApiController {
    @Autowired
   APIAccessControl apiAccessControl;

    @GetMapping("/private-api")
    public String privateApi(@RequestHeader("Authorization") String token) {
        if (apiAccessControl.hasPermission(token, "private_api_permission")) {
            return "This is a private API.";
        }
        return "Access denied.";
    }

}
