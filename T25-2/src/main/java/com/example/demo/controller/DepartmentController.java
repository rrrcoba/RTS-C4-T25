package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Department;
import com.example.demo.service.DepartmentServiceImpl;

@RestController
@RequestMapping("/api")
public class DepartmentController {

	@Autowired
	DepartmentServiceImpl departmentServiceImpl;
	
	@GetMapping("/departments")
	public List<Department> getAllDepartmentServiceImpl() {
		return departmentServiceImpl.listAllDepartments();
	}
	
	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department d) {
		return departmentServiceImpl.saveDepartment(d);
	}
	
	@GetMapping("/departments/{id}")
	public Department getDepartmentById(@PathVariable(name="id") Long id) {
		return departmentServiceImpl.departmentById(id);
	}
	
	@PutMapping("/departments/{id}")
	public Department updateDepartment(@PathVariable(name="id") Long id, @RequestBody Department d) {
		Department selectedDepartment;
		Department updatedDepartment;
		
		selectedDepartment = departmentServiceImpl.departmentById(id);
		
		selectedDepartment.setName(d.getName());
		selectedDepartment.setEmployees(d.getEmployees());
		
		updatedDepartment = departmentServiceImpl.saveDepartment(selectedDepartment);
		
		return updatedDepartment;
	}
	
	@DeleteMapping("/departments/{id}")
	public void deleteDepartment(@PathVariable(name="id") Long id) {
		departmentServiceImpl.deleteDepartment(id);
	}
}
