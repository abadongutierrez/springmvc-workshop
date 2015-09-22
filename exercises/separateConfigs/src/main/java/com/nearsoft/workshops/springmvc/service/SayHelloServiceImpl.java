package com.nearsoft.workshops.springmvc.service;

import org.springframework.stereotype.Service;

@Service
public class SayHelloServiceImpl implements SayHelloService {
   @Override
   public String sayHello() {
      return "Hello World!";
   }
}
