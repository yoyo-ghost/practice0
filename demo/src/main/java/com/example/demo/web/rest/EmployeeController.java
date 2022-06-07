package com.example.demo.web.rest;

import com.example.demo.persistence.entity.Employee;
import com.example.demo.service.EmployeeService;
import com.example.demo.web.response.EmployeeResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
    // コンポーネントする
    private final EmployeeService employeeService;

    // コンストラクタ
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<EmployeeResponse> findAll() {
        List<Employee> employeeList = employeeService.findAll();

        // 型の変換
        // 全件のデータをリストへ格納
        List<EmployeeResponse> employeeResponseList = new ArrayList<>();
        for (Employee employee : employeeList) {
            EmployeeResponse employeeResponse = new EmployeeResponse(
                    employee.getId(),
                    employee.getName(),
                    employee.getCompanyName(),
                    employee.getAge());

            employeeResponseList.add(employeeResponse);
        }
        // レスポンスリストを戻り値
        return employeeResponseList;
    }



}
