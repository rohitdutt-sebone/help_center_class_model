/**
 * 
 */
package com.sebone.helpcenter.data.entity;

import java.util.Date;
import java.util.List;

/**
 * ResolvedByDate
 * @author Rohitdutt Parsai
 * 24/03/2022
 * This class is responsible for carrying out data related to No of quesries resolved within date range
 */
public class ResolvedByDate {

	Date dateFrom;
	Date dateTo;
	List<Integer> NoOfResolves;
	/**
	 * 
	 */
	public ResolvedByDate() {
		// TODO Auto-generated constructor stub
	}
	public ResolvedByDate(Date dateFrom, Date dateTo, List<Integer> noOfResolves) {
		super();
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		NoOfResolves = noOfResolves;
	}
	public Date getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	public Date getDateTo() {
		return dateTo;
	}
	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}
	public List<Integer> getNoOfResolves() {
		return NoOfResolves;
	}
	public void setNoOfResolves(List<Integer> noOfResolves) {
		NoOfResolves = noOfResolves;
	}
}
