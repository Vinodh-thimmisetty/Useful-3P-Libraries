package com.levent.fop;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class SummaryXMLGeneration {

	public static void main(String[] args) throws JAXBException {

		FirstPage firstPage = new FirstPage();
		firstPage.setDistNumber("asdsad1");
		firstPage.setMfgThirdParty(false);
		firstPage.setSalesOrderNumber(45646);
		firstPage.setPurchasedFrom("Sales1");
		firstPage.setSalesName("afs1");

		SecondPage secondPage = new SecondPage();
		secondPage.setDistNumber2("asdsad2");
		secondPage.setMfgThirdParty2(true);
		secondPage.setSalesOrderNumber2(45646);
		secondPage.setPurchasedFrom2("dsd3");
		secondPage.setSalesName2("afs2");

		ThirdPage thirdPage = new ThirdPage();
		thirdPage.setDistNumber3("asdsad3");
		thirdPage.setMfgThirdParty3(false);
		thirdPage.setSalesOrderNumber3(45646);
		thirdPage.setPurchasedFrom3("cas3");
		thirdPage.setSalesName3("afs3");

		FourthPage fourthPage = new FourthPage();
		fourthPage.setDistNumber4("asdsad3");
		fourthPage.setMfgThirdParty4(true);
		fourthPage.setSalesOrderNumber4(45646);
		fourthPage.setPurchasedFrom4("cas3");
		fourthPage.setSalesName4("afs3");
		
		MyTiAccountDetails accountDetails = new MyTiAccountDetails();
		accountDetails.setDob(new Date());
		accountDetails.setEmail("sd#@vsdv.com");
		accountDetails.setFirstName("Vinodh");
		accountDetails.setLastName("Thimmisetty");
		accountDetails.setPhone(898546123);
		
		ContactDetails contactDetails = new ContactDetails();
		contactDetails.setContactAddress("casdasdasdasd");
		contactDetails.setContactCity("cascasdascs");
		contactDetails.setContactEmail("casdfr@vsd.com");
		contactDetails.setContactEnemy("casdcasdc");
		contactDetails.setContactFriend("weqqweqweqw");
		contactDetails.setContactName("Niv");
		contactDetails.setContactPhone(456416416);
		
		SummaryPage page = new SummaryPage();
		page.setReturnId("CPR-17-12345");
		page.setOrderablePartNumber("OPA333AID");
		page.setCustomerPartNumber("ABCD1234");
		page.setFirstPage(firstPage);
		page.setSecondPage(secondPage);
		page.setThirdPage(thirdPage);
		page.setFourthPage(fourthPage);
		page.setMyTiAccountDetails(accountDetails);
		page.setContactDetails(contactDetails);
		System.out.println("---------");

		File file = new File("src//main//resources//summary.xml");
		JAXBContext context = JAXBContext.newInstance(SummaryPage.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		marshaller.marshal(page, file);
		// convert to pdf
		marshaller.marshal(page, System.out);

	}

}
