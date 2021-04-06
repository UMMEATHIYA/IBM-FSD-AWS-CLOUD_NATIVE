package com.example.productservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
    @RequestMapping(method= RequestMethod.GET)
    String index(){
        return "index";
    }
}
