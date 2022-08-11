package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Maker;

public interface IMakerDAO extends JpaRepository<Maker, Long>{

}
