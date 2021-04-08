package com.example.employeeactivemq.controller;

import com.example.employeeactivemq.exception.EmployeeNotFoundException;
import com.example.employeeactivemq.exception.ErrorResponse;
import com.example.employeeactivemq.model.Employee;
import com.example.employeeactivemq.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

import javax.jms.Queue;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
public class EmployeeController {
    private EmployeeService employeeService;
    private Queue queue;
    private JmsTemplate jmsTemplate;

    @Autowired
    public EmployeeController(EmployeeService employeeService,Queue queue, JmsTemplate jmsTemplate) {
        super();
        this.employeeService = employeeService;
        this.queue = queue;
        this.jmsTemplate = jmsTemplate;
    }

    @GetMapping(path = "/employees", produces = "application/json")
    public ResponseEntity<Collection<Employee>> findAllEmployee() {
        jmsTemplate.convertAndSend(queue, "List of all employees");
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.getAllEmployee());
    }
    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleError(EmployeeNotFoundException e)
    {
        ErrorResponse response=new ErrorResponse();
        response.setErrorMessage(e.getMessage());
        response.setErrorReportTime(System.currentTimeMillis());
        response.setStatusCode(HttpStatus.NOT_FOUND.value());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }
    @GetMapping(path = "/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Integer id) {
        jmsTemplate.convertAndSend(queue,"Finding employee by Id");
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.getEmployeeById(id));
    }


    @PostMapping(path = "/employees", consumes = "application/json", produces = "application/json")

    public ResponseEntity<Employee> createEmplloyee(@RequestBody Employee employee) {
        jmsTemplate.convertAndSend(queue,"Employee Created Successfully");
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.createEmployee(employee));
    }

    @DeleteMapping(path = "employees/{id}")
    public Map<Integer,Boolean> deleteEmployee(@PathVariable(value="id")Integer id){
        Employee employee=employeeService.getEmployeeById(id);
        employeeService.deleteEmployee(id);
        Map <Integer,Boolean> response=new HashMap<>();
        response.put(1,Boolean.TRUE);
        jmsTemplate.convertAndSend(queue,"Employee Deleted");
        return response;
    }
    @PutMapping(path = "/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Integer id,@RequestBody Employee employee)
    {
        jmsTemplate.convertAndSend(queue,"Employee Updated Successfully");
        Employee e=employeeService.updateEmployee(id, employee);
        return ResponseEntity.status(HttpStatus.OK).body(e);
    }

}