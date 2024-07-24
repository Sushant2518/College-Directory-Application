package com.masai.CollegeDirectoryApplication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.CollegeDirectoryApplication.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
//	User findByUsername(String username);
	Optional<User> findByUsername(String username);
}
