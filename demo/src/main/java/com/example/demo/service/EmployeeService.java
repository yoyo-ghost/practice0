package com.example.demo.service;

import com.example.demo.persistence.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
