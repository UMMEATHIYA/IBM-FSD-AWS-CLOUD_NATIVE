package com.example.springmysqlcountrymarch26project.controller;

import com.example.springmysqlcountrymarch26project.model.City;
import com.example.springmysqlcountrymarch26project.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/api")
public class CityController {

    @Autowired
    private CityRepository cityRepository;


    @GetMapping("/city")
    public List<City> getCities() {
        return cityRepository.findAll();
    }

    @GetMapping("/city/{id}")
    public ResponseEntity <City> getCityById(
            @PathVariable(value = "id") long cityId) throws ResourceNotFoundException {
        City user = cityRepository.findById(cityId)
                .orElseThrow(() -> new ResourceNotFoundException("Country not found :: " + cityId));
        return ResponseEntity.ok().body(user);
    }

    @PostMapping("/city")
    public City createUser(@Valid @RequestBody City city) {
        return cityRepository.save(city);
    }

    @PutMapping("/city/{id}")
    public ResponseEntity <City> updateUser(
            @PathVariable(value = "id") Long cityId,
            @Valid @RequestBody City cityDetails) throws ResourceNotFoundException {
        City city = cityRepository.findById(cityId)
                .orElseThrow(() -> new ResourceNotFoundException("Country/City not found :: " + cityId));
        city.setNAME(cityDetails.getNAME());
        final City updatedCity = cityRepository.save(city);
        return ResponseEntity.ok(updatedCity);
    }

    @DeleteMapping("/city/{id}")
    public Map < String, Boolean > deleteCity(
            @PathVariable(value = "id") Long cityId) throws ResourceNotFoundException {
       City city = cityRepository.findById(cityId)
                .orElseThrow(() -> new ResourceNotFoundException("Country not found :: " + cityId));

        cityRepository.delete(city);
        Map < String, Boolean > response = new HashMap < > ();
       response.put("deleted", Boolean.TRUE);
     return response;
    }



}