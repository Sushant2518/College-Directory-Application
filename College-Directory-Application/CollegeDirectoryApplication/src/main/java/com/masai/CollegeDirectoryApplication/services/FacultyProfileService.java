package com.masai.CollegeDirectoryApplication.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.CollegeDirectoryApplication.model.FacultyProfile;
import com.masai.CollegeDirectoryApplication.repository.FacultyProfileRepository;

@Service
public class FacultyProfileService {
	@Autowired
    private FacultyProfileRepository facultyProfileRepository;

    public FacultyProfile getFacultyProfile(Long userId) {
        return facultyProfileRepository.findById(userId).orElseThrow(() -> new RuntimeException("Faculty not found"));
    }

    public FacultyProfile saveFacultyProfile(FacultyProfile facultyProfile) {
        return facultyProfileRepository.save(facultyProfile);
    }

    public void deleteFacultyProfile(Long userId) {
        facultyProfileRepository.deleteById(userId);
    }

    public List<FacultyProfile> getAllFacultyProfiles() {
        return facultyProfileRepository.findAll();
    }

    public FacultyProfile updateFacultyProfile(Long userId, FacultyProfile facultyProfileDetails) {
        FacultyProfile existingProfile = getFacultyProfile(userId);
        existingProfile.setPhoto(facultyProfileDetails.getPhoto());
        existingProfile.setDepartment(facultyProfileDetails.getDepartment());
        existingProfile.setOfficeHours(facultyProfileDetails.getOfficeHours());
        return saveFacultyProfile(existingProfile);
    }
}
