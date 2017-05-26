package com.levent.fop;

import javax.xml.bind.annotation.XmlElement;

public class ContactDetails {

	private String contactEmail;
	private String contactName;
	private String contactAddress;
	private String contactCity;
	private long contactPhone;
	private String contactFriend;
	private String contactEnemy;

	public String getContactEmail() {
		return contactEmail;
	}

	@XmlElement
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactName() {
		return contactName;
	}

	@XmlElement
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	@XmlElement
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getContactCity() {
		return contactCity;
	}

	@XmlElement
	public void setContactCity(String contactCity) {
		this.contactCity = contactCity;
	}

	public long getContactPhone() {
		return contactPhone;
	}

	@XmlElement
	public void setContactPhone(long contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getContactFriend() {
		return contactFriend;
	}

	@XmlElement
	public void setContactFriend(String contactFriend) {
		this.contactFriend = contactFriend;
	}

	public String getContactEnemy() {
		return contactEnemy;
	}

	@XmlElement
	public void setContactEnemy(String contactEnemy) {
		this.contactEnemy = contactEnemy;
	}

}
