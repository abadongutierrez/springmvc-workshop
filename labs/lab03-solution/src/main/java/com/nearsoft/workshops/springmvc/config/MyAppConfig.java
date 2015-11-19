package com.nearsoft.workshops.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.nearsoft.workshops.springmvc.service")
@Configuration
public class MyAppConfig {
}
