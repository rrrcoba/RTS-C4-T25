package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Department;

public interface IDepartmentDAO extends JpaRepository<Department, Long>{

}
