package com.example.pms.model;

import java.util.Date;
import java.util.List;


enum Gender{
	MALE, FEMALE
}

public class PatientDto {
	
	private String patientId;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private int age;
	private Gender gender;
	private String race;
	private String ethnicity;
	private List<String> languages;
	private String email;
	private Address address;
	private int contact;
	private EmergencyContact emergencyContact;
	private List<Allergies> allergies;

	
	public PatientDto(String patientId, String firstName, String lastName, Date dateOfBirth, int age, Gender gender,
			String race, String ethnicity, List<String> languages, String email, Address address, int contact,
			EmergencyContact emergencyContact, List<Allergies> allergies) {
		super();
		this.patientId = patientId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.gender = gender;
		this.race = race;
		this.ethnicity = ethnicity;
		this.languages = languages;
		this.email = email;
		this.address = address;
		this.contact = contact;
		this.emergencyContact = emergencyContact;
		this.allergies = allergies;
	}
	
	

	public String getPatientId() {
		return patientId;
	}


	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public EmergencyContact getEmergencyContact() {
		return emergencyContact;
	}

	public void setEmergencyContact(EmergencyContact emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public List<Allergies> getAllergies() {
		return allergies;
	}

	public void setAllergies(List<Allergies> allergies) {
		this.allergies = allergies;
	}
	
	
	
}
