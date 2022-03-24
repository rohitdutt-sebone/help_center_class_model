/**
 * 
 */
package com.sebone.helpcenter.data.entity;

import java.util.List;

/**
 * QuestionTag
 * @author Rohitdutt Parsai
 * 24/03/2022
 * This class is responsible for carrying out data related to question and their tags
 */
public class QuestionTag {

	private long questionTagId;
//	@OneToMany
	private List<Tag> tags;
//	@OneToMany
	private List<Question> questions;
	/**
	 * 
	 */
	public QuestionTag() {
		// TODO Auto-generated constructor stub
	}
	

	public QuestionTag(long questionTagId, List<Tag> tags, List<Question> questions) {
		super();
		this.questionTagId = questionTagId;
		this.tags = tags;
		this.questions = questions;
	}



	public long getQuestionTagId() {
		return questionTagId;
	}

	public void setQuestionTagId(long questionTagId) {
		this.questionTagId = questionTagId;
	}


	public List<Tag> getTags() {
		return tags;
	}


	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}


	public List<Question> getQuestions() {
		return questions;
	}


	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
}
