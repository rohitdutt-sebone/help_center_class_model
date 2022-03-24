/**
 * 
 */
package com.sebone.helpcenter.data.entity;

import java.util.List;

/**
 * Room
 * @author Rohitdutt Parsai
 * 24/03/2022
 * This class is responsible for carrying out data related to chat room
 */
public class Room {

	private long roomId;
	private String roomName;
	private List<UserTracking> userTracking;
	/**
	 * 
	 */
	public Room() {
		// TODO Auto-generated constructor stub
	}
	
	public Room(long roomId, String roomName, List<UserTracking> userTracking) {
		super();
		this.roomId = roomId;
		this.roomName = roomName;
		this.userTracking = userTracking;
	}

	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public List<UserTracking> getUserTracking() {
		return userTracking;
	}

	public void setUserTracking(List<UserTracking> userTracking) {
		this.userTracking = userTracking;
	}
	
	
}
