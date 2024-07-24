package com.masai.CollegeDirectoryApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.CollegeDirectoryApplication.model.FacultyProfile;

public interface FacultyProfileRepository extends JpaRepository<FacultyProfile, Long> {

}
