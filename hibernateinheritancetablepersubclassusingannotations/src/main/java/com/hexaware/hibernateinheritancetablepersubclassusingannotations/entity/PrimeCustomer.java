package com.hexaware.hibernateinheritancetablepersubclassusingannotations.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="pricust_info")
@PrimaryKeyJoinColumn(name = "prid")
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
