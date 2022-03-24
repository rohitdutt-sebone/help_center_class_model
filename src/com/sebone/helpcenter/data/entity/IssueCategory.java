/**
 * 
 */
package com.sebone.helpcenter.data.entity;

import java.util.Date;
import java.util.List;

/**
 * IssueCategory
 * @author Rohitdutt Parsai
 * 24/03/2022
 * This class is responsible for carrying out the data related to a help category
 */
public class IssueCategory {

	private long categoryId;
	private String categoryName;
	private String categoryDesc;
	private String categoryStatus;
	private Boolean isGuest;
	private Date lastModifiedAt;
	private Date createdAt;
//	@OneToMany
	private List<IssueSubCategory> issueSubCategories;
	private List<UserTracking> userTracking;
	
	/**
	 * 
	 */
	public IssueCategory() {
		// TODO Auto-generated constructor stub
	}

	
	

	public IssueCategory(long categoryId, String categoryName, String categoryDesc, String categoryStatus,
			Boolean isGuest, Date lastModifiedAt, Date createdAt, List<IssueSubCategory> issueSubCategories,
			List<UserTracking> userTracking) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryDesc = categoryDesc;
		this.categoryStatus = categoryStatus;
		this.isGuest = isGuest;
		this.lastModifiedAt = lastModifiedAt;
		this.createdAt = createdAt;
		this.issueSubCategories = issueSubCategories;
		this.userTracking = userTracking;
	}




	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDesc() {
		return categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

	public String getCategoryStatus() {
		return categoryStatus;
	}

	public void setCategoryStatus(String categoryStatus) {
		this.categoryStatus = categoryStatus;
	}

	public Boolean getIsGuest() {
		return isGuest;
	}

	public void setIsGuest(Boolean isGuest) {
		this.isGuest = isGuest;
	}

	public Date getLastModifiedAt() {
		return lastModifiedAt;
	}

	public void setLastModifiedAt(Date lastModifiedAt) {
		this.lastModifiedAt = lastModifiedAt;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public List<IssueSubCategory> getIssueSubCategories() {
		return issueSubCategories;
	}


	public void setIssueSubCategories(List<IssueSubCategory> issueSubCategories) {
		this.issueSubCategories = issueSubCategories;
	}




	public List<UserTracking> getUserTracking() {
		return userTracking;
	}




	public void setUserTracking(List<UserTracking> userTracking) {
		this.userTracking = userTracking;
	}
	
	
	
}
