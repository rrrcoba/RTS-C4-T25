package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDepartmentDAO;
import com.example.demo.dto.Department;

@Service
public class DepartmentServiceImpl implements IDepartmentService{

	@Autowired
	IDepartmentDAO iDepartmentDAO;

	@Override
	public List<Department> listAllDepartments() {
		
		return iDepartmentDAO.findAll();
	}

	@Override
	public Department saveDepartment(Department d) {
		
		return iDepartmentDAO.save(d);
	}

	@Override
	public Department departmentById(Long id) {
		
		return iDepartmentDAO.findById(id).get();
	}

	@Override
	public Department updateDepartment(Department d) {
		
		return iDepartmentDAO.save(d);
	}

	@Override
	public void deleteDepartment(Long id) {
		iDepartmentDAO.deleteById(id);
		
	}
}
