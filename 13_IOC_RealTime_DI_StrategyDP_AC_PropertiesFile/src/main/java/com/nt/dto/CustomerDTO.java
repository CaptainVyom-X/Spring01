package com.nt.dto;

public class CustomerDTO {

	public String customerName;
	public String customerAddr;
	public float principalAmt;
	public float rateOfInterest;
	public float time;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddr() {
		return customerAddr;
	}

	public void setCustomerAddr(String customerAddr) {
		this.customerAddr = customerAddr;
	}

	public float getPrincipalAmt() {
		return principalAmt;
	}

	public void setPrincipalAmt(float principalAmt) {
		this.principalAmt = principalAmt;
	}

	public float getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public float getTime() {
		return time;
	}

	public void setTime(float time) {
		this.time = time;
	}

}
