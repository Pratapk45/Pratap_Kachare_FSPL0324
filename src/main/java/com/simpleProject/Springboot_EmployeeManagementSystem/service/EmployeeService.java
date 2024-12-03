package com.simpleProject.Springboot_EmployeeManagementSystem.service;

import com.simpleProject.Springboot_EmployeeManagementSystem.dto.EmployeeDto;
import com.simpleProject.Springboot_EmployeeManagementSystem.entity.Employee;
import com.simpleProject.Springboot_EmployeeManagementSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee addEmployee(EmployeeDto employeeDto) {
        Employee employee =new Employee();
         employee.setEmployeeId(0L);
         employee.setEmployeeName(employeeDto.getEmployeeName());
         employee.setEmail(employeeDto.getEmail());
         employee.setSal(employeeDto.getSal());

         employee.setCreatedBy(employeeDto.getCreatedBy());
         employee.setCreatedDate(LocalDateTime.now());
         employee.setUpdatedBy(employeeDto.getUpdatedBy());
         employee.setUpdatedDate(LocalDateTime.now());
         return employeeRepository.save(employee);
    }
}
