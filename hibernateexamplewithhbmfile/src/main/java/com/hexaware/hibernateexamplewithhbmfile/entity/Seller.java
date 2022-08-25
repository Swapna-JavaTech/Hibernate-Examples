package com.hexaware.hibernateexamplewithhbmfile.entity;

public class Seller {
	
	private Long sellerId;
	private String sellerName;
	private String sellerEmail;
	
	public Seller() {
		// TODO Auto-generated constructor stub
	}

	public Seller(Long sellerId, String sellerName, String sellerEmail) {
		super();
		this.sellerId = sellerId;
		this.sellerName = sellerName;
		this.sellerEmail = sellerEmail;
	}
	
	public Seller(String sellerName, String sellerEmail) {
		super();
		this.sellerName = sellerName;
		this.sellerEmail = sellerEmail;
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerEmail() {
		return sellerEmail;
	}

	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}
	
	

}
