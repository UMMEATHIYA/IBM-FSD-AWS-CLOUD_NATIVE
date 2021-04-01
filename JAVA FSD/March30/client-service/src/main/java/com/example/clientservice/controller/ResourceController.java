package com.example.clientservice.controller;

import java.util.List;
import java.util.Map;

import com.example.clientservice.dto.ApplianceUserDto;
import com.example.clientservice.feignService.ResourceFeignService;
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
public class ResourceController {

    @Autowired
    private ResourceFeignService resourceFeignService;

    @GetMapping("/getById/{id}")
    public ApplianceUserDto getDetailsById(@PathVariable Integer id) {

        return resourceFeignService.getById(id);
    }

    @GetMapping("/getByName/{applianceName}")
    public List<ApplianceUserDto> getDetailsByName(@PathVariable String name) {

        return resourceFeignService.getByApplianceName(name);
    }

    @PostMapping("/saveOrUpdate")
    public ApplianceUserDto saveOrUpdate(@RequestBody ApplianceUserDto applianceEntityDTO) {

        return resourceFeignService.save(applianceEntityDTO);
    }

    /*
     * @DeleteMapping("/deleteById/{id}") public Map<String, Boolean>
     * deleteById(@PathVariable Integer id) {
     *
     * return resourceFeignService.deleteById(id); }
     */

}
