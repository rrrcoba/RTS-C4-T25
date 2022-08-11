package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dto.Article;
import com.example.demo.service.ArticleServiceImpl;


@RestController
@RequestMapping("/api")
public class ArticleController {
	
	@Autowired
	ArticleServiceImpl articleServiceImpl;
	
	@GetMapping("/articles")
	public List<Article> getAllArticles(){
		return articleServiceImpl.listAllArticles();
	}
	
	@PostMapping("/articles")
	public Article saveArticle(@RequestBody Article a) {
		return articleServiceImpl.saveArticle(a);
	}
	
	@GetMapping("/articles/{id}")
	public Article getArticleById(@PathVariable(name="id")Long id) {
		return articleServiceImpl.articleById(id);
	}
	
	@PutMapping("/articles/{id}")
	public Article updateArticle(@PathVariable(name="id")Long id, @RequestBody Article a) {
		Article selectedArticle;
		Article updatedArticle;
		
		selectedArticle = articleServiceImpl.articleById(id);
		
		selectedArticle.setName(a.getName());
		selectedArticle.setPrice(a.getPrice());
		selectedArticle.setMaker(a.getMaker());
		
		updatedArticle = articleServiceImpl.saveArticle(selectedArticle);
		
		return updatedArticle;
	}
	
	@DeleteMapping("/articles/{id}")
	public void deleteArticle(@PathVariable(name="id")Long id) {
		articleServiceImpl.deleteArticle(id);
	}
}
