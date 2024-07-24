package com.masai.CollegeDirectoryApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.CollegeDirectoryApplication.model.FacultyProfile;
import com.masai.CollegeDirectoryApplication.services.FacultyProfileService;

@RestController
@RequestMapping("/facultyProfiles")
public class FacultyProfileController {
	@Autowired
    private FacultyProfileService facultyProfileService;

    @GetMapping("/{userId}")
    public ResponseEntity<FacultyProfile> getFacultyProfile(@PathVariable Long userId) {
        FacultyProfile profile = facultyProfileService.getFacultyProfile(userId);
        return ResponseEntity.ok(profile);
    }

    @GetMapping
    public ResponseEntity<List<FacultyProfile>> getAllFacultyProfiles() {
        List<FacultyProfile> profiles = facultyProfileService.getAllFacultyProfiles();
        return ResponseEntity.ok(profiles);
    }

    @PostMapping
    public ResponseEntity<FacultyProfile> createFacultyProfile(@RequestBody FacultyProfile facultyProfile) {
        FacultyProfile savedProfile = facultyProfileService.saveFacultyProfile(facultyProfile);
        return ResponseEntity.ok(savedProfile);
    }

    @PutMapping("/{userId}")
    public ResponseEntity<FacultyProfile> updateFacultyProfile(@PathVariable Long userId, @RequestBody FacultyProfile facultyProfileDetails) {
        FacultyProfile updatedProfile = facultyProfileService.updateFacultyProfile(userId, facultyProfileDetails);
        return ResponseEntity.ok(updatedProfile);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteFacultyProfile(@PathVariable Long userId) {
        facultyProfileService.deleteFacultyProfile(userId);
        return ResponseEntity.noContent().build();
    }
}
