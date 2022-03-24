/**
 * 
 */
package com.sebone.helpcenter.data.entity;

import java.util.List;

/**
 * SubCategoryDetails
 * @author Rohitdutt Parsai
 * 24/03/2022
 * This class is responsible for carrying out list of sub categories
 */
public class SubCategoryDetails {

	List<IssueSubCategory> subCategories;
	/**
	 * 
	 */
	public SubCategoryDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public SubCategoryDetails(List<IssueSubCategory> subCategories) {
		super();
		this.subCategories = subCategories;
	}

	public List<IssueSubCategory> getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(List<IssueSubCategory> subCategories) {
		this.subCategories = subCategories;
	}
}
