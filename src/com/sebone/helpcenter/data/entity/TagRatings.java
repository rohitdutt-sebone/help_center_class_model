/**
 * 
 */
package com.sebone.helpcenter.data.entity;

/**
 * TagRatings
 * @author Rohitdutt Parsai
 * 24/03/2022
 * This class is responsible for carrying out data related to tag name and its count of access
 */
public class TagRatings {

	private String tagName;
	private long countAccess;
	/**
	 * 
	 */
	public TagRatings() {
		// TODO Auto-generated constructor stub
	}
	
	public TagRatings(String tagName, long countAccess) {
		super();
		this.tagName = tagName;
		this.countAccess = countAccess;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public long getCountAccess() {
		return countAccess;
	}

	public void setCountAccess(long countAccess) {
		this.countAccess = countAccess;
	}
}
