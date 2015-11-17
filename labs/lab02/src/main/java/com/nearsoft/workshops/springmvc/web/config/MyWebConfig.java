package com.nearsoft.workshops.springmvc.web.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc // Same as <mvc:annotation-driven />
@ComponentScan(basePackages = "com.nearsoft.workshops.springmvc.web.controller")
@Configuration
public class MyWebConfig extends WebMvcConfigurerAdapter {

   /**
    * This is a bean similar to the following xml config:
    *
    * <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
    *  <property name="prefix" value="/WEB-INF/"/>
    *  <property name="suffix" value=".jsp"/>
    * </bean>
    */
   @Bean
   public ViewResolver jspViewResolver() {
      InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
      viewResolver.setPrefix("/WEB-INF/views/");
      viewResolver.setSuffix(".jsp");
      return viewResolver;
   }

   @Override
   public void addViewControllers(ViewControllerRegistry registry) {
      registry.addViewController("/").setViewName("index");
   }

   @Bean
   public MessageSource messageSource() {
      ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
      messageSource.setCacheSeconds(60);
      messageSource.setBasename("/WEB-INF/messages/global");
      return messageSource;
   }

   /**
    * Similar to:
    * <mvc:default-servlet-handler />
    */
   @Override
   public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
      configurer.enable();
   }
}
