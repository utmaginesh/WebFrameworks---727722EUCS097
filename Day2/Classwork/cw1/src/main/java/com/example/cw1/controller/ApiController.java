package com.example.cw1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cw1.config.AppConfig;

@RestController
public class ApiController {
    @Autowired
    public AppConfig config;
    @GetMapping("/info")
    public String getControlString(){
        return "App Name: " + config.appName + ", Version: " + config.appVersion;
    }
}
