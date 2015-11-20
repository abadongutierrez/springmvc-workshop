package com.nearsoft.workshops.springmvc.domain;

import java.util.List;

public interface EmployeeRepository {
   List<Employee> findAll();

   void save(Employee employee);

   Employee findById(String id);
}
