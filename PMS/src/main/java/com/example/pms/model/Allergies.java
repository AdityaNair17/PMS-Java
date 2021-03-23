package com.example.pms.model;

public class Allergies {

	private String allergyName;
	private String allergyType;
	private String fatalityLevel;
	
	public Allergies(String allergyName, String allergyType, String fatalityLevel) {
		super();
		this.allergyName = allergyName;
		this.allergyType = allergyType;
		this.fatalityLevel = fatalityLevel;
	}

	public String getAllergyName() {
		return allergyName;
	}

	public void setAllergyName(String allergyName) {
		this.allergyName = allergyName;
	}

	public String getAllergyType() {
		return allergyType;
	}

	public void setAllergyType(String allergyType) {
		this.allergyType = allergyType;
	}

	public String getFatalityLevel() {
		return fatalityLevel;
	}

	public void setFatalityLevel(String fatalityLevel) {
		this.fatalityLevel = fatalityLevel;
	}
	
	
}
