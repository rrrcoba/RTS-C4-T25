package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Room;

public interface IRoomDAO extends JpaRepository<Room, Long>{

}
