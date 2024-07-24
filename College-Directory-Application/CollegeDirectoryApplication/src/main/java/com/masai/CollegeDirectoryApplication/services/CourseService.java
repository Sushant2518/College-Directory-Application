package com.masai.CollegeDirectoryApplication.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.CollegeDirectoryApplication.model.Course;
import com.masai.CollegeDirectoryApplication.repository.CourseRepository;

@Service
public class CourseService {
	@Autowired
    private CourseRepository courseRepository;

    public Course getCourse(Long courseId) {
        return courseRepository.findById(courseId).orElseThrow(() -> new RuntimeException("Course not found"));
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    public void deleteCourse(Long courseId) {
        courseRepository.deleteById(courseId);
    }
}
