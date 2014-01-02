package com.zunze.audit.domain.web;

import java.io.Serializable;

public class Function2Condition {
	
	public static class Id implements Serializable{
		private Long functionId;
		private Long conditionId;       
		
		public Id(){}
		public Id(Long functionId,Long conditionId){
			this.functionId = functionId;
			this.conditionId = conditionId;
		}
	}
	private Id id = new Id();
	private String columnName;
	private Condition condition;
	private FunctionDet funcDet;
	
	public Function2Condition(){}
	public Function2Condition(String columnName,Condition condition
			,FunctionDet funcDet){
		this.columnName = columnName;
		this.condition = condition;
		this.funcDet = funcDet;
		
		this.id.conditionId = condition.getId();
		this.id.functionId = funcDet.getId();
		
		condition.getFunc2Con().add(this);
		funcDet.getFunc2Con().add(this);
	}
	public Condition getCondition() {
		return condition;
	}
	public void setCondition(Condition condition) {
		this.condition = condition;
	}
	public FunctionDet getFuncDet() {
		return funcDet;
	}
	public void setFuncDet(FunctionDet funcDet) {
		this.funcDet = funcDet;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public Id getId() {
		return id;
	}
	public void setId(Id id) {
		this.id = id;
	}
	
}
