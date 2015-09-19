package com.nearsoft.workshops.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.nearsoft.workshops.springmvc.app" })
public class MyAppConfig {
}
