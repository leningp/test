package com.providerpay.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ReportColumns {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long reportColumnId;
	
	private AvailableColumns column;
		
	private ReportConfiguration reportConfiguration;

	public long getReportColumnId() {
		return reportColumnId;
	}

	public void setReportColumnId(long reportColumnId) {
		this.reportColumnId = reportColumnId;
	}

	public AvailableColumns getColumn() {
		return column;
	}

	public void setColumn(AvailableColumns column) {
		this.column = column;
	}

	public ReportConfiguration getReportConfiguration() {
		return reportConfiguration;
	}

	public void setReportConfiguration(ReportConfiguration reportConfiguration) {
		this.reportConfiguration = reportConfiguration;
	}

	

}
 