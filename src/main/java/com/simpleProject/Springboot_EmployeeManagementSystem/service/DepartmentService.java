package com.simpleProject.Springboot_EmployeeManagementSystem.service;

import com.simpleProject.Springboot_EmployeeManagementSystem.dto.DepartmentDto;
import com.simpleProject.Springboot_EmployeeManagementSystem.entity.Department;
import com.simpleProject.Springboot_EmployeeManagementSystem.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public Department addDepartment(DepartmentDto departmentDto) {
        Department department = new Department();
        department.setDepartmentId(0);
        department.setDepartmentName(departmentDto.getDepartmentName());
        department.setCreatedBy(departmentDto.getCreatedBy());
        department.setCreatedDate(LocalDateTime.now());
        department.setUpdatedBy(departmentDto.getUpdatedBy());
        department.setUpdatedDate(LocalDateTime.now());
        return departmentRepository.save(department);
    }
}
