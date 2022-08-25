package com.hexaware.hibernateinheritancetablepersubclassusingannotations.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="regcust_info")
@PrimaryKeyJoinColumn(name = "regid")
public class RegularCustomer extends AmazonCustomer{
	
	private int deliveryDuration;
	
	public RegularCustomer() {
		// TODO Auto-generated constructor stub
	}

	public RegularCustomer(int deliveryDuration) {
		super();
		this.deliveryDuration = deliveryDuration;
	}

	public int getDeliveryDuration() {
		return deliveryDuration;
	}

	public void setDeliveryDuration(int deliveryDuration) {
		this.deliveryDuration = deliveryDuration;
	}
	
	

}
