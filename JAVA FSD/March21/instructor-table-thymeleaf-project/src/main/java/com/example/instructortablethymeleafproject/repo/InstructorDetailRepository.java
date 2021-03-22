package com.example.instructortablethymeleafproject.repo;


import com.example.instructortablethymeleafproject.model.InstructorDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface InstructorDetailRepository extends JpaRepository<InstructorDetail, Integer>{

}