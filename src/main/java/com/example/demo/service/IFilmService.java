package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Film;

public interface IFilmService {
	/**
	 * Lists all the Film
	 * @return
	 */
	public List<Film> listAllFilms();
	
	/**
	 * Saves a Film
	 * @param f
	 * @return
	 */
	public Film saveFilm(Film f);
	
	/**
	 * Gets the Film by ID
	 * @param id
	 * @return
	 */
	public Film filmById(Long id);
	
	/**
	 * Updates the Film
	 * @param f
	 * @return
	 */
	public Film updateFilm(Film f);
	
	/**
	 * Deletes the Film
	 * @param id
	 */
	public void deleteFilm(Long id);
}
