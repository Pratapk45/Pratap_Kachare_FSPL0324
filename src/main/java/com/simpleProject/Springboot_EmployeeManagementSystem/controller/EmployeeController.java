package com.simpleProject.Springboot_EmployeeManagementSystem.controller;

import com.simpleProject.Springboot_EmployeeManagementSystem.dto.EmployeeDto;
import com.simpleProject.Springboot_EmployeeManagementSystem.entity.Employee;
import com.simpleProject.Springboot_EmployeeManagementSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/ems")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addData")
    public ResponseEntity<Employee> addEmployee(@RequestBody EmployeeDto employeeDto) {
        return new ResponseEntity<>(employeeService.addEmployee(employeeDto), CREATED);
    }

    @GetMapping("/getAllEmployee")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        return new ResponseEntity<>(employeeService.getAllEmployee(),HttpStatus.FOUND);
    }

    @DeleteMapping("/deleteEmployee")
    public ResponseEntity<Employee> deleteEmployee(@RequestParam long employeeId){
        return new ResponseEntity<>(employeeService.deleteEmployee(employeeId) , HttpStatus.OK);
    }

}
