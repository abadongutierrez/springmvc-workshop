package com.nearsoft.workshops.springmvc.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

public class Employee {

   private String id;
   private String name;
   private String lastName;
   private String title;

   public Employee() {

   }

   public Employee(String _name, String _lastName, String _title) {
      this.name = _name;
      this.lastName = _lastName;
      this.title = _title;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }
}
