/**
 * 
 */
package com.sebone.helpcenter.data.entity;

/**
 * AnswerRatings
 * @author Rohitdutt Parsai
 * 24/03/2022
 * This class is responsible for carrying out the data like how many likes or dislike a answer got
 */
public class AnswerRatings {
	
	private String answer;
	private long likeCount;
	private long disLikeCount;

	/**
	 * 
	 */
	public AnswerRatings() {
		// TODO Auto-generated constructor stub
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public long getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(long likeCount) {
		this.likeCount = likeCount;
	}

	public long getDisLikeCount() {
		return disLikeCount;
	}

	public void setDisLikeCount(long disLikeCount) {
		this.disLikeCount = disLikeCount;
	}
}
