package com.nearsoft.workshops.springmvc.domain;

public class Employee {
   private String name;
   private String title;

   public Employee(String name, String title) {
      this.name = name;
      this.title = title;
   }

   public String getName() {
      return name;
   }

   public String getTitle() {
      return title;
   }
}
