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
@Table(name="articulos")
public class Article {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="CODIGO")
	private Long id;
	
	@Column(name="NOMBRE")
	private String name;
	
	@Column(name="PRECIO")
	private Double price;
	
	@ManyToOne
	@JoinColumn(name="FABRICANTE")
	private Maker maker;
	
	/**
	 * Default constructor
	 */
	public Article () {
		
	}

	/**
	 * Constructor using fields
	 * 
	 * @param id
	 * @param name
	 * @param price
	 * @param maker
	 */
	public Article(Long id, String name, Double price, Maker maker) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.maker = maker;
	}

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
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * @return the maker
	 */
	public Maker getMaker() {
		return maker;
	}

	/**
	 * @param maker the maker to set
	 */
	public void setMaker(Maker maker) {
		this.maker = maker;
	}
}
