package com.example.pms.model;

public class Vitals {

	private int height;
	private float weight;
	private int systolicBloodPressure;
	private int diastolicBloodPressure;
	private float bodyTemperature;
	private int respirationRate;
	
	public Vitals(int height, float weight, int systolicBloodPressure, int diastolicBloodPressure,
			float bodyTemperature, int respirationRate) {
		super();
		this.height = height;
		this.weight = weight;
		this.systolicBloodPressure = systolicBloodPressure;
		this.diastolicBloodPressure = diastolicBloodPressure;
		this.bodyTemperature = bodyTemperature;
		this.respirationRate = respirationRate;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getSystolicBloodPressure() {
		return systolicBloodPressure;
	}

	public void setSystolicBloodPressure(int systolicBloodPressure) {
		this.systolicBloodPressure = systolicBloodPressure;
	}

	public int getDiastolicBloodPressure() {
		return diastolicBloodPressure;
	}

	public void setDiastolicBloodPressure(int diastolicBloodPressure) {
		this.diastolicBloodPressure = diastolicBloodPressure;
	}

	public float getBodyTemperature() {
		return bodyTemperature;
	}

	public void setBodyTemperature(float bodyTemperature) {
		this.bodyTemperature = bodyTemperature;
	}

	public int getRespirationRate() {
		return respirationRate;
	}

	public void setRespirationRate(int respirationRate) {
		this.respirationRate = respirationRate;
	}
	
	
}
