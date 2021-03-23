package com.example.pms.model;

public class EmergencyContact {

	private String firstName;
	private String lastName;
	private String relationship;
	private String email;
	private Address address;
	private int contact;
	
	public EmergencyContact(String firstName, String lastName, String relationship, String email, Address address,
			int contact) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.relationship = relationship;
		this.email = email;
		this.address = address;
		this.contact = contact;
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

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
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
	
	
}
