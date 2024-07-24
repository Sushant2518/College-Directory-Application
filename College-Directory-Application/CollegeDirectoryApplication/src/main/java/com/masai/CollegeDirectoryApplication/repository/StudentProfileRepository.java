package com.masai.CollegeDirectoryApplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.CollegeDirectoryApplication.model.StudentProfile;

public interface StudentProfileRepository extends JpaRepository<StudentProfile, Long> {
	List<StudentProfile> findByUser_NameContainingAndDepartment_NameContainingAndYearContaining(
            String name, String department, String year);
}
