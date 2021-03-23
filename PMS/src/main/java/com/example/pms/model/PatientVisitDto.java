package com.example.pms.model;

import java.util.List;

public class PatientVisitDto {

	private String visitId;
	private String patientId;
	private Vitals patientVitals;
	private List<Diagnosis> diagnosis;
	private List<Medication> medications;
	private List<Procedure> procedure;
	
	public PatientVisitDto(String visitId, String patientId, Vitals patientVitals, List<Diagnosis> diagnosis,
			List<Medication> medications, List<Procedure> procedure) {
		super();
		this.visitId = visitId;
		this.patientId = patientId;
		this.patientVitals = patientVitals;
		this.diagnosis = diagnosis;
		this.medications = medications;
		this.procedure = procedure;
	}

	public String getVisitId() {
		return visitId;
	}

	public void setVisitId(String visitId) {
		this.visitId = visitId;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public Vitals getPatientVitals() {
		return patientVitals;
	}

	public void setPatientVitals(Vitals patientVitals) {
		this.patientVitals = patientVitals;
	}

	public List<Diagnosis> getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(List<Diagnosis> diagnosis) {
		this.diagnosis = diagnosis;
	}

	public List<Medication> getMedications() {
		return medications;
	}

	public void setMedications(List<Medication> medications) {
		this.medications = medications;
	}

	public List<Procedure> getProcedure() {
		return procedure;
	}

	public void setProcedure(List<Procedure> procedure) {
		this.procedure = procedure;
	}
	
	
	
}
