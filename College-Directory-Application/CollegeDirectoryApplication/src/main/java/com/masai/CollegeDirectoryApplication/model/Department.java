package com.masai.CollegeDirectoryApplication.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    @OneToMany(mappedBy = "department")
    private Set<StudentProfile> students;

    @OneToMany(mappedBy = "department")
    private Set<FacultyProfile> faculty;

    @OneToMany(mappedBy = "department")
    private Set<AdministratorProfile> administrators;

    @OneToMany(mappedBy = "department")
    private Set<Course> courses;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<StudentProfile> getStudents() {
		return students;
	}

	public void setStudents(Set<StudentProfile> students) {
		this.students = students;
	}

	public Set<FacultyProfile> getFaculty() {
		return faculty;
	}

	public void setFaculty(Set<FacultyProfile> faculty) {
		this.faculty = faculty;
	}

	public Set<AdministratorProfile> getAdministrators() {
		return administrators;
	}

	public void setAdministrators(Set<AdministratorProfile> administrators) {
		this.administrators = administrators;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
    
    
    
    
    
}
