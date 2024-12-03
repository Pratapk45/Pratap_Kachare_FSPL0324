package com.simpleProject.Springboot_EmployeeManagementSystem.controller;

import com.simpleProject.Springboot_EmployeeManagementSystem.dto.EmployeeDto;
import com.simpleProject.Springboot_EmployeeManagementSystem.entity.Employee;
import com.simpleProject.Springboot_EmployeeManagementSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.http.HttpStatus.CREATED;

@Controller
@RequestMapping("/ems")
public class EmployeeController {

    @Autowired
    EmployeeService employeeServiceservice;

    @PostMapping("/addData")
    public ResponseEntity<Employee> addEmployee(@RequestBody EmployeeDto employeeDto){
             return new ResponseEntity<>(employeeServiceservice.addEmployee(employeeDto) , CREATED);
    }
}
