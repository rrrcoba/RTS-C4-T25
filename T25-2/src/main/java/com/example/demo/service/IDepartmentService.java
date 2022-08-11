package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Department;

public interface IDepartmentService {
	/**
	 * Lists all the Departments
	 * @return
	 */
	public List<Department> listAllDepartments();
	
	/**
	 * Saves a Department
	 * @param d
	 * @return
	 */
	public Department saveDepartment(Department d);
	
	/**
	 * Gets the Department by ID
	 * @param id
	 * @return
	 */
	public Department departmentById(Long id);
	
	/**
	 * Updates the Department
	 * @param d
	 * @return
	 */
	public Department updateDepartment(Department d);
	
	/**
	 * Deletes the Department
	 * @param id
	 */
	public void deleteDepartment(Long id);
}
