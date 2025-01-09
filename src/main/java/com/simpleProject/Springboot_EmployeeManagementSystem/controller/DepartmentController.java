package com.simpleProject.Springboot_EmployeeManagementSystem.controller;

import com.simpleProject.Springboot_EmployeeManagementSystem.dto.DepartmentDto;
import com.simpleProject.Springboot_EmployeeManagementSystem.entity.Department;
import com.simpleProject.Springboot_EmployeeManagementSystem.entity.Employee;
import com.simpleProject.Springboot_EmployeeManagementSystem.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@Controller
@RequestMapping("/ems")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/addDepartment")
    public ResponseEntity<Department> addDepartment(@RequestBody DepartmentDto departmentDto){
        return new ResponseEntity<>(departmentService.addDepartment(departmentDto) , CREATED);
    }

    @GetMapping("/getAllDepartment")
    public ResponseEntity<List<Department>> getAllDepartment()
    {
        return new ResponseEntity<>(departmentService.getAllDepartment(), HttpStatus.FOUND);
    }
       @DeleteMapping("/Delete")
    public ResponseEntity<Department> deleteDepartment(@RequestParam int departmentId){
        return new ResponseEntity<>(departmentService.deleteDepartment(departmentId) , HttpStatus.OK);
    }
}
