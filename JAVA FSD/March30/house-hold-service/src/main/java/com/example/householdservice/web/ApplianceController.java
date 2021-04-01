package com.example.householdservice.web;

import java.util.List;
import java.util.Map;

import com.example.householdservice.model.ApplianceEntityDTO;
import com.example.householdservice.service.ApplianceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/appliance")
public class ApplianceController {

    @Autowired
    private ApplianceService applicanceService;

    @GetMapping("/getById/{id}")
    public ApplianceEntityDTO getDetailsById(@PathVariable Integer id) {

        return applicanceService.getById(id);
    }

    @GetMapping("/getByName/{applianceName}")
    public List<ApplianceEntityDTO> getDetailsByName(@PathVariable String name) {

        return applicanceService.getByApplianceName(name);
    }

    @PostMapping("/saveOrUpdate")
    public ApplianceEntityDTO saveOrUpdate(@RequestBody ApplianceEntityDTO applianceEntityDTO) {

        return applicanceService.save(applianceEntityDTO);
    }


     @DeleteMapping("/deleteById/{id}") public Map<String, Boolean> deleteById(@PathVariable Integer id) {
     return applicanceService.deleteById(id); }


}
