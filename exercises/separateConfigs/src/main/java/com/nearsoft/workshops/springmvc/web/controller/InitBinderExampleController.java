package com.nearsoft.workshops.springmvc.web.controller;

import com.nearsoft.workshops.springmvc.domain.Preferences;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.util.Locale;

@Controller
@RequestMapping("/binder")
public class InitBinderExampleController {
   private static final Logger LOGGER = LoggerFactory.getLogger(FormattingRequestParametersController.class);

   @InitBinder
   private void initBinder(WebDataBinder webDataBinder) {
      webDataBinder.addCustomFormatter(new Formatter<Preferences>() {
         @Override
         public Preferences parse(String s, Locale locale) throws ParseException {
            String[] split = s.split("-");
            Preferences preferences = new Preferences();
            preferences.setTooltip(split[0]);
            preferences.setLanguage(split[1]);
            return preferences;
         }

         @Override
         public String print(Preferences preferences, Locale locale) {
            return null;
         }
      });
   }

   @RequestMapping("/preferences")
   public String example(@RequestParam("values") Preferences preferences, Model model) {
      LOGGER.debug("Preferences: {}", preferences);
      model.addAttribute("data", preferences);
      return "showData";
   }
}
