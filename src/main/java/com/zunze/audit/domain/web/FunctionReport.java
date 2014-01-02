package com.zunze.audit.domain.web;

import java.util.HashSet;
import java.util.Set;

public class FunctionReport {
	private long id;
	private String key;
	private String status;
	private String BaseSQL;
	private FunctionDet functionDet;
	private Set<ReportField> fields = new HashSet<ReportField>();
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBaseSQL() {
		return BaseSQL;
	}
	public void setBaseSQL(String baseSQL) {
		BaseSQL = baseSQL;
	}
	public FunctionDet getFunctionDet() {
		return functionDet;
	}
	public void setFunctionDet(FunctionDet functionDet) {
		this.functionDet = functionDet;
	}
	public Set<ReportField> getFields() {
		return fields;
	}
	public void setFields(Set<ReportField> fields) {
		this.fields = fields;
	}
}
