package com.hexaware.hibernateinheritanctableperconcreteclass.entity;

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
