package com.nearsoft.workshops.springmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelTxtController {

   @RequestMapping("/txt")
   public String renderTxt(Model model) {
      model.addAttribute("name", "your-name");
      model.addAttribute("lastName", "your-lastName");
      return "txtView";
   }
}
