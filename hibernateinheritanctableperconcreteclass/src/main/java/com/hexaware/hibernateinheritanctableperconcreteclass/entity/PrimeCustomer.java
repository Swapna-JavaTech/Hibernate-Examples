package com.hexaware.hibernateinheritanctableperconcreteclass.entity;

public class PrimeCustomer extends AmazonCustomer{
	
	private String validityOfSubscription;
	
	public PrimeCustomer() {
		// TODO Auto-generated constructor stub
	}

	public PrimeCustomer(String validityOfSubscription) {
		super();
		this.validityOfSubscription = validityOfSubscription;
	}

	public String getValidityOfSubscription() {
		return validityOfSubscription;
	}

	public void setValidityOfSubscription(String validityOfSubscription) {
		this.validityOfSubscription = validityOfSubscription;
	}
	
	

}
