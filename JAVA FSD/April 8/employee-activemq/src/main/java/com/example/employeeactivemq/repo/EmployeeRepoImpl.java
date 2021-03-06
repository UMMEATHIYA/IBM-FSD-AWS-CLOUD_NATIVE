package com.example.employeeactivemq.repo;


import com.example.employeeactivemq.exception.EmployeeNotFoundException;
import com.example.employeeactivemq.model.Employee;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class EmployeeRepoImpl implements EmployeeRepo {
    private EmployeeRepo employeeRepo;
    private Map<Integer, Employee> employeeMap;
    {
        employeeMap=new HashMap<Integer, Employee>();
        employeeMap.put(1, new Employee(UUID.randomUUID().toString(), "John", "Doe", "john@email.com"));
        employeeMap.put(2, new Employee(UUID.randomUUID().toString(), "Marry", "Public", "marry@email.com"));
        employeeMap.put(3, new Employee(UUID.randomUUID().toString(), "Rahul", "Dravid", "rahul@email.com"));
        employeeMap.put(4, new Employee(UUID.randomUUID().toString(), "Sourav", "Ganguly", "sourav@email.com"));
    }
    @Override
    public Collection<Employee> getAllEmployee() {
        // TODO Auto-generated method stub
        return employeeMap.values();
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        // TODO Auto-generated method stub
        Employee employee=employeeMap.get(id);
        if(employee==null)
        {
            throw new EmployeeNotFoundException("no such employee found");
        }
        return employee;
    }
    @Override
    public Employee createEmployee(Employee employee) {
        employee.setEmployeeId(UUID.randomUUID().toString());
        employeeMap.put(employeeMap.size()+1,employee);
        return employee;
    }
    @Override
    public void deleteEmployee(Integer id){
        Employee employee=employeeMap.get(id);
        if(employee==null){
            throw new EmployeeNotFoundException("no such employee found");
        }else{
            employeeMap.remove(id);
        }
    }
    @Override
    public Employee updateEmployee(Integer id,Employee employee) {
        Employee tempEmployee=employeeMap.get(id);
        if(tempEmployee==null)
        {
            throw new EmployeeNotFoundException("no employee found with the given id: "+id);
        }
        tempEmployee.setFirstName(employee.getFirstName());
        tempEmployee.setLastName(employee.getLastName());
        tempEmployee.setEmail(employee.getEmail());
        employeeMap.remove(id);
        employeeMap.put(id, tempEmployee);
        return tempEmployee;
    }


    @Override
    public void deleteAllEmployees() {
        // TODO Auto-generated method stub
        employeeMap.remove(employeeMap.size()-1);
    }

}