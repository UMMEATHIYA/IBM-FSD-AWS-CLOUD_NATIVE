package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BeerModel;
import com.example.demo.service.BeerService;

@RestController
public class BeerController {

    private Environment environment;
    private BeerService beerService;
    @Autowired
    public BeerController(Environment environment, BeerService beerService) {
        super();
        this.environment = environment;
        this.beerService = beerService;
    }
    @GetMapping("/")
    public ResponseEntity<?> getStatus()
    {
        return ResponseEntity.ok("app is up listining on port: "+environment.getProperty("local.server.port"));
    }
    @GetMapping("/beers")
    public ResponseEntity<List<BeerModel>> getAllBeer()
    {
        return ResponseEntity.status(HttpStatus.OK).body(beerService.getAllBeer());
    }
}