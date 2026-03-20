package com.example.employee.service;

import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public Employee addEmployee(Employee employee) {
        return repo.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    public Employee updateEmployee(Long id, Employee updatedEmployee){

        Employee employee = repo.findById(id).orElseThrow(()-> new RuntimeException("Employee not found"));

        employee.setName(updatedEmployee.getName());
        employee.setEmail(updatedEmployee.getEmail());
        employee.setDepartment(updatedEmployee.getDepartment());
        employee.setSalary(updatedEmployee.getSalary());

        return  repo.save(employee);
    }

    public String deleteEmployee(Long id){

        Employee employee = repo.findById(id).orElseThrow(()-> new RuntimeException("Employee not found"));

        repo.delete(employee);
        return "Employee record is deleted";
    }

    public Double getAverageSalary() {
        return repo.getAverageSalary();
    }

    public List<Object[]> getEmployeeCountByDepartment() {
        return repo.getEmployeeCountByDepartment();
    }
    public Employee getHighestSalaryEmployee() {
        return repo.getHighestSalaryEmployee();
    }

    public Employee getLowestSalaryEmployee() {
        return repo.getLowestSalaryEmployee();
    }

}