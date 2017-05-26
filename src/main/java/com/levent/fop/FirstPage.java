package com.levent.fop;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class FirstPage {
	
	private String purchasedFrom;
	 private String orderNumber;
	 private String distNumber;
	 private String salesName;
	 private boolean isMfgThirdParty;
	 private long salesOrderNumber;
	public String getPurchasedFrom() {
		return purchasedFrom;
	}
	@XmlElement
	 public void setPurchasedFrom(String purchasedFrom) {
		this.purchasedFrom = purchasedFrom;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	@XmlElement
		public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getDistNumber() {
		return distNumber;
	}
	@XmlElement
	public void setDistNumber(String distNumber) {
		this.distNumber = distNumber;
	}
	public String getSalesName() {
		return salesName;
	}
	@XmlElement
	public void setSalesName(String salesName) {
		this.salesName = salesName;
	}

	public boolean isMfgThirdParty() {
		return isMfgThirdParty;
	}
	@XmlElement
	public void setMfgThirdParty(boolean isMfgThirdParty) {
		this.isMfgThirdParty = isMfgThirdParty;
	}
	public long getSalesOrderNumber() {
		return salesOrderNumber;
	}
	@XmlElement
	public void setSalesOrderNumber(long salesOrderNumber) {
		this.salesOrderNumber = salesOrderNumber;
	}
	
	
	

}
