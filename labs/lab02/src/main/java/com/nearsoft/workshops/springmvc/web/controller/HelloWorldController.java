package com.nearsoft.workshops.springmvc.web.controller;

import com.nearsoft.workshops.springmvc.service.SayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

@Controller
public class HelloWorldController {

   @RequestMapping("/helloWorld")
   public String helloWorld() {
      return "helloWorld";
   }

   @RequestMapping("/sayHelloTo/{name}")
   public String sayHelloToUsingPathVariable(Model model, @PathVariable String name) {
      model.addAttribute("name", name);
      return "sayHello";
   }

   @RequestMapping("/sayHelloTo")
   public String sayHelloToUsingRequestParam(Model model, @RequestParam String name) {
      model.addAttribute("name", name);
      return "sayHello";
   }
}
