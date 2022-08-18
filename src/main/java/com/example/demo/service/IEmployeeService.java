package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Employee;

public interface IEmployeeService {
	
	/**
	 * Lists all the Employee
	 * @return
	 */
	public List<Employee> listAllEmployees();
	
	/**
	 * Saves an Employee
	 * @param e
	 * @return
	 */
	public Employee saveEmployee(Employee e);
	
	/**
	 * Gets the Employee by ID
	 * @param id
	 * @return
	 */
	public Employee employeeById(Long id);
	
	/**
	 * Updates the Employee
	 * @param a
	 * @return
	 */
	public Employee updateEmployee(Employee a);
	
	/**
	 * Deletes the Employee
	 * @param id
	 */
	public void deleteEmployee(Long id);

}
