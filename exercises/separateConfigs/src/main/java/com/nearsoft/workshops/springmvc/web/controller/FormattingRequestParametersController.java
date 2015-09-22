package com.nearsoft.workshops.springmvc.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.Date;

@Controller
@RequestMapping("/formatting")
public class FormattingRequestParametersController {
   private static final Logger LOGGER = LoggerFactory.getLogger(FormattingRequestParametersController.class);

   @RequestMapping(path = "/date/{day}")
   public String formatDate(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date day, Model model) {
      LOGGER.debug("Data: {}", day);
      model.addAttribute("data", day);
      return "showData";
   }

   @RequestMapping(path = "/deposit")
   public String formatAmount(@RequestParam @NumberFormat(pattern = "#,###.##") BigDecimal amount, Model model) {
      LOGGER.debug("Data: {}", amount);
      model.addAttribute("data", amount);
      return "showData";
   }
}
