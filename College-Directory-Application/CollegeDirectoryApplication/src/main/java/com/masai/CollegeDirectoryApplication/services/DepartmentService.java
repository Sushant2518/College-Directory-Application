package com.masai.CollegeDirectoryApplication.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.CollegeDirectoryApplication.model.Department;
import com.masai.CollegeDirectoryApplication.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
    private DepartmentRepository departmentRepository;

    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department updateDepartment(Long id, Department departmentDetails) {
        Department department = departmentRepository.findById(id).orElse(null);
        if (department != null) {
            department.setName(departmentDetails.getName());
            department.setDescription(departmentDetails.getDescription());
            departmentRepository.save(department);
        }
        return department;
    }

    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}
