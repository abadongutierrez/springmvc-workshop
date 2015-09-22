package com.nearsoft.workshops.springmvc.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PathVariablesController {
   private static final Logger LOGGER = LoggerFactory.getLogger(PathVariablesController.class);

   @RequestMapping(path = "/pathVariables/{id}", method = RequestMethod.GET)
   public String extractPathVariableWithoutValidation(@PathVariable long id) {
      LOGGER.debug("Id: {}", id);
      return "empty";
   }

   @RequestMapping(path = "/pathVariables/{id:[\\d]+}", method = RequestMethod.GET)
   public String extractPathVariableWithRegularExpression(@PathVariable long id) {
      LOGGER.debug("Id with regular expression: {}", id);
      return "empty";
   }
}
