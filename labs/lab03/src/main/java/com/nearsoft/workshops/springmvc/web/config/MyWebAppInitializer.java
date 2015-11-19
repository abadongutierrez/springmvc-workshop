package com.nearsoft.workshops.springmvc.web.config;

import com.nearsoft.workshops.springmvc.config.MyAppConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class MyWebAppInitializer implements WebApplicationInitializer {
   @Override
   public void onStartup(ServletContext servletContext) throws ServletException {
      AnnotationConfigWebApplicationContext rootAppContext = new AnnotationConfigWebApplicationContext();
      rootAppContext.register(MyAppConfig.class);

      servletContext.addListener(new ContextLoaderListener(rootAppContext));

      AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
      webApplicationContext.register(MyWebConfig.class);

      ServletRegistration.Dynamic dispatcher =
            servletContext.addServlet("myAwesomeApp", new DispatcherServlet(webApplicationContext));
      dispatcher.setLoadOnStartup(1);
      dispatcher.addMapping("/");
   }
}
