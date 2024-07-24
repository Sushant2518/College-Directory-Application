package com.masai.CollegeDirectoryApplication.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.CollegeDirectoryApplication.model.StudentProfile;
import com.masai.CollegeDirectoryApplication.repository.StudentProfileRepository;

@Service
public class StudentProfileService {
	@Autowired
    private StudentProfileRepository studentProfileRepository;

    public StudentProfile getStudentProfile(Long userId) {
        return studentProfileRepository.findById(userId).orElseThrow(() -> new RuntimeException("Student not found"));
    }

    public List<StudentProfile> searchStudents(String name, String department, String year) {
        return studentProfileRepository.findByUser_NameContainingAndDepartment_NameContainingAndYearContaining(name, department, year);
    }

    public StudentProfile saveStudentProfile(StudentProfile studentProfile) {
        return studentProfileRepository.save(studentProfile);
    }

    public void deleteStudentProfile(Long userId) {
        studentProfileRepository.deleteById(userId);
    }
}
