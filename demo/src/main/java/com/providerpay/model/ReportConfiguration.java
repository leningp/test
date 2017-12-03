package com.providerpay.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class ReportConfiguration {
	
	//Auto generated report configuration id
	//Primary Key
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="REPORT_CONFIGURATION_ID")
	private long reportConfigurationId;
		
	//reference to available reports in the system
	private ScheduledReport report;
	
	//Column to select for configured report
	
	private List<ReportColumns>  listReportColumns;
    
	//scheduler  to place the report in configured date and time
	private String cronExpression;
    
	//configured sftp location
	private String sftpPath;
	
		private long orgId;
	
    
	public long getOrgId() {
		return orgId;
	}
	public void setOrgId(long orgId) {
		this.orgId = orgId;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "REPORT_ID")
	public void setReport(ScheduledReport report) {
		this.report = report;
	}
	
	public long getReportConfigurationId() {
		return reportConfigurationId;
	}
	public void setReportConfigurationId(long reportConfigurationId) {
		this.reportConfigurationId = reportConfigurationId;
	}
	public ScheduledReport getReport() {
		return report;
	}
	public void setReportId(ScheduledReport report) {
		this.report = report;
	}
	
	@ManyToOne
	public List<ReportColumns> getListReportColumns() {
		return listReportColumns;
	}
	public void setListReportColumns(List<ReportColumns> listReportColumns) {
		this.listReportColumns = listReportColumns;
	}
	public String getCronExpression() {
		return cronExpression;
	}
	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}
	public String getSftpPath() {
		return sftpPath;
	}
	public void setSftpPath(String sftpPath) {
		this.sftpPath = sftpPath;
	}
    
   

}
