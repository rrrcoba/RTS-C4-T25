package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="empleados")
public class Employee {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="CODIGO")
	private Long id;
	
	@Column(name="DNI")
	private String dni;
	
	@Column(name="NOMBRE")
	private String name;
	
	@Column(name="APELLIDOS")
	private String surname;
	
	@ManyToOne
	@JoinColumn(name="DEPARTAMENTO")
	private Department department;
	
	
	// Constructors
	
	/**
	 * Default constructor
	 */
	public Employee () {
		
	}

	/**
	 * Constructor with all fields
	 * 
	 * @param id
	 * @param dni
	 * @param name
	 * @param surname
	 * @param department
	 */
	public Employee(Long id, String dni, String name, String surname, Department department) {
		this.id = id;
		this.dni = dni;
		this.name = name;
		this.surname = surname;
		this.department = department;
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
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
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
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", dni=" + dni + ", name=" + name + ", surname=" + surname + ", department="
				+ department + "]";
	}
}
