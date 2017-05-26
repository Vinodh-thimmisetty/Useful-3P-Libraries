package com.levent.fop;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FourthPage {

	 private String purchasedFrom4;
	 private String orderNumber4;
	 private String distNumber4;
	 private String salesName4;
	 private boolean isMfgThirdParty4;
	 private long salesOrderNumber4;
	public String getPurchasedFrom4() {
		return purchasedFrom4;
	}
	@XmlElement
	public void setPurchasedFrom4(String purchasedFrom4) {
		this.purchasedFrom4 = purchasedFrom4;
	}
	public String getOrderNumber4() {
		return orderNumber4;
	}
	@XmlElement
	public void setOrderNumber4(String orderNumber4) {
		this.orderNumber4 = orderNumber4;
	}
	public String getDistNumber4() {
		return distNumber4;
	}
	@XmlElement
	public void setDistNumber4(String distNumber4) {
		this.distNumber4 = distNumber4;
	}
	public String getSalesName4() {
		return salesName4;
	}
	@XmlElement
	public void setSalesName4(String salesName4) {
		this.salesName4 = salesName4;
	}
	public boolean isMfgThirdParty4() {
		return isMfgThirdParty4;
	}
	@XmlElement
	public void setMfgThirdParty4(boolean isMfgThirdParty4) {
		this.isMfgThirdParty4 = isMfgThirdParty4;
	}
	public long getSalesOrderNumber4() {
		return salesOrderNumber4;
	}
	@XmlElement
	public void setSalesOrderNumber4(long salesOrderNumber4) {
		this.salesOrderNumber4 = salesOrderNumber4;
	} 
	
}
