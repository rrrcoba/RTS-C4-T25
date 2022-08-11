package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Box;

public interface IBoxService {
	
	/**
	 * Lists all the Box
	 * @return
	 */
	public List<Box> listAllBoxes();
	
	/**
	 * Saves an Box
	 * @param b
	 * @return
	 */
	public Box saveBox(Box b);
	
	/**
	 * Gets the Box by ID
	 * @param id
	 * @return
	 */
	public Box boxById(Long id);
	
	/**
	 * Updates the Box
	 * @param b
	 * @return
	 */
	public Box updateBox(Box b);
	
	/**
	 * Deletes the Box
	 * @param id
	 */
	public void deleteBox(Long id);

}
