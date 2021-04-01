package com.example.householdservice.repository;

import java.util.List;

import com.example.householdservice.model.ApplianceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ApplianceRepository extends JpaRepository<ApplianceEntity,Integer>{

    @Query("SELECT details FROM ApplianceEntity details WHERE details.brand=?1")
    List<ApplianceEntity> findByApplianceName(String name);

}