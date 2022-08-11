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
@Table(name="peliculas")
public class Film {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="CODIGO")
	private Long id;
	
	@Column(name="NOMBRE")
	private String name;
	
	@Column(name="CALIFICACIONEDAD")
	private int age;
	
	@OneToMany
	@JoinColumn(name="CODIGO")
	private List<Room> rooms;
	
	
	// Constructors
	
	/**
	 * Default constructor
	 */
	public Film () {
		
	}

	/**
	 * Constructor using fields
	 * 
	 * @param id
	 * @param name
	 * @param age
	 * @param rooms
	 */
	public Film(Long id, String name, int age, List<Room> rooms) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.rooms = rooms;
	}


	// Getters and Setters
	
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param rooms the rooms to set
	 */
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	
	/**
	 * @return the rooms
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Room")
	public List<Room> getRooms() {
		return rooms;
	}
}
