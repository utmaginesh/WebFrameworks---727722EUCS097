package com.example.cw1.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig{
    @Value("${spring.application.name}")
    public String appName;
    @Value("${app.version}")
    public String appVersion;

}
