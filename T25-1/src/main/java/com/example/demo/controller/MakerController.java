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

import com.example.demo.dto.Maker;
import com.example.demo.service.MakerServiceImpl;

@RestController
@RequestMapping("/api")
public class MakerController {

	@Autowired
	MakerServiceImpl makerServiceImpl;
	
	@GetMapping("/makers")
	public List<Maker> getAllMakers() {
		return makerServiceImpl.listAllMakers();
	}
	
	@PostMapping("/makers")
	public Maker saveMaker(@RequestBody Maker m) {
		return makerServiceImpl.saveMaker(m);
	}
	
	@GetMapping("/makers/{id}")
	public Maker getMakerById(@PathVariable(name="id") Long id) {
		return makerServiceImpl.makerById(id);
	}
	
	@PutMapping("/makers/{id}")
	public Maker updateMaker(@PathVariable(name="id") Long id, @RequestBody Maker m) {
		Maker selectedMaker;
		Maker updatedMaker;
		
		selectedMaker = makerServiceImpl.makerById(id);
		
		selectedMaker.setName(m.getName());
		selectedMaker.setArticles(m.getArticles());
		
		updatedMaker = makerServiceImpl.saveMaker(selectedMaker);
		
		return updatedMaker;
	}
	
	@DeleteMapping("/makers/{id}")
	public void deleteMaker(@PathVariable(name="id") Long id) {
		makerServiceImpl.deleteMaker(id);
	}
}
