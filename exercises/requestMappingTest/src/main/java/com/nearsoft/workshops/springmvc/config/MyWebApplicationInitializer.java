package com.nearsoft.workshops.springmvc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class MyWebApplicationInitializer implements WebApplicationInitializer {

   @Override
   public void onStartup(ServletContext servletContext) throws ServletException {
      servletContext.setInitParameter("contextConfigLocation", "classpath:/META-INF/spring/app-config.xml");
      servletContext.addListener(ContextLoaderListener.class);

      ServletRegistration.Dynamic registration =
            servletContext.addServlet("myapp", new DispatcherServlet());
      registration.setLoadOnStartup(1);
      registration.addMapping("/myapp/*");
      registration.setInitParameter("contextConfigLocation", "/WEB-INF/spring/web-config.xml");
   }
}