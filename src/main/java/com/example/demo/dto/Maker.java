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
@Table(name="fabricantes")
public class Maker {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="CODIGO")
	private Long id;
	
	@Column(name="NOMBRE")
	private String name;
	
	@OneToMany
	@JoinColumn(name="CODIGO")
	private List<Article> articles;
	
	// Constructors
	
	/**
	 * Default constructor
	 */
	public Maker () {
		
	}

	/**
	 * Constructor using fields
	 * 
	 * @param id
	 * @param name
	 * @param articles
	 */
	public Maker(Long id, String name, List<Article> articles) {
		this.id = id;
		this.name = name;
		this.articles = articles;
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
	 * @return the articles
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Article")
	public List<Article> getArticles() {
		return articles;
	}

	/**
	 * @param articles the articles to set
	 */
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
}
