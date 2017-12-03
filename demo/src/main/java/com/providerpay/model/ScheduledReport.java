package com.providerpay.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="SCHEDULED_REPORTS")
public class ScheduledReport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "REPORT_ID")
	private long reportId;
	
	@Column(name = "REPORT_NAME")
	private String reportName;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	public long getReportId() {
		return reportId;
	}
	
	public void setReportId(long reportId) {
		this.reportId = reportId;
	}
	
	public String getReportName() {
		return reportName;
	}
	
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
    	
	
	
}
