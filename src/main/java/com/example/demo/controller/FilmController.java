package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Film;
import com.example.demo.service.FilmServiceImpl;

@RestController
@RequestMapping("/api")
public class FilmController {

	@Autowired
	FilmServiceImpl filmServiceImpl;
	
	@GetMapping("/films")
	public List<Film> getAllFilms() {
		return filmServiceImpl.listAllFilms();
	}
	
	@PostMapping("/films")
	public Film saveFilm(@RequestBody Film f) {
		return filmServiceImpl.saveFilm(f);
	}
	
	@GetMapping("/films/{id}")
	public Film getFilmById(@PathVariable(name="id") Long id) {
		return filmServiceImpl.filmById(id);
	}
	
	@PutMapping("/films/{id}")
	public Film updateFilm(@PathVariable(name="id") Long id, @RequestBody Film f) {
		Film selectedFilm;
		Film updatedFilm;
		
		selectedFilm = filmServiceImpl.filmById(id);
		
		selectedFilm.setName(f.getName());
		selectedFilm.setAge(f.getAge());
		selectedFilm.setRooms(f.getRooms());
		
		updatedFilm = filmServiceImpl.saveFilm(selectedFilm);
		
		return updatedFilm;
	}
	
	@DeleteMapping("/films/{id}")
	public void deleteFilm(@PathVariable(name="id") Long id) {
		filmServiceImpl.deleteFilm(id);
	}
}
