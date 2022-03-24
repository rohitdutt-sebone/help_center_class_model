/**
 * 
 */
package com.sebone.helpcenter.user.servicelayer;

import java.util.List;

import com.sebone.helpcenter.data.entity.CategoryDetails;
import com.sebone.helpcenter.data.entity.IssueCategory;
import com.sebone.helpcenter.data.entity.IssueSubCategory;
import com.sebone.helpcenter.data.entity.Question;
import com.sebone.helpcenter.data.entity.QuestionAnswerDetails;
import com.sebone.helpcenter.data.entity.SubCategoryDetails;
import com.sebone.helpcenter.data.entity.Tag;
import com.sebone.helpcenter.data.entity.User;
import com.sebone.helpcenter.data.entity.UserTracking;
import com.sebone.helpcenter.user.interfaces.UserInteractionInterface;

/**
 * UserServiceImpl
 * @author Rohitdutt Parsai
 * 24/03/2022
 * In this class there is implementation of methods from UserInteractionInterface
 */
public class UserServiceImpl implements UserInteractionInterface{

	/**
	 * 
	 */
	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * getCategoryByUser
	 * method to get Categories based on user type
	 * isGuest is a boolean which helps determine is user is loggedin
	 * returns categoryDetails Object
	 */
	public CategoryDetails getCategoryByUser(Boolean isGuest) {
		return null;	
	}
	
	/**
	 * getSubCategoryByCategoryId
	 * The objective of this method is to get the subcategory details  based on Category id.
	 * Category  CategoryId, UserTracking  trackingId.
	 * returns SubCategoryDetails object
	 */
	public SubCategoryDetails getSubCategoryByCategoryId (IssueCategory CategoryId, UserTracking trackingId) {
		return null;
	}
	
	/**
	 * getQuestionBySubCategoryId
	 * This method  provide the List of questions which are based on Subcategory id.
	 * SubCategoryId - On based on subCategoryId it gives the list of questions.which helps users to view a limited number of questions.
 	 * trackingId - It helped us to track the behavior of users.
	 * This method  returns the list of questions.
	 */
	public List<Question> getQuestionBySubCategoryId (IssueSubCategory SubCategoryId, UserTracking  trackingId){
		return null;
	}
	
	/**
	 * getAnswerByQuestionId
	 * The objective of this method is to get the answers which are related to questionId. 
	 * QuestionId - it gives the answers based on questionId
	 * This method returns the question answer details.
	 */
	public QuestionAnswerDetails getAnswerByQuestionId(Question QuestionId) {
		return null;
	}
	
	/**
	 * SetLikeOrDislikeOnAnswer
	 * This method sets like or dislikes the answer by question id.
	 * Question QuestionId,Boolean isLike,User userId.
	 *  this method returns either the number of liked answers or the number of disliked answers.
	 */
	public Integer SetLikeOrDislikeOnAnswer (Question QuestionId ,Boolean isLike ,User userId) {
		return null;
	}
	
	/**
	 * getQusetionByTag
	 * This method provide the list of questions according to the tag title  For Example, payment tag, if user type payment keyword  in his question then List of questions of that particular tag is provided to the user.
	 * Takes Tag tagTittleName as input
	 * returns List of questions.
	 */
	public List<Question> getQusetionByTag(Tag tagTittleName){
		return null;
	}

}
