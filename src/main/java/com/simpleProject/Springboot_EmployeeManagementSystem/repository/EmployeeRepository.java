package com.simpleProject.Springboot_EmployeeManagementSystem.repository;

import com.simpleProject.Springboot_EmployeeManagementSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
