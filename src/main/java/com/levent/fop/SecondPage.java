package com.levent.fop;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SecondPage {

	 private String purchasedFrom2;
	 private String orderNumber2;
	 private String distNumber2;
	 private String salesName2;
	 private boolean isMfgThirdParty2;
	 private long salesOrderNumber2;
	public String getPurchasedFrom2() {
		return purchasedFrom2;
	}
	@XmlElement
	public void setPurchasedFrom2(String purchasedFrom2) {
		this.purchasedFrom2 = purchasedFrom2;
	}
	public String getOrderNumber2() {
		return orderNumber2;
	}
	@XmlElement
	public void setOrderNumber2(String orderNumber2) {
		this.orderNumber2 = orderNumber2;
	}
	public String getDistNumber2() {
		return distNumber2;
	}
	@XmlElement
	public void setDistNumber2(String distNumber2) {
		this.distNumber2 = distNumber2;
	}
	public String getSalesName2() {
		return salesName2;
	}
	@XmlElement
	public void setSalesName2(String salesName2) {
		this.salesName2 = salesName2;
	}
	 public boolean isMfgThirdParty2() {
		return isMfgThirdParty2;
	}
	@XmlElement
	public void setMfgThirdParty2(boolean isMfgThirdParty2) {
		this.isMfgThirdParty2 = isMfgThirdParty2;
	}
	public long getSalesOrderNumber2() {
		return salesOrderNumber2;
	}
	@XmlElement
	public void setSalesOrderNumber2(long salesOrderNumber2) {
		this.salesOrderNumber2 = salesOrderNumber2;
	}
 
	
}
