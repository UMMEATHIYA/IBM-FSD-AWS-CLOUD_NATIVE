package com.example.todoservice.controller;

import com.example.todoservice.model.Todo;
import com.example.todoservice.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TodoController {

    private Environment environment;
    private TodoService todoService;

    @Autowired
    public TodoController(Environment environment, TodoService todoService) {
        this.environment = environment;
        this.todoService = todoService;
    }

    @GetMapping("/status")
    public ResponseEntity<String> getStatus()
    {
        return ResponseEntity.ok("service is up and listining on port"+environment.getProperty("local.server.port"));
    }
    @GetMapping("/todos")
    public ResponseEntity<List<Todo>> getAllTodos()
    {
        return ResponseEntity.ok(todoService.getAllTodos());
    }
    @PostMapping("/todos")
    public ResponseEntity<?> createTodo(@RequestBody Todo todo)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(todoService.createTodo(todo));
    }


}


