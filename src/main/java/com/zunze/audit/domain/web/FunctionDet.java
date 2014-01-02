package com.zunze.audit.domain.web;

import java.util.HashSet;
import java.util.Set;

public class FunctionDet {
	private long id;
	private String fnTabCode;
	private String fnTabName;
	private String urlType;
	private String status;
	private String fnUrl;
	private Set<Function2Condition> func2Con = new HashSet<Function2Condition>();
	private FunctionReport funcReport;
	
	public FunctionReport getFuncReport() {
		return funcReport;
	}
	public void setFuncReport(FunctionReport funcReport) {
		this.funcReport = funcReport;
	}
	public Set<Function2Condition> getFunc2Con() {
		return func2Con;
	}
	public void setFunc2Con(Set<Function2Condition> func2Con) {
		this.func2Con = func2Con;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFnTabCode() {
		return fnTabCode;
	}
	public void setFnTabCode(String fnTabCode) {
		this.fnTabCode = fnTabCode;
	}
	public String getFnTabName() {
		return fnTabName;
	}
	public void setFnTabName(String fnTabName) {
		this.fnTabName = fnTabName;
	}
	public String getUrlType() {
		return urlType;
	}
	public void setUrlType(String urlType) {
		this.urlType = urlType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFnUrl() {
		return fnUrl;
	}
	public void setFnUrl(String fnUrl) {
		this.fnUrl = fnUrl;
	}
}
