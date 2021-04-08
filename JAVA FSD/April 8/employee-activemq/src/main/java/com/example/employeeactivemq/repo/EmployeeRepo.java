package com.example.employeeactivemq.repo;


import com.example.employeeactivemq.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;



public interface EmployeeRepo{

    public Collection<Employee> getAllEmployee();

    public Employee getEmployeeById(Integer id);

    public Employee updateEmployee(Integer id,Employee employee);

    public Employee createEmployee(Employee employee);

    public void deleteEmployee(Integer id);
    public void deleteAllEmployees();
}
