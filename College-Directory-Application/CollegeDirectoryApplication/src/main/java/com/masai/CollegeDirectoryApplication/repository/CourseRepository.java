package com.masai.CollegeDirectoryApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.CollegeDirectoryApplication.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
