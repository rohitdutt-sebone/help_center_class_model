/**
 * 
 */
package com.sebone.helpcenter.data.entity;

/**
 * ResolvedQuestionsRatings
 * @author Rohitdutt Parsai
 * 24/03/2022
 * This class is responsible for carrying out data related to No of questions resolved or pending
 */
public class ResolvedQuestionsRatings {

	private String question;
	private long countIsResolved;
	private long countIsPending;
	/**
	 * 
	 */
	public ResolvedQuestionsRatings() {
		// TODO Auto-generated constructor stub
	}
	public ResolvedQuestionsRatings(String question, long countIsResolved, long countIsPending) {
		super();
		this.question = question;
		this.countIsResolved = countIsResolved;
		this.countIsPending = countIsPending;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public long getCountIsResolved() {
		return countIsResolved;
	}
	public void setCountIsResolved(long countIsResolved) {
		this.countIsResolved = countIsResolved;
	}
	public long getCountIsPending() {
		return countIsPending;
	}
	public void setCountIsPending(long countIsPending) {
		this.countIsPending = countIsPending;
	}
}
