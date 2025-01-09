package com.simpleProject.Springboot_EmployeeManagementSystem.service;

import com.simpleProject.Springboot_EmployeeManagementSystem.dto.DepartmentDto;
import com.simpleProject.Springboot_EmployeeManagementSystem.entity.Department;
import com.simpleProject.Springboot_EmployeeManagementSystem.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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

    public List<Department> getAllDepartment() {
        List<Department> departmentList = departmentRepository.findAll();
        return departmentList;
    }

    public Department deleteDepartment(int departmentId) {
        Optional<Department> optional = departmentRepository.findById(departmentId);
        if(optional.isEmpty()){
            return  null;
        }
        departmentRepository.deleteById(departmentId);
        return optional.get();
    }
}
