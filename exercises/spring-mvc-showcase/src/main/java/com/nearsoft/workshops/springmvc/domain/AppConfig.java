package com.nearsoft.workshops.springmvc.domain;

import java.io.Serializable;

public class AppConfig implements Serializable {
   private String[] beanNames;
   private String[] controllerNames;
   private String[] handlerAdapterNames;
   private String[] handlerMappingNames;
   private String[] viewResolverNames;
   private String[] serviceNames;
   private String[] viewNames;
   private int beanDefinitionCount;
   private String applicationName;

   public String[] getBeanNames() {
      return beanNames;
   }

   public void setBeanNames(String[] beanNames) {
      this.beanNames = beanNames;
   }

   public void setControllerNames(String[] controllerNames) {
      this.controllerNames = controllerNames;
   }

   public String[] getControllerNames() {
      return controllerNames;
   }

   public void setHandlerAdapterNames(String[] handlerAdapterNames) {
      this.handlerAdapterNames = handlerAdapterNames;
   }

   public String[] getHandlerAdapterNames() {
      return handlerAdapterNames;
   }

   public void setHandlerMappingNames(String[] handlerMappingNames) {
      this.handlerMappingNames = handlerMappingNames;
   }

   public String[] getHandlerMappingNames() {
      return handlerMappingNames;
   }

   public void setViewResolverNames(String[] viewResolverNames) {
      this.viewResolverNames = viewResolverNames;
   }

   public String[] getViewResolverNames() {
      return viewResolverNames;
   }

   public void setServiceNames(String[] serviceNames) {
      this.serviceNames = serviceNames;
   }

   public String[] getServiceNames() {
      return serviceNames;
   }

   public void setViewNames(String[] viewNames) {
      this.viewNames = viewNames;
   }

   public String[] getViewNames() {
      return viewNames;
   }

   public void setBeanDefinitionCount(int beanDefinitionCount) {
      this.beanDefinitionCount = beanDefinitionCount;
   }

   public int getBeanDefinitionCount() {
      return beanDefinitionCount;
   }

   public void setApplicationName(String applicationName) {
      this.applicationName = applicationName;
   }

   public String getApplicationName() {
      return applicationName;
   }
}
