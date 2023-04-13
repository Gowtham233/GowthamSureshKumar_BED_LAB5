package com.greatlearning.EmployeeMangementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.EmployeeMangementSystem.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
