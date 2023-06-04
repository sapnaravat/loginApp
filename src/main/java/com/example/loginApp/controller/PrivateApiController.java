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
    private APIAccessControl apiAccessControl;

    @GetMapping("/private-api")
    public String privateApi(@RequestHeader("Authorization") String token) {
        String extractedToken = extractToken(token);
        if (apiAccessControl.hasPermission(extractedToken, "private_api_permission")) {
            return "This is a private API.";
        }
        return "Access denied.";
    }

    private String extractToken(String header) {
        String[] parts = header.split(" ");
        if (parts.length == 2 && parts[0].equals("Bearer")) {
            return parts[1];
        }
        return null;
    }
}
