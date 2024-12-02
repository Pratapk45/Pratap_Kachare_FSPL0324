package com.simpleProject.Springboot_EmployeeManagementSystem.repository;

import com.simpleProject.Springboot_EmployeeManagementSystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
