/**
 * 
 */
package com.sebone.helpcenter.data.entity;

import java.util.Date;

/**
 * UserTracking
 * @author Rohitdutt Parsai
 * 24/03/2022
 * This class is responsible for carrying out data related to tracking of user behaviour
 */
public class UserTracking {

	private long trackingId;
	private boolean isResolved;
	private Date startTime;
	private Date lastUpdate;
	/**
	 * 
	 */
	public UserTracking() {
		// TODO Auto-generated constructor stub
	}
	public UserTracking(long trackingId, boolean isResolved, Date startTime, Date lastUpdate) {
		super();
		this.trackingId = trackingId;
		this.isResolved = isResolved;
		this.startTime = startTime;
		this.lastUpdate = lastUpdate;
	}
	public long getTrackingId() {
		return trackingId;
	}
	public void setTrackingId(long trackingId) {
		this.trackingId = trackingId;
	}
	public boolean isResolved() {
		return isResolved;
	}
	public void setResolved(boolean isResolved) {
		this.isResolved = isResolved;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
}
