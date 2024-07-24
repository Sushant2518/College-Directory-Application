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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.CollegeDirectoryApplication.model.StudentProfile;
import com.masai.CollegeDirectoryApplication.services.StudentProfileService;

@RestController
@RequestMapping("/students")
@CrossOrigin
public class StudentController {
	@Autowired
    private StudentProfileService studentProfileService;

    @GetMapping("/{userId}")
    public StudentProfile getStudentProfile(@PathVariable Long userId) {
        return studentProfileService.getStudentProfile(userId);
    }

    @GetMapping("/search")
    public List<StudentProfile> searchStudents(@RequestParam String name, @RequestParam String department, @RequestParam String year) {
        return studentProfileService.searchStudents(name, department, year);
    }

    @PostMapping
    public StudentProfile saveStudentProfile(@RequestBody StudentProfile studentProfile) {
        return studentProfileService.saveStudentProfile(studentProfile);
    }

    @DeleteMapping("/{userId}")
    public void deleteStudentProfile(@PathVariable Long userId) {
        studentProfileService.deleteStudentProfile(userId);
    }
}
