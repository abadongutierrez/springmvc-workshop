package com.nearsoft.workshops.springmvc.web.controller;

import com.nearsoft.workshops.springmvc.domain.AppConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;

import javax.swing.text.View;
import java.util.Arrays;

@RestController()
@RequestMapping("/configuration")
public class AppConfigController {
   private static final Logger LOGGER = LoggerFactory.getLogger(AppConfigController.class);

   private final WebApplicationContext webApplicationContext;

   @Autowired
   public AppConfigController(WebApplicationContext webApplicationContext) {
      this.webApplicationContext = webApplicationContext;
   }

   @RequestMapping(value = "/spring", method = RequestMethod.GET)
   public ResponseEntity<AppConfig> getBeanNames() {
      AppConfig appConfig = new AppConfig();
      appConfig.setBeanDefinitionCount(webApplicationContext.getBeanDefinitionCount());
      appConfig.setApplicationName(webApplicationContext.getApplicationName());
      appConfig.setBeanNames(webApplicationContext.getBeanDefinitionNames());
      // Infrastructure beans
      appConfig.setHandlerMappingNames(webApplicationContext.getBeanNamesForType(HandlerMapping.class));
      appConfig.setHandlerAdapterNames(webApplicationContext.getBeanNamesForType(HandlerAdapter.class));
      appConfig.setViewResolverNames(webApplicationContext.getBeanNamesForType(ViewResolver.class));
      appConfig.setViewNames(webApplicationContext.getBeanNamesForType(View.class));
      // Dev beans
      appConfig.setControllerNames(webApplicationContext.getBeanNamesForAnnotation(Controller.class));
      appConfig.setServiceNames(webApplicationContext.getBeanNamesForAnnotation(Service.class));
      return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(appConfig);
   }
}
