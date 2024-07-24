package com.masai.CollegeDirectoryApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.CollegeDirectoryApplication.model.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {

}
