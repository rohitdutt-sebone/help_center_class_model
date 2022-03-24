/**
 * 
 */
package com.sebone.helpcenter.data.entity;

import java.util.Date;
import java.util.List;

/**
 * IssueSubCategory
 * @author Rohitdutt Parsai
 * 24/03/2022
 * This class is responsible for carrying out the data related to a help sub category
 */
public class IssueSubCategory {

	private long subCategoryId;
	private String subCategoryName;
	private String subCategoryDesc;
	private String status;
	private Date createdAt;
//	@OneToMany
	private List<Question> questions;
	private List<IssueSubCategory> issueSubCategory;
	
	/**
	 * 
	 */
	public IssueSubCategory() {
		// TODO Auto-generated constructor stub
	}

	
	public IssueSubCategory(long subCategoryId, String subCategoryName, String subCategoryDesc, String status,
			Date createdAt, List<Question> questions, List<IssueSubCategory> issueSubCategory) {
		super();
		this.subCategoryId = subCategoryId;
		this.subCategoryName = subCategoryName;
		this.subCategoryDesc = subCategoryDesc;
		this.status = status;
		this.createdAt = createdAt;
		this.questions = questions;
		this.issueSubCategory = issueSubCategory;
	}


	public long getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(long subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public String getSubCategoryDesc() {
		return subCategoryDesc;
	}

	public void setSubCategoryDesc(String subCategoryDesc) {
		this.subCategoryDesc = subCategoryDesc;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}


	public List<IssueSubCategory> getIssueSubCategory() {
		return issueSubCategory;
	}


	public void setIssueSubCategory(List<IssueSubCategory> issueSubCategory) {
		this.issueSubCategory = issueSubCategory;
	}
	
}
