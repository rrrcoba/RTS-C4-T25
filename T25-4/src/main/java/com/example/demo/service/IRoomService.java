package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Room;

public interface IRoomService {
	
	/**
	 * Lists all the Room
	 * @return
	 */
	public List<Room> listAllRooms();
	
	/**
	 * Saves an Room
	 * @param r
	 * @return
	 */
	public Room saveRoom(Room r);
	
	/**
	 * Gets the Room by ID
	 * @param id
	 * @return
	 */
	public Room roomById(Long id);
	
	/**
	 * Updates the Room
	 * @param r
	 * @return
	 */
	public Room updateRoom(Room r);
	
	/**
	 * Deletes the Room
	 * @param id
	 */
	public void deleteRoom(Long id);

}
