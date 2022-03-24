package com.sebone.helpcenter.data.entity;

import java.util.List;

/**
 * QualityTracking
 * @author Rohitdutt Parsai
 * 24/03/2022
 * This class is responsible for carrying out the data related to tracking of quality of questins and answer
 */
public class QualityTracking {

	private long qualityTrackingId;
	
	public QualityTracking() {
		// TODO Auto-generated constructor stub
	}

	

	public QualityTracking(long qualityTrackingId) {
		super();
		this.qualityTrackingId = qualityTrackingId;
	}



	public long getQualityTrackingId() {
		return qualityTrackingId;
	}

	public void setQualityTrackingId(long qualityTrackingId) {
		this.qualityTrackingId = qualityTrackingId;
	}

}
