package com.example.employee.controller;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.script.ScriptTemplateConfig;


import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    // Add Employee
    @PostMapping
    public Employee addEmployee(@Valid @RequestBody Employee employee) {
        return service.addEmployee(employee);
    }

    // Get All Employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(
            @PathVariable Long id,
            @RequestBody Employee employee){
        return service.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id){
        return service.deleteEmployee(id);
    }

    @GetMapping("/analytics/average-salary")
    public Double getAvarageSalary(){
        return service.getAverageSalary();

    }

    @GetMapping("/analutics/department-count")
    public List<Object[]>getDepartmentCount(){
        return service.getEmployeeCountByDepartment();
    }
    @GetMapping("/analytics/highest-salary")
    public Employee getHighestSalary() {
        return service.getHighestSalaryEmployee();
    }

    @GetMapping("/analytics/lowest-salary")
    public Employee getLowestSalary() {
        return service.getLowestSalaryEmployee();
    }

}