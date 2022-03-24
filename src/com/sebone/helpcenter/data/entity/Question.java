/**
 * 
 */
package com.sebone.helpcenter.data.entity;

import java.util.Date;
import java.util.List;

/**
 * Question
 * @author Rohitdutt Parsai
 * 24/03/2022
 * This class is responsible for carrying out the data related to questions
 */
public class Question {

	private long questionId;
	private String fullAnswer;
	private String questionStatus;
	private String fullQuestion;
	private boolean isGuest;
	private Date createdAt;
	private List<QualityTracking> qualityTracking;
	private List<UserTracking> userTracking;
	private List<QuestionTag> questionTags;
	/**
	 * 
	 */
	public Question() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Question(long questionId, String fullAnswer, String questionStatus, String fullQuestion, boolean isGuest,
			Date createdAt, List<QualityTracking> qualityTracking, List<UserTracking> userTracking,
			List<QuestionTag> questionTags) {
		super();
		this.questionId = questionId;
		this.fullAnswer = fullAnswer;
		this.questionStatus = questionStatus;
		this.fullQuestion = fullQuestion;
		this.isGuest = isGuest;
		this.createdAt = createdAt;
		this.qualityTracking = qualityTracking;
		this.userTracking = userTracking;
		this.questionTags = questionTags;
	}



	public long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	public String getFullAnswer() {
		return fullAnswer;
	}

	public void setFullAnswer(String fullAnswer) {
		this.fullAnswer = fullAnswer;
	}

	public String getQuestionStatus() {
		return questionStatus;
	}

	public void setQuestionStatus(String questionStatus) {
		this.questionStatus = questionStatus;
	}

	public String getFullQuestion() {
		return fullQuestion;
	}

	public void setFullQuestion(String fullQuestion) {
		this.fullQuestion = fullQuestion;
	}

	public boolean isGuest() {
		return isGuest;
	}

	public void setGuest(boolean isGuest) {
		this.isGuest = isGuest;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}



	public List<QualityTracking> getQualityTracking() {
		return qualityTracking;
	}



	public void setQualityTracking(List<QualityTracking> qualityTracking) {
		this.qualityTracking = qualityTracking;
	}


	public List<UserTracking> getUserTracking() {
		return userTracking;
	}


	public void setUserTracking(List<UserTracking> userTracking) {
		this.userTracking = userTracking;
	}



	public List<QuestionTag> getQuestionTags() {
		return questionTags;
	}



	public void setQuestionTags(List<QuestionTag> questionTags) {
		this.questionTags = questionTags;
	}

	
	
}
