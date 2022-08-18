package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="departamentos")
public class Department {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="CODIGO")
	private Long id;
	
	@Column(name="NOMBRE")
	private String name;
	
	@Column(name="PRESUPUESTO")
	private int budget;
	
	@OneToMany
	@JoinColumn(name="CODIGO")
	private List<Employee> employees;
	
	
	// Constructors
	
	/**
	 * Default constructor
	 */
	public Department () {
		
	}

	/**
	 * Constructor with all fields
	 * 
	 * @param id
	 * @param name
	 * @param budget
	 * @param employees
	 */
	public Department(Long id, String name, int budget, List<Employee> employees) {
		super();
		this.id = id;
		this.name = name;
		this.budget = budget;
		this.employees = employees;
	}

	
	// Getters and setters

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the budget
	 */
	public int getBudget() {
		return budget;
	}


	/**
	 * @param budget the budget to set
	 */
	public void setBudget(int budget) {
		this.budget = budget;
	}


	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}


	/**
	 * @return the employees
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Employee")
	public List<Employee> getEmployees() {
		return employees;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", budget=" + budget + ", employees=" + employees + "]";
	}
}
