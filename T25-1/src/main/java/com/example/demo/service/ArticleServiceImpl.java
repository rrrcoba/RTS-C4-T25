package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IArticleDAO;
import com.example.demo.dto.Article;

@Service
public class ArticleServiceImpl implements IArticleService{

	@Autowired
	IArticleDAO iArticleDAO;
	
	@Override
	public List<Article> listAllArticles() {
		
		return iArticleDAO.findAll();
	}

	@Override
	public Article saveArticle(Article a) {
		
		return iArticleDAO.save(a);
	}

	@Override
	public Article articleById(Long id) {
		
		return iArticleDAO.findById(id).get();
	}

	@Override
	public Article updateArticle(Article a) {
		
		return iArticleDAO.save(a);
	}

	@Override
	public void deleteArticle(Long id) {
		iArticleDAO.deleteById(id);
	}
}
