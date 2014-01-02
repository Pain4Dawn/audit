package com.zunze.audit.domain.web;

import java.util.HashSet;
import java.util.Set;

public class Condition {
	private long id;
	private String cdtName;
	private String cdtParam;
	private String type;
	private String cdtDataType;
	private String cdtSQL;
	private String isArea;
	private Set<Function2Condition> func2Con = new HashSet<Function2Condition>();
	
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
	public String getCdtName() {
		return cdtName;
	}
	public void setCdtName(String cdtName) {
		this.cdtName = cdtName;
	}
	public String getCdtParam() {
		return cdtParam;
	}
	public void setCdtParam(String cdtParam) {
		this.cdtParam = cdtParam;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCdtDataType() {
		return cdtDataType;
	}
	public void setCdtDataType(String cdtDataType) {
		this.cdtDataType = cdtDataType;
	}
	public String getCdtSQL() {
		return cdtSQL;
	}
	public void setCdtSQL(String cdtSQL) {
		this.cdtSQL = cdtSQL;
	}
	public String getIsArea() {
		return isArea;
	}
	public void setIsArea(String isArea) {
		this.isArea = isArea;
	}
	
}
