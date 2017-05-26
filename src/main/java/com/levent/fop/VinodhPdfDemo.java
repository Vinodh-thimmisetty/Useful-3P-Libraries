package com.levent.fop;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.fop.apps.FOPException;
import org.apache.fop.apps.FOUserAgent;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.fop.apps.MimeConstants;

public class VinodhPdfDemo {

	public static final String RESOURCES_DIR;
	public static final String OUTPUT_DIR;

	static {
		RESOURCES_DIR = "src//main//resources//";
		OUTPUT_DIR = "src//main//resources//output//";
	}

	public static void main(String[] args) throws JAXBException {
		VinodhPdfDemo fOPPdfDemo = new VinodhPdfDemo();
		try {
			fOPPdfDemo.convertToPDF();
		} catch (FOPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Method that will convert the given XML to PDF
	 * 
	 * @throws IOException
	 * @throws FOPException
	 * @throws TransformerException
	 * @throws JAXBException 
	 */
	public void convertToPDF() throws IOException, FOPException,
			TransformerException, JAXBException {
		// the XSL FO file
		File xsltFile = new File(RESOURCES_DIR + "//summary.xsl");
		FirstPage firstPage = new FirstPage();
		firstPage.setDistNumber("Vinodh");
		firstPage.setMfgThirdParty(false);
		firstPage.setSalesOrderNumber(45646);
		firstPage.setPurchasedFrom("Sales1");
		firstPage.setSalesName("Kumar1");

		SecondPage secondPage = new SecondPage();
		secondPage.setDistNumber2("Thimmi");
		secondPage.setMfgThirdParty2(true);
		secondPage.setSalesOrderNumber2(45646);
		secondPage.setPurchasedFrom2("dsd3");
		secondPage.setSalesName2("afasdadasds2");

		ThirdPage thirdPage = new ThirdPage();
		thirdPage.setDistNumber3("asdsvbapjaspad3");
		thirdPage.setMfgThirdParty3(false);
		thirdPage.setSalesOrderNumber3(45646);
		thirdPage.setPurchasedFrom3("casavasvs3");
		thirdPage.setSalesName3("afvsvasvs3");

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
		
		JAXBContext context = JAXBContext.newInstance(SummaryPage.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		StringWriter stringWriter = new StringWriter();
		marshaller.marshal(page, stringWriter);
		
		// the XML file which provides the input
		/*StreamSource xmlSource = new StreamSource(new File(RESOURCES_DIR
				+ "//summary.xml"));*/
		StreamSource xmlSource = new StreamSource(new StringReader(stringWriter.toString()));
		// create an instance of fop factory
		FopFactory fopFactory = FopFactory.newInstance(new File(".").toURI());
		// a user agent is needed for transformation
		FOUserAgent foUserAgent = fopFactory.newFOUserAgent();
		// Setup output
		OutputStream out;
		out = new java.io.FileOutputStream(OUTPUT_DIR + "//summary.pdf");

		try {
			// Construct fop with desired output format
			Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, foUserAgent,
					out);

			// Setup XSLT
			TransformerFactory factory = TransformerFactory.newInstance();
			Transformer transformer = factory.newTransformer(new StreamSource(
					xsltFile));

			// Resulting SAX events (the generated FO) must be piped through to
			// FOP
			Result res = new SAXResult(fop.getDefaultHandler());

			// Start XSLT transformation and FOP processing
			// That's where the XML is first transformed to XSL-FO and then
			// PDF is created
			transformer.transform(xmlSource, res);
		} finally {
			out.close();
		}
	}

}
