package com.simpleProject.Springboot_EmployeeManagementSystem.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EmployeeDto {
    private String employeeName;
    private String email;
    private double sal;

    private boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedDate;
}
