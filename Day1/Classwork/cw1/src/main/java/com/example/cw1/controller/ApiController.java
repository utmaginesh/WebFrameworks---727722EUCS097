package com.example.cw1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ApiController {
    @GetMapping("/welcome")
    public String getMethodName(){
        return  "Welcome Spring Boot!";
    }
}
