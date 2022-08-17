package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Maker;

public interface IMakerService {
	/**
	 * Lists all the makers
	 * @return
	 */
	public List<Maker> listAllMakers();
	
	/**
	 * Saves a maker
	 * @param m
	 * @return
	 */
	public Maker saveMaker(Maker m);
	
	/**
	 * Gets the maker by ID
	 * @param id
	 * @return
	 */
	public Maker makerById(Long id);
	
	/**
	 * Updates the maker
	 * @param m
	 * @return
	 */
	public Maker updateMaker(Maker m);
	
	/**
	 * Deletes the maker
	 * @param id
	 */
	public void deleteMaker(Long id);
}
