package com.example.pms.model;

public class Diagnosis {

	private String diagnosisCode;
	private String diagnosisName;
	private String description;
	
	public Diagnosis(String diagnosisCode, String diagnosisName, String description) {
		super();
		this.diagnosisCode = diagnosisCode;
		this.diagnosisName = diagnosisName;
		this.description = description;
	}

	public String getDiagnosisCode() {
		return diagnosisCode;
	}

	public void setDiagnosisCode(String diagnosisCode) {
		this.diagnosisCode = diagnosisCode;
	}

	public String getDiagnosisName() {
		return diagnosisName;
	}

	public void setDiagnosisName(String diagnosisName) {
		this.diagnosisName = diagnosisName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
