/**
 * 
 */
package com.sebone.helpcenter.system.interfaces;

import java.util.Date;
import java.util.List;

import com.sebone.helpcenter.data.entity.AnswerRatings;
import com.sebone.helpcenter.data.entity.ResolvedByDate;
import com.sebone.helpcenter.data.entity.ResolvedQuestionsRatings;
import com.sebone.helpcenter.data.entity.TagRatings;

/**
 * SystemInteractionInterface
 * @author Rohitdutt Parsai
 * 24/03/2022
 * In this Interface there are methods defind which needs to be implemented in case of system side interactions
 */
public interface SystemInteractionInterface {

	List<AnswerRatings> getAnswerRatingsListByMostLikes();
	
	List<ResolvedQuestionsRatings> getQuestionMostResolved();
	
	List<TagRatings> getMostAccessedTags();
	
	List<ResolvedByDate> countOfResolvedQuestion(Date startDate, Date endDate);
	
}
