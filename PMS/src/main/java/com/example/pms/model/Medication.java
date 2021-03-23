package com.example.pms.model;

enum Unit {
	ml,mg
}

public class Medication {

	private String medicationCode;
	private String medicationName;
	private int dosage;
	private Unit unit;
	private String description;
	
	public Medication(String medicationCode, String medicationName, int dosage, Unit unit, String description) {
		super();
		this.medicationCode = medicationCode;
		this.medicationName = medicationName;
		this.dosage = dosage;
		this.unit = unit;
		this.description = description;
	}

	public String getMedicationCode() {
		return medicationCode;
	}

	public void setMedicationCode(String medicationCode) {
		this.medicationCode = medicationCode;
	}

	public String getMedicationName() {
		return medicationName;
	}

	public void setMedicationName(String medicationName) {
		this.medicationName = medicationName;
	}

	public int getDosage() {
		return dosage;
	}

	public void setDosage(int dosage) {
		this.dosage = dosage;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
