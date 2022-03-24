/**
 * 
 */
package com.sebone.helpcenter.data.entity;

import java.util.List;

/**
 * Tag
 * @author Rohitdutt Parsai
 * 24/03/2022
 * This class is responsible for carrying out data related to tags for questions
 */
public class Tag {

	private long tagId;
	private String tagTitle;
	private List<QuestionTag> questiontag;
	/**
	 * 
	 */
	public Tag() {
		// TODO Auto-generated constructor stub
	}
	
	public Tag(long tagId, String tagTitle, List<QuestionTag> questiontag) {
		super();
		this.tagId = tagId;
		this.tagTitle = tagTitle;
		this.questiontag = questiontag;
	}

	public long getTagId() {
		return tagId;
	}
	public void setTagId(long tagId) {
		this.tagId = tagId;
	}
	public String getTagTitle() {
		return tagTitle;
	}
	public void setTagTitle(String tagTitle) {
		this.tagTitle = tagTitle;
	}

	public List<QuestionTag> getQuestiontag() {
		return questiontag;
	}

	public void setQuestiontag(List<QuestionTag> questiontag) {
		this.questiontag = questiontag;
	}
	
}
