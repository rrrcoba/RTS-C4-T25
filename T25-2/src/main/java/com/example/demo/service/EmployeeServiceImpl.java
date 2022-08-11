package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmployeeDAO;
import com.example.demo.dto.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	IEmployeeDAO iEmployeeDAO;
	
	@Override
	public List<Employee> listAllEmployees() {
		
		return iEmployeeDAO.findAll();
	}

	@Override
	public Employee saveEmployee(Employee e) {
		
		return iEmployeeDAO.save(e);
	}

	@Override
	public Employee employeeById(Long id) {
		
		return iEmployeeDAO.findById(id).get();
	}

	@Override
	public Employee updateEmployee(Employee e) {
		
		return iEmployeeDAO.save(e);
	}

	@Override
	public void deleteEmployee(Long id) {
		iEmployeeDAO.deleteById(id);
	}
}
