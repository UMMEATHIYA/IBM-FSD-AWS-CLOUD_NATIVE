package com.example.instructortablethymeleafproject.service;

import com.example.instructortablethymeleafproject.model.Instructor;
import com.example.instructortablethymeleafproject.model.InstructorDetail;
import com.example.instructortablethymeleafproject.repo.InstructorDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InstructorDetailServiceImpl implements InstructorDetailsService{
    private InstructorDetailRepository instructordetailRepository;

    @Autowired
    public InstructorDetailServiceImpl(InstructorDetailRepository instructordetailRepository) {
        super();
        this.instructordetailRepository = instructordetailRepository;
    }


    @Override
    public List<InstructorDetail> getAllInstructors() {
        return instructordetailRepository.findAll();
    }

}
