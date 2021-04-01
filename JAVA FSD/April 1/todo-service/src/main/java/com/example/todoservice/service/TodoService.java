package com.example.todoservice.service;


import com.example.todoservice.model.Todo;

import java.util.List;

public interface TodoService {
    public List<Todo> getAllTodos();

    public Todo createTodo(Todo todo);
}