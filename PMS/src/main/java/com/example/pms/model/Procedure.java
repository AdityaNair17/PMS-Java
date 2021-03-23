package com.example.pms.model;

public class Procedure {

	private String procedureCode;
	private String procedureName;
	private String description;
	
	public Procedure(String procedureCode, String procedureName, String description) {
		super();
		this.procedureCode = procedureCode;
		this.procedureName = procedureName;
		this.description = description;
	}

	public String getProcedureCode() {
		return procedureCode;
	}

	public void setProcedureCode(String procedureCode) {
		this.procedureCode = procedureCode;
	}

	public String getProcedureName() {
		return procedureName;
	}

	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
