package com.levent.fop;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;

public class MyTiAccountDetails {

	private String firstName;
	private String lastName;

	private String email;

	private long phone;

	private Date dob;

	public String getFirstName() {
		return firstName;
	}

	@XmlElement
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@XmlElement
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	@XmlElement
	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	@XmlElement
	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Date getDob() {
		return dob;
	}

	@XmlElement
	public void setDob(Date dob) {
		this.dob = dob;
	}

}
