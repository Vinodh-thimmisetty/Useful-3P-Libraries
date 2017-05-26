package com.levent.fop;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ThirdPage {

	
 	private String purchasedFrom3;
 	private String orderNumber3;
 	private String distNumber3;
 	private String salesName3;
  	private boolean isMfgThirdParty3;
	 private long salesOrderNumber3;
	public String getPurchasedFrom3() {
		return purchasedFrom3;
	}
	@XmlElement
	public void setPurchasedFrom3(String purchasedFrom3) {
		this.purchasedFrom3 = purchasedFrom3;
	}
	public String getOrderNumber3() {
		return orderNumber3;
	}
	@XmlElement
	public void setOrderNumber3(String orderNumber3) {
		this.orderNumber3 = orderNumber3;
	}
	public String getDistNumber3() {
		return distNumber3;
	}
	@XmlElement
	public void setDistNumber3(String distNumber3) {
		this.distNumber3 = distNumber3;
	}
	public String getSalesName3() {
		return salesName3;
	}
	@XmlElement
	public void setSalesName3(String salesName3) {
		this.salesName3 = salesName3;
	}
	public boolean isMfgThirdParty3() {
		return isMfgThirdParty3;
	}
	@XmlElement
	public void setMfgThirdParty3(boolean isMfgThirdParty3) {
		this.isMfgThirdParty3 = isMfgThirdParty3;
	}
	public long getSalesOrderNumber3() {
		return salesOrderNumber3;
	}
	@XmlElement
	public void setSalesOrderNumber3(long salesOrderNumber3) {
		this.salesOrderNumber3 = salesOrderNumber3;
	}
	 



}
