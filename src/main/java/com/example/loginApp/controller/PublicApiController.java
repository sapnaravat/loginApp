package com.example.loginApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicApiController {
    @GetMapping("/public-api")
    public String publicApi() {
        return "This is a public API.";
    }
}
