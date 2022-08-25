package com.hexaware.hibernateinheritancetablepersubclass.entity;

public class AmazonCustomer {
	
	private Long customerId;
	private String customerName;
	private String customerMobileNo;
	private String customerEmail;
	
	
	public AmazonCustomer() {
		// TODO Auto-generated constructor stub
	}


	public AmazonCustomer(Long customerId, String customerName, String customerMobileNo, String customerEmail) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerMobileNo = customerMobileNo;
		this.customerEmail = customerEmail;
	}


	public AmazonCustomer(String customerName, String customerMobileNo, String customerEmail) {
		super();
		this.customerName = customerName;
		this.customerMobileNo = customerMobileNo;
		this.customerEmail = customerEmail;
	}


	public Long getCustomerId() {
		return customerId;
	}


	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerMobileNo() {
		return customerMobileNo;
	}


	public void setCustomerMobileNo(String customerMobileNo) {
		this.customerMobileNo = customerMobileNo;
	}


	public String getCustomerEmail() {
		return customerEmail;
	}


	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	
}
