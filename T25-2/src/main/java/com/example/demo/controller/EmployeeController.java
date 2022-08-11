package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dto.Employee;
import com.example.demo.service.EmployeeServiceImpl;


@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeServiceImpl.listAllEmployees();
	}
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee e) {
		return employeeServiceImpl.saveEmployee(e);
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable(name="id")Long id) {
		return employeeServiceImpl.employeeById(id);
	}
	
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable(name="id")Long id, @RequestBody Employee e) {
		Employee selectedEmployee;
		Employee updatedEmployee;
		
		selectedEmployee = employeeServiceImpl.employeeById(id);
		
		selectedEmployee.setDni(e.getDni());
		selectedEmployee.setName(e.getName());
		selectedEmployee.setSurname(e.getSurname());
		selectedEmployee.setDepartment(e.getDepartment());
		
		updatedEmployee = employeeServiceImpl.saveEmployee(selectedEmployee);
		
		return updatedEmployee;
	}
	
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable(name="id")Long id) {
		employeeServiceImpl.deleteEmployee(id);
	}
}
