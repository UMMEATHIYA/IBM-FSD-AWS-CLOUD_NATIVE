package com.example.todoservice.repo;
import com.example.todoservice.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.annotation.Resource;


@Resource
public interface TodoRepository extends JpaRepository<Todo,Integer> {


}