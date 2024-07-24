package com.masai.CollegeDirectoryApplication.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.CollegeDirectoryApplication.model.AdministratorProfile;
import com.masai.CollegeDirectoryApplication.repository.AdministratorProfileRepository;

@Service
public class AdministratorProfileService {
	@Autowired
    private AdministratorProfileRepository administratorProfileRepository;

    public AdministratorProfile getAdministratorProfile(Long userId) {
        return administratorProfileRepository.findById(userId).orElseThrow(() -> new RuntimeException("Administrator not found"));
    }

    public AdministratorProfile saveAdministratorProfile(AdministratorProfile administratorProfile) {
        return administratorProfileRepository.save(administratorProfile);
    }

    public void deleteAdministratorProfile(Long userId) {
        administratorProfileRepository.deleteById(userId);
    }
}
