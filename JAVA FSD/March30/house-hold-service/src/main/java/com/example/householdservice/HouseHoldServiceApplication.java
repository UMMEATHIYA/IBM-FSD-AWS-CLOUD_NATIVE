package com.example.householdservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HouseHoldServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseHoldServiceApplication.class, args);
    }

}
