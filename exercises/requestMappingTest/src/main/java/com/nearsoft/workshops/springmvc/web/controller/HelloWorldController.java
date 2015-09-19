package com.nearsoft.workshops.springmvc.web.controller;

import com.nearsoft.workshops.springmvc.app.service.SayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

   private final SayHelloService sayHelloService;

   @Autowired
   public HelloWorldController(SayHelloService sayHelloService) {
      this.sayHelloService = sayHelloService;
   }

    @RequestMapping("/helloWorld")
   public String helloWorld(Model model) {
      model.addAttribute("message", sayHelloService.sayHello());
      return "/WEB-INF/helloWorld.jsp";
   }
}
