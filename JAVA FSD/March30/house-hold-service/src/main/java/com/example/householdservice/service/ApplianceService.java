package com.example.householdservice.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.householdservice.model.ApplianceEntity;
import com.example.householdservice.model.ApplianceEntityDTO;
import com.example.householdservice.repository.ApplianceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

@Service
public class ApplianceService {

    @Autowired
    private ApplianceRepository applianceRepository;

    @Transactional
    public ApplianceEntityDTO save(ApplianceEntityDTO applianceEntityDTO) {

        try {
            ApplianceEntity applianceEntity = new ApplianceEntity();
            applianceEntity.setBrand(applianceEntityDTO.getBrand());
            applianceEntity.setModel(applianceEntityDTO.getModel());
            applianceEntity.setStatus(applianceEntityDTO.getStatus());
            return getDetails(applianceRepository.save(applianceEntity));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public ApplianceEntityDTO getById(Integer serialId) {
        return getDetails(applianceRepository.getOne(serialId));
    }

    public List<ApplianceEntityDTO> getByApplianceName(String applianceName) {

        List<ApplianceEntity> applianceEntityList = applianceRepository.findByApplianceName(applianceName);
        if (CollectionUtils.isEmpty(applianceEntityList)) {
            return null;
        }
        return applianceEntityList.stream().map(this::getDetails).collect(Collectors.toList());
    }

    public ApplianceEntityDTO getDetails(ApplianceEntity applianceEntity) {
        return new ApplianceEntityDTO(
                applianceEntity.getSerialnumber(),
                applianceEntity.getBrand(),
                applianceEntity.getModel(),
                applianceEntity.getStatus()
        );
    }


    public Map<String, Boolean> deleteById(Integer id){

        ApplianceEntity applianceEntity = applianceRepository.findById(id) .orElseThrow(() -> new ResourceNotFoundException("Appliance not found for this id :: " + id));

        applianceRepository.delete(applianceEntity); Map<String, Boolean> response = new HashMap<>(); response.put("deleted", Boolean.TRUE); return response;
    }

}