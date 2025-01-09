package com.simpleProject.Springboot_EmployeeManagementSystem.service;

import com.simpleProject.Springboot_EmployeeManagementSystem.dto.DesignationDto;
import com.simpleProject.Springboot_EmployeeManagementSystem.entity.Designation;
import com.simpleProject.Springboot_EmployeeManagementSystem.repository.DesignationReository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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

    public List<Designation> getAllDesignation() {
        List<Designation> designationList = designationReository.findAll();
        return designationList;
    }

    public Designation deleteDesihnation(int designationId) {
        Optional<Designation> optional = designationReository.findById(designationId);
        if(optional.isEmpty()){
            return null;
        }
        designationReository.deleteById(designationId);
        return optional.get();
    }
}
