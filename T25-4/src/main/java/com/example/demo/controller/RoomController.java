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

import com.example.demo.dto.Room;
import com.example.demo.service.RoomServiceImpl;


@RestController
@RequestMapping("/api")
public class RoomController {
	
	@Autowired
	RoomServiceImpl roomServiceImpl;
	
	@GetMapping("/rooms")
	public List<Room> getAllRooms(){
		return roomServiceImpl.listAllRooms();
	}
	
	@PostMapping("/rooms")
	public Room saveRoom(@RequestBody Room r) {
		return roomServiceImpl.saveRoom(r);
	}
	
	@GetMapping("/rooms/{id}")
	public Room getRoomById(@PathVariable(name="id")Long id) {
		return roomServiceImpl.roomById(id);
	}
	
	@PutMapping("/rooms/{id}")
	public Room updateRoom(@PathVariable(name="id")Long id, @RequestBody Room r) {
		Room selectedRoom;
		Room updatedRoom;
		
		selectedRoom = roomServiceImpl.roomById(id);
		
		selectedRoom.setName(r.getName());
		selectedRoom.setFilm(r.getFilm());
		
		updatedRoom = roomServiceImpl.saveRoom(selectedRoom);
		
		return updatedRoom;
	}
	
	@DeleteMapping("/rooms/{id}")
	public void deleteRoom(@PathVariable(name="id")Long id) {
		roomServiceImpl.deleteRoom(id);
	}
}
