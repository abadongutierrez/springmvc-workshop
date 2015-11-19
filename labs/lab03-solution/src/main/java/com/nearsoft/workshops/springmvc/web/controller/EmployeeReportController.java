package com.nearsoft.workshops.springmvc.web.controller;

import com.nearsoft.workshops.springmvc.domain.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeReportController {

   @RequestMapping("/employee/report")
   public String generateReport(Model model, HttpServletResponse response) {
      List<Employee> employeeList = new ArrayList<>();
      employeeList.add(new Employee("Manuel Zavaleta", "Java Developer"));
      employeeList.add(new Employee("Victor Torres", "Java Developer"));
      employeeList.add(new Employee("Hector Diaz", "Python Developer"));
      employeeList.add(new Employee("Saidel Lopez", "Android Developer"));
      employeeList.add(new Employee("Juan Najera", "El Master"));

      model.addAttribute("employees", employeeList);

      return "employeeReport";
   }
}
