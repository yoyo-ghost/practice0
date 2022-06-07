package com.example.demo.web.response;

public class EmployeeResponse {
    // あえてpriveteで記述
    private Integer id;
    private String name;
    private String companyName;
    private Integer age;

    // コンストラクタ
    public EmployeeResponse(Integer id, String name, String companyName, Integer age) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
