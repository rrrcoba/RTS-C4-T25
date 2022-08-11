package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IMakerDAO;
import com.example.demo.dto.Maker;

@Service
public class MakerServiceImpl implements IMakerService{

	@Autowired
	IMakerDAO iMakerDAO;
	
	@Override
	public List<Maker> listAllMakers() {
		
		return iMakerDAO.findAll();
	}

	@Override
	public Maker saveMaker(Maker m) {
		
		return iMakerDAO.save(m);
	}

	@Override
	public Maker makerById(Long id) {
		
		return iMakerDAO.findById(id).get();
	}

	@Override
	public Maker updateMaker(Maker m) {
		
		return iMakerDAO.save(m);
	}

	@Override
	public void deleteMaker(Long id) {
		iMakerDAO.deleteById(id);
	}

}
