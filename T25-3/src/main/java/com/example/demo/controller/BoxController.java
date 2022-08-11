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

import com.example.demo.dto.Box;
import com.example.demo.service.BoxServiceImpl;


@RestController
@RequestMapping("/api")
public class BoxController {
	
	@Autowired
	BoxServiceImpl boxServiceImpl;
	
	@GetMapping("/boxes")
	public List<Box> getAllBoxes(){
		return boxServiceImpl.listAllBoxes();
	}
	
	@PostMapping("/boxes")
	public Box saveBox(@RequestBody Box b) {
		return boxServiceImpl.saveBox(b);
	}
	
	@GetMapping("/boxes/{id}")
	public Box getBoxById(@PathVariable(name="id")Long id) {
		return boxServiceImpl.boxById(id);
	}
	
	@PutMapping("/boxes/{id}")
	public Box updateBox(@PathVariable(name="id")Long id, @RequestBody Box b) {
		Box selectedBox;
		Box updatedBox;
		
		selectedBox = boxServiceImpl.boxById(id);
		
		selectedBox.setContent(b.getContent());
		selectedBox.setValue(b.getValue());
		selectedBox.setWarehouse(b.getWarehouse());
		
		updatedBox = boxServiceImpl.saveBox(selectedBox);
		
		return updatedBox;
	}
	
	@DeleteMapping("/boxes/{id}")
	public void deleteBox(@PathVariable(name="id")Long id) {
		boxServiceImpl.deleteBox(id);
	}
}
