package com.example.instructortablethymeleafproject.controller;

import java.util.List;


import com.example.instructortablethymeleafproject.model.Instructor;
import com.example.instructortablethymeleafproject.model.InstructorDetail;
import com.example.instructortablethymeleafproject.service.InstructorDetailsService;
import com.example.instructortablethymeleafproject.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/instructors")
public class InstructorController {

    private InstructorService instructorService;
    private InstructorDetailsService instructordetailService;

    @Autowired
    public InstructorController(InstructorService instructorService, InstructorDetailsService instructordetailService) {
        super();
        this.instructorService = instructorService;
        this.instructordetailService = instructordetailService;
    }

    @GetMapping("/list")
    public String getInstructors(Model model)
    {
        List<Instructor> list=instructorService.getAllInstructor();
        model.addAttribute("instructors", list);
        return "list-instructors";
    }
    @GetMapping("/lists")
    public String getInstructors1(Model model)
    {
        List<InstructorDetail> list1=instructordetailService.getAllInstructors();
        model.addAttribute("instructors", list1);
        return "list-instructor-details";
    }
}
