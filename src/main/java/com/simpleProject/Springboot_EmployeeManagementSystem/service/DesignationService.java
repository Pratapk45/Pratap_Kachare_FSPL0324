package com.simpleProject.Springboot_EmployeeManagementSystem.service;

import com.simpleProject.Springboot_EmployeeManagementSystem.dto.DesignationDto;
import com.simpleProject.Springboot_EmployeeManagementSystem.entity.Designation;
import com.simpleProject.Springboot_EmployeeManagementSystem.repository.DesignationReository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DesignationService {

    @Autowired
    DesignationReository designationReository;

    public Designation addDesignation(DesignationDto designationDto) {

        Designation designation=new Designation();

        designation.setDesignationId(0);
        designation.setDesignationName(designationDto.getDesignationName());

        designation.setCreatedBy(designationDto.getCreatedBy());
        designation.setCreatedDate(LocalDateTime.now());
        designation.setUpdatedBy(designationDto.getUpdatedBy());
        designation.setUpdatedDate(LocalDateTime.now());

        return designationReository.save(designation);
    }
}
