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

import com.example.demo.dto.Warehouse;
import com.example.demo.service.WarehouseServiceImpl;

@RestController
@RequestMapping("/api")
public class WarehouseController {

	@Autowired
	WarehouseServiceImpl warehouseServiceImpl;
	
	@GetMapping("/warehouses")
	public List<Warehouse> getAllWarehouses() {
		return warehouseServiceImpl.listAllWarehouses();
	}
	
	@PostMapping("/warehouses")
	public Warehouse saveWarehouse(@RequestBody Warehouse w) {
		return warehouseServiceImpl.saveWarehouse(w);
	}
	
	@GetMapping("/warehouses/{id}")
	public Warehouse getWarehouseById(@PathVariable(name="id") Long id) {
		return warehouseServiceImpl.warehouseById(id);
	}
	
	@PutMapping("/warehouses/{id}")
	public Warehouse updateWarehouse(@PathVariable(name="id") Long id, @RequestBody Warehouse w) {
		Warehouse selectedWarehouse;
		Warehouse updatedWarehouse;
		
		selectedWarehouse = warehouseServiceImpl.warehouseById(id);
		
		selectedWarehouse.setPlace(w.getPlace());
		selectedWarehouse.setCapacity(w.getCapacity());
		selectedWarehouse.setBoxes(w.getBoxes());
		
		updatedWarehouse = warehouseServiceImpl.saveWarehouse(selectedWarehouse);
		
		return updatedWarehouse;
	}
	
	@DeleteMapping("/warehouses/{id}")
	public void deleteWarehouse(@PathVariable(name="id") Long id) {
		warehouseServiceImpl.deleteWarehouse(id);
	}
}
