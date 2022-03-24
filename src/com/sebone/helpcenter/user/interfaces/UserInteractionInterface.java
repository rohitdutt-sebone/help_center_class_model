/**
 * 
 */
package com.sebone.helpcenter.user.interfaces;

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

/**
 * UserInteractionInterface
 * @author Rohitdutt Parsai
 * 24/03/2022
 * In this Interface there are methods defind which needs to be implemented in case of user side interactions
 */
public interface UserInteractionInterface {
	
	CategoryDetails getCategoryByUser(Boolean isGuest);
	
	SubCategoryDetails getSubCategoryByCategoryId (IssueCategory CategoryId, UserTracking trackingId);
	
	List<Question> getQuestionBySubCategoryId (IssueSubCategory SubCategoryId, UserTracking  trackingId);
	
	QuestionAnswerDetails getAnswerByQuestionId(Question QuestionId);
	
	Integer SetLikeOrDislikeOnAnswer (Question QuestionId ,Boolean isLike ,User userId);
	
	List<Question> getQusetionByTag(Tag tagTittleName);
}
