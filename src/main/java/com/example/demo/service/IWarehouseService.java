package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Warehouse;

public interface IWarehouseService {
	/**
	 * Lists all the Warehouse
	 * @return
	 */
	public List<Warehouse> listAllWarehouses();
	
	/**
	 * Saves a Warehouse
	 * @param w
	 * @return
	 */
	public Warehouse saveWarehouse(Warehouse w);
	
	/**
	 * Gets the Warehouse by ID
	 * @param id
	 * @return
	 */
	public Warehouse warehouseById(Long id);
	
	/**
	 * Updates the Warehouse
	 * @param w
	 * @return
	 */
	public Warehouse updateWarehouse(Warehouse w);
	
	/**
	 * Deletes the Warehouse
	 * @param id
	 */
	public void deleteWarehouse(Long id);
}
