package com.zunze.audit.domain.web;

import java.util.HashSet;
import java.util.Set;

public class FunctionMain {
	private long id;
	private String fnCode;
	private String fnDesc;
	private String fnType;
	private String status;
	private String isLeaf;
	private String speUrl;
	private long pid;
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	private Set<FunctionMain> mainChild = new HashSet<FunctionMain>();

	public Set<FunctionMain> getMainChild() {
		return mainChild;
	}
	public void setMainChild(Set<FunctionMain> mainChild) {
		this.mainChild = mainChild;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFnCode() {
		return fnCode;
	}
	public void setFnCode(String fnCode) {
		this.fnCode = fnCode;
	}
	public String getFnDesc() {
		return fnDesc;
	}
	public void setFnDesc(String fnDesc) {
		this.fnDesc = fnDesc;
	}
	public String getFnType() {
		return fnType;
	}
	public void setFnType(String fnType) {
		this.fnType = fnType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getIsLeaf() {
		return isLeaf;
	}
	public void setIsLeaf(String isLeaf) {
		this.isLeaf = isLeaf;
	}
	public String getSpeUrl() {
		return speUrl;
	}
	public void setSpeUrl(String speUrl) {
		this.speUrl = speUrl;
	}
	
}
