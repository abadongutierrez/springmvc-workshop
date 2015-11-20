package com.nearsoft.workshops.springmvc.web.controller;

import com.nearsoft.workshops.springmvc.domain.Employee;
import com.nearsoft.workshops.springmvc.domain.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("/employees")
public class EmployeesController {

   private final EmployeeService employeeService;

   @Autowired
   public EmployeesController(EmployeeService employeeService) {
      this.employeeService = employeeService;
   }

   @RequestMapping(value = "/new", method = RequestMethod.GET)
   public String create(Employee employee, Model model) {
      return "employees/new";
   }

   @RequestMapping(method = RequestMethod.POST)
   public String save(@Valid Employee employee, BindingResult bindingResult, Model model) {
      if (bindingResult.hasErrors()) {
         return "employees/new";
      }
      employeeService.save(employee);
      model.addAttribute(employee);
      return "redirect:/employees/" + employee.getId();
   }

   @RequestMapping(method = RequestMethod.GET)
   public String list(Model model) {
      model.addAttribute(employeeService.findAll());
      return "employees/list";
   }

   @RequestMapping(value = "/{id}", method = RequestMethod.GET)
   public String view(@PathVariable String id, Model model) {
      model.addAttribute(employeeService.findById(id));
      return "employees/show";
   }

//   @InitBinder
//   public void initBinder(WebDataBinder webDataBinder) {
//      webDataBinder.addCustomFormatter(new SSNFormatter());
//   }
}
