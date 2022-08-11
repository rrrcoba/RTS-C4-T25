package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Article;

public interface IArticleService {
	
	/**
	 * Lists all the Article
	 * @return
	 */
	public List<Article> listAllArticles();
	
	/**
	 * Saves an Article
	 * @param a
	 * @return
	 */
	public Article saveArticle(Article a);
	
	/**
	 * Gets the Article by ID
	 * @param id
	 * @return
	 */
	public Article articleById(Long id);
	
	/**
	 * Updates the Article
	 * @param a
	 * @return
	 */
	public Article updateArticle(Article a);
	
	/**
	 * Deletes the Article
	 * @param id
	 */
	public void deleteArticle(Long id);

}
