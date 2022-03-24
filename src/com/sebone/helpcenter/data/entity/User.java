/**
 * 
 */
package com.sebone.helpcenter.data.entity;

import java.util.List;

/**
 * User
 * @author Rohitdutt Parsai
 * 24/03/2022
 * This class is responsible for carrying out data related to User and its behaviour
 */
public class User {

	private long userId;
	private String roomName;
	private List<QualityTracking> qualityTracking;
	private List<UserTracking> userTracking;
	/**
	 * 
	 */
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public User(long userId, String roomName, List<QualityTracking> qualityTracking, List<UserTracking> userTracking) {
		super();
		this.userId = userId;
		this.roomName = roomName;
		this.qualityTracking = qualityTracking;
		this.userTracking = userTracking;
	}



	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}



	public List<QualityTracking> getQualityTracking() {
		return qualityTracking;
	}



	public void setQualityTracking(List<QualityTracking> qualityTracking) {
		this.qualityTracking = qualityTracking;
	}



	public List<UserTracking> getUserTracking() {
		return userTracking;
	}



	public void setUserTracking(List<UserTracking> userTracking) {
		this.userTracking = userTracking;
	}
	
}
