package com.nearsoft.workshops.springmvc.web.controller;

import com.nearsoft.workshops.springmvc.domain.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeesController {

   private final EmployeeService employeeService;

   @Autowired
   public EmployeesController(EmployeeService employeeService) {
      this.employeeService = employeeService;
   }


//   @InitBinder
//   public void initBinder(WebDataBinder webDataBinder) {
//      webDataBinder.addCustomFormatter(new SSNFormatter());
//   }
}
