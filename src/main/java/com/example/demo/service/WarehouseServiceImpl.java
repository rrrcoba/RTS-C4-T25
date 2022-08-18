package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IWarehouseDAO;
import com.example.demo.dto.Warehouse;

@Service
public class WarehouseServiceImpl implements IWarehouseService{

	@Autowired
	IWarehouseDAO iWarehouseDAO;
	
	@Override
	public List<Warehouse> listAllWarehouses() {
		
		return iWarehouseDAO.findAll();
	}

	@Override
	public Warehouse saveWarehouse(Warehouse w) {
		
		return iWarehouseDAO.save(w);
	}

	@Override
	public Warehouse warehouseById(Long id) {
		
		return iWarehouseDAO.findById(id).get();
	}

	@Override
	public Warehouse updateWarehouse(Warehouse w) {
		
		return iWarehouseDAO.save(w);
	}

	@Override
	public void deleteWarehouse(Long id) {
		iWarehouseDAO.deleteById(id);
	}

}
