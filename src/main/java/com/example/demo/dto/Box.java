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
@Table(name="cajas")
public class Box {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="NUMREFERENCIA")
	private Long id;
	
	@Column(name="CONTENIDO")
	private String content;
	
	@Column(name="VALOR")
	private Double value;
	
	@ManyToOne
	@JoinColumn(name="ALMACEN")
	private Warehouse warehouse;
	
	
	//Constructors
	
	/**
	 * Default constructor
	 */
	public Box () {
		
	}

	/**
	 * Constructor using fields
	 * 
	 * @param id
	 * @param content
	 * @param value
	 * @param warehouse
	 */
	public Box(Long id, String content, Double value, Warehouse warehouse) {
		super();
		this.id = id;
		this.content = content;
		this.value = value;
		this.warehouse = warehouse;
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
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the value
	 */
	public Double getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(Double value) {
		this.value = value;
	}

	/**
	 * @return the warehouse
	 */
	public Warehouse getWarehouse() {
		return warehouse;
	}

	/**
	 * @param warehouse the warehouse to set
	 */
	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}
}
