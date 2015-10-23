package com.nearsoft.workshops.springmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoViewController {

   @RequestMapping("/noview")
   private String get() {
      return "noview";
   }
}
