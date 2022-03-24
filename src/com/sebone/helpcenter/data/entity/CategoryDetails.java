/**
 * 
 */
package com.sebone.helpcenter.data.entity;

import java.util.List;

/**
 * CategoryDetails
 * @author Rohitdutt Parsai
 * 24/03/2022
 * This class is responsible for carrying out the data like multiple category objects and a tracking id
 */
public class CategoryDetails {

	private List<IssueCategory> categories;
	private String trackingId;
	/**
	 * 
	 */
	public CategoryDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public CategoryDetails(List<IssueCategory> categories, String trackingId) {
		super();
		this.categories = categories;
		this.trackingId = trackingId;
	}

	public List<IssueCategory> getCategories() {
		return categories;
	}

	public void setCategories(List<IssueCategory> categories) {
		this.categories = categories;
	}

	public String getTrackingId() {
		return trackingId;
	}

	public void setTrackingId(String trackingId) {
		this.trackingId = trackingId;
	}

	
}
