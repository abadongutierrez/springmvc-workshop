package com.nearsoft.workshops.springmvc.domain;

public class SocialSecurityNumber {

   private String areaNumber;
   private String groupNumber;
   private String serialNumber;

   public String getAreaNumber() {
      return areaNumber;
   }

   public void setAreaNumber(String areaNumber) {
      this.areaNumber = areaNumber;
   }

   public String getGroupNumber() {
      return groupNumber;
   }

   public void setGroupNumber(String groupNumber) {
      this.groupNumber = groupNumber;
   }

   public String getSerialNumber() {
      return serialNumber;
   }

   public void setSerialNumber(String serialNumber) {
      this.serialNumber = serialNumber;
   }
}
