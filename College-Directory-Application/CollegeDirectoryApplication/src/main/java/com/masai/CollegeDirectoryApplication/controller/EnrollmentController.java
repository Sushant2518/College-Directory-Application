package com.masai.CollegeDirectoryApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.CollegeDirectoryApplication.model.Enrollment;
import com.masai.CollegeDirectoryApplication.services.EnrollmentService;

@RestController
@RequestMapping("/enrollments")
@CrossOrigin
public class EnrollmentController {
	@Autowired
    private EnrollmentService enrollmentService;

    @GetMapping("/{enrollmentId}")
    public Enrollment getEnrollment(@PathVariable Long enrollmentId) {
        return enrollmentService.getEnrollment(enrollmentId);
    }

    @GetMapping
    public List<Enrollment> getAllEnrollments() {
        return enrollmentService.getAllEnrollments();
    }

    @PostMapping
    public Enrollment saveEnrollment(@RequestBody Enrollment enrollment) {
        return enrollmentService.saveEnrollment(enrollment);
    }

    @DeleteMapping("/{enrollmentId}")
    public void deleteEnrollment(@PathVariable Long enrollmentId) {
        enrollmentService.deleteEnrollment(enrollmentId);
    }
}
