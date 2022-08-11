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
@Table(name="almacenes")
public class Warehouse {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="CODIGO")
	private Long id;
	
	@Column(name="LUGAR")
	private String place;
	
	@Column(name="CAPACIDAD")
	private int capacity;
	
	@OneToMany
	@JoinColumn(name="NUMREFERENCIA")
	private List<Box> boxes;
	
	// Constructors
	
	/**
	 * Default constructor
	 */
	public Warehouse () {
		
	}

	/**
	 * Constructor using fields
	 * 
	 * @param id
	 * @param place
	 * @param capacity
	 * @param boxes
	 */
	public Warehouse(Long id, String place, int capacity, List<Box> boxes) {
		super();
		this.id = id;
		this.place = place;
		this.capacity = capacity;
		this.boxes = boxes;
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
	 * @return the place
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * @param place the place to set
	 */
	public void setPlace(String place) {
		this.place = place;
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	/**
	 * @return the articles
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Box")
	public List<Box> getBoxes() {
		return boxes;
	}
	
	/**
	 * @param boxes the boxes to set
	 */
	public void setBoxes(List<Box> boxes) {
		this.boxes = boxes;
	}
}
