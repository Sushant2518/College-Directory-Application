package com.masai.CollegeDirectoryApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.CollegeDirectoryApplication.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
