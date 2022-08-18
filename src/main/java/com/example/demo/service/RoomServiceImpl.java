package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IRoomDAO;
import com.example.demo.dto.Room;

@Service
public class RoomServiceImpl implements IRoomService{

	@Autowired
	IRoomDAO iRoomDAO;
	
	@Override
	public List<Room> listAllRooms() {
		
		return iRoomDAO.findAll();
	}

	@Override
	public Room saveRoom(Room r) {
		
		return iRoomDAO.save(r);
	}

	@Override
	public Room roomById(Long id) {
		
		return iRoomDAO.findById(id).get();
	}

	@Override
	public Room updateRoom(Room r) {
		
		return iRoomDAO.save(r);
	}

	@Override
	public void deleteRoom(Long id) {
		iRoomDAO.deleteById(id);
	}
}
