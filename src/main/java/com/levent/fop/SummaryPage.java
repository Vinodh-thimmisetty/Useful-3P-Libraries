package com.levent.fop;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SummaryPage {

	private String returnId;

	private String orderablePartNumber;

	private String customerPartNumber;

	private FirstPage firstPage;
	private SecondPage secondPage;
	private ThirdPage thirdPage;
	private FourthPage fourthPage;

	private MyTiAccountDetails myTiAccountDetails;
	private ContactDetails contactDetails;

	public MyTiAccountDetails getMyTiAccountDetails() {
		return myTiAccountDetails;
	}

	@XmlElement
	public void setMyTiAccountDetails(MyTiAccountDetails myTiAccountDetails) {
		this.myTiAccountDetails = myTiAccountDetails;
	}

	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	@XmlElement
	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}

	public String getReturnId() {
		return returnId;
	}

	@XmlAttribute
	public void setReturnId(String returnId) {
		this.returnId = returnId;
	}

	public String getOrderablePartNumber() {
		return orderablePartNumber;
	}

	@XmlElement
	public void setOrderablePartNumber(String orderablePartNumber) {
		this.orderablePartNumber = orderablePartNumber;
	}

	public String getCustomerPartNumber() {
		return customerPartNumber;
	}

	@XmlElement
	public void setCustomerPartNumber(String customerPartNumber) {
		this.customerPartNumber = customerPartNumber;
	}

	public FirstPage getFirstPage() {
		return firstPage;
	}

	@XmlElement
	public void setFirstPage(FirstPage firstPage) {
		this.firstPage = firstPage;
	}

	public SecondPage getSecondPage() {
		return secondPage;
	}

	@XmlElement
	public void setSecondPage(SecondPage secondPage) {
		this.secondPage = secondPage;
	}

	public ThirdPage getThirdPage() {
		return thirdPage;
	}

	@XmlElement
	public void setThirdPage(ThirdPage thirdPage) {
		this.thirdPage = thirdPage;
	}

	public FourthPage getFourthPage() {
		return fourthPage;
	}

	@XmlElement
	public void setFourthPage(FourthPage fourthPage) {
		this.fourthPage = fourthPage;
	}

}
