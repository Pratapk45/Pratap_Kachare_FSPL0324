package com.simpleProject.Springboot_EmployeeManagementSystem.repository;

import com.simpleProject.Springboot_EmployeeManagementSystem.entity.Designation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesignationReository extends JpaRepository<Designation, Integer> {
}
