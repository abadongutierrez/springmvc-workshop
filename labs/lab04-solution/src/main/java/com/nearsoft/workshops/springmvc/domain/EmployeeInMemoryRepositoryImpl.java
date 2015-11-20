package com.nearsoft.workshops.springmvc.domain;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class EmployeeInMemoryRepositoryImpl implements EmployeeRepository {

   private List<Employee> employees = new ArrayList<>();

   public EmployeeInMemoryRepositoryImpl() {
      Employee e = new Employee("Default", "Default", "Default");
      e.setId(UUID.randomUUID().toString());
      employees.add(e);
   }

   @Override
   public List<Employee> findAll() {
      return employees;
   }

   @Override
   public void save(Employee employee) {
      employee.setId(UUID.randomUUID().toString());
      employees.add(employee);
   }

   @Override
   public Employee findById(String id) {
      return employees.stream().filter(e -> id.equals(e.getId())).findFirst().orElse(null);
   }
}
