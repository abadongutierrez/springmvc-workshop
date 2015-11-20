package com.nearsoft.workshops.springmvc.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

   private final EmployeeRepository employeeRepository;

   @Autowired
   public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
      this.employeeRepository = employeeRepository;
   }

   @Override
   public List<Employee> findAll() {
      return employeeRepository.findAll();
   }

   @Override
   public void save(Employee employee) {
      employeeRepository.save(employee);
   }

   @Override
   public Employee findById(String id) {
      return employeeRepository.findById(id);
   }
}
