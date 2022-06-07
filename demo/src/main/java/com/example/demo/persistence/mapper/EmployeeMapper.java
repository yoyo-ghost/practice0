package com.example.demo.persistence.mapper;

import com.example.demo.persistence.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    // 全件取得
    @Select("SELECT id, name, company_name, age FROM employee")
    List<Employee> findAll();

}
