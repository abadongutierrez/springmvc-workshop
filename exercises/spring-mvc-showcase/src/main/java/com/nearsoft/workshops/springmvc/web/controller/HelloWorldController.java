package com.nearsoft.workshops.springmvc.web.controller;

import com.nearsoft.workshops.springmvc.service.SayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

@Controller
public class HelloWorldController {

   private final SayHelloService sayHelloService;
   private final MessageSource messageSource;

   @Autowired
   public HelloWorldController(SayHelloService sayHelloService, MessageSource messageSource) {
      this.sayHelloService = sayHelloService;
      this.messageSource = messageSource;
   }

   @RequestMapping("/helloWorld")
   public String helloWorld(Model model) {
      model.addAttribute("message", sayHelloService.sayHello());
      return "helloWorld";
   }

   @RequestMapping("/i18n/helloWorld")
   public String i18nHelloWorld(Model model, @RequestParam("lang") String lang) {
      model.addAttribute("message", messageSource.getMessage("helloWorld", null, Locale.forLanguageTag(lang)));
      return "helloWorld";
   }
}
