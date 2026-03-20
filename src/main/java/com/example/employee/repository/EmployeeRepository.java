package com.example.employee.repository;

import com.example.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT AVG(e.salary) FROM Employee e")
    Double getAverageSalary();

    @Query("SELECT e.department, COUNT(e) FROM Employee e GROUP BY e.department")
    List<Object[]> getEmployeeCountByDepartment();

    @Query("SELECT e FROM Employee e WHERE e.salary = (SELECT MAX(e.salary) FROM Employee e)")
    Employee getHighestSalaryEmployee();

    @Query("SELECT e FROM Employee e WHERE e.salary = (SELECT MIN(e.salary) FROM Employee e)")
    Employee getLowestSalaryEmployee();
}


