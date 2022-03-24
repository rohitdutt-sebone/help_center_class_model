/**
 * 
 */
package com.sebone.helpcenter.system.servicelayer;

import java.util.Date;
import java.util.List;

import com.sebone.helpcenter.data.entity.AnswerRatings;
import com.sebone.helpcenter.data.entity.ResolvedByDate;
import com.sebone.helpcenter.data.entity.ResolvedQuestionsRatings;
import com.sebone.helpcenter.data.entity.TagRatings;
import com.sebone.helpcenter.system.interfaces.SystemInteractionInterface;

/**
 * SystemServiceImpl
 * @author Rohitdutt Parsai
 * 24/03/2022
 * In this class there is implementation of methods from SystemInteractionInterface
 */
public class SystemServiceImpl implements SystemInteractionInterface{

	/**
	 * 
	 */
	public SystemServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * getAnswerRatingsListByMostLikes
	 * method which gives list of answers based on likes
	 * returns a List of AnswerRatings in descending order
	 */
	public List<AnswerRatings> getAnswerRatingsListByMostLikes(){
		return null;
	}
	
	/**
	 * getQuestionMostResolved
	 * method which gives list of Question which are most resolved in descending order
	 * returns a List of ResolvedQuestionsRatings in descending order
	 */
	public List<ResolvedQuestionsRatings> getQuestionMostResolved(){
		return null;
	}
	
	/**
	 * getMostAccessedTags
	 * method Which gives tags which are most accessed in descending order
	 * returns a List of TagRatings in Descending order
	 */
	public List<TagRatings> getMostAccessedTags(){
		return null;
	}
	
	/**
	 * countOfResolvedQuestion
	 * method to get the count of resolved question in an particular date period
	 * returns a List of ResolvedByDate
	 */
	public List<ResolvedByDate> countOfResolvedQuestion(Date startDate, Date endDate){
		return null;
	}

}
