package com.example.microservice1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service1")
public class MyController {
    @GetMapping("/hello")
    public ResponseEntity<?> sayHello()
    {
        return ResponseEntity.ok("hello from service1! My name is Umme Athiya");
    }

}