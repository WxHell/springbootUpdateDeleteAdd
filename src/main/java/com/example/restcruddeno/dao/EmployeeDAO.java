package com.example.restcruddeno.dao;

import com.example.restcruddeno.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee>findAll();

    Employee findById(int theId);
    Employee save(Employee theEmployee);
    void deleteById(int theId);

}
