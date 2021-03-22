package com.example.instructortablethymeleafproject.service;

import java.util.List;

import com.example.instructortablethymeleafproject.model.Instructor;
import com.example.instructortablethymeleafproject.repo.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class InstructorServiceImpl implements InstructorService{

    private InstructorRepository instructorRepository;

    @Autowired
    public InstructorServiceImpl(InstructorRepository instructorRepository) {
        super();
        this.instructorRepository = instructorRepository;
    }


    @Override
    public List<Instructor> getAllInstructor() {
        // TODO Auto-generated method stub
        return instructorRepository.findAll();
    }

}