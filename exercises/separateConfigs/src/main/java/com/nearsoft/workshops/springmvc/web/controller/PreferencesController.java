package com.nearsoft.workshops.springmvc.web.controller;

import com.nearsoft.workshops.springmvc.domain.Preferences;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/preferences")
public class PreferencesController {

   private static final Logger LOGGER = LoggerFactory.getLogger(PreferencesController.class);

   @RequestMapping(path = "/new", method = RequestMethod.GET)
   private String newPreferences() {
      return "preferences/new";
   }

   // Spring can 'inject' form values to the Preferences object and the tooltip argument.
   @RequestMapping(path = "/save", method = RequestMethod.POST)
   private String save(Preferences preferences, String tooltip, Model model) {
      // save the preferences
      LOGGER.debug("Preferences: {}", preferences);
      LOGGER.debug("Tooltip: {}", tooltip);
      model.addAttribute(preferences);
      return "preferences/show";
   }
}
