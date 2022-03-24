/**
 * 
 */
package com.sebone.helpcenter.data.entity;

/**
 * QuestionAnswerDetails
 * @author Rohitdutt Parsai
 * 24/03/2022
 * This class is responsible for carrying out the answer data related to a question
 */
public class QuestionAnswerDetails {

	private long questionId;
	private String answer;
	
	/**
	 * 
	 */
	public QuestionAnswerDetails() {
		// TODO Auto-generated constructor stub
	}

	public QuestionAnswerDetails(long questionId, String answer) {
		super();
		this.questionId = questionId;
		this.answer = answer;
	}

	public long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
