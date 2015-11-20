package com.nearsoft.workshops.springmvc.domain;

import java.util.List;

public interface EmployeeService {
   List<Employee> findAll();

   void save(Employee employee);

   Employee findById(String id);
}
