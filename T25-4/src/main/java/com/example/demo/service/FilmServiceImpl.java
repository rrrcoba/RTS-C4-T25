package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IFilmDAO;
import com.example.demo.dto.Film;

@Service
public class FilmServiceImpl implements IFilmService{

	@Autowired
	IFilmDAO iFilmDAO;
	
	@Override
	public List<Film> listAllFilms() {
		
		return iFilmDAO.findAll();
	}

	@Override
	public Film saveFilm(Film f) {
		
		return iFilmDAO.save(f);
	}

	@Override
	public Film filmById(Long id) {
		
		return iFilmDAO.findById(id).get();
	}

	@Override
	public Film updateFilm(Film f) {
		
		return iFilmDAO.save(f);
	}

	@Override
	public void deleteFilm(Long id) {
		iFilmDAO.deleteById(id);
	}

}
