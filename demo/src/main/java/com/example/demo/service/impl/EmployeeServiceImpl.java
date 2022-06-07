package com.example.demo.service.impl;

import com.example.demo.persistence.entity.Employee;
import com.example.demo.persistence.mapper.EmployeeMapper;
import com.example.demo.service.EmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeMapper employeeMapper;

    // インスタンス化
    public EmployeeServiceImpl(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }
    @Override
    @Transactional(readOnly = true)
    public List<Employee> findAll() {
        List<Employee> employeeList = employeeMapper.findAll();
        return employeeList;
    }
}
