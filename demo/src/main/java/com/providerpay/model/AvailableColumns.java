package com.providerpay.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
/*
 * All the columns available for reports
 */
public class AvailableColumns {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long columnId;
	private String columnName;
	private String databaseName;
	private String tableName;
	
	//reference to the report
	private ScheduledReport report;

	public long getColumnId() {
		return columnId;
	}
	
	public void setColumnId(long columnId) {
		this.columnId = columnId;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getDatabaseName() {
		return databaseName;
	}
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public ScheduledReport getReport() {
		return report;
	}

	public void setReport(ScheduledReport report) {
		this.report = report;
	}
	
	
	

}
