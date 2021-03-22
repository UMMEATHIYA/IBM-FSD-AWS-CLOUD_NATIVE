package com.example.htmltablesthymeleafdemo.Controller;
import com.example.htmltablesthymeleafdemo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")

public class EmployeeController {
    @GetMapping("/list")
    public String listEmployees(Model theModel){
        Employee emp1 = new Employee(1,"Lisa","Andrews","lisa@email.com");
        Employee emp2 = new Employee(2,"annu","sam","sam@email.com");
        Employee emp3 = new Employee(3,"RAM","kumar","ram@email.com");

        List<Employee> theEmployees = new ArrayList<>();

        theEmployees.add(emp1);
        theEmployees.add(emp2);
        theEmployees.add(emp3);

        theModel.addAttribute("employees",theEmployees);

        return "list-employees";
    }
}
