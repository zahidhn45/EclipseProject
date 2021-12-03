package com.xworkz.objectclassapp;

public class CricketBat {

	private String companyName;
	private String type;
	private double price;
	private String wood;

	public CricketBat() {
	}

	public CricketBat(String companyName, String type, double price, String wood) {
		super();
		this.companyName = companyName;
		this.type = type;
		this.price = price;
		this.wood = wood;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getWood() {
		return wood;
	}

	public void setWood(String wood) {
		this.wood = wood;
	}

	@Override
	public String toString() {
		return "CricketBat - [companyName=" + companyName + ", type=" + type + ", price=" + price + ", wood=" + wood
				+ "]";
	}

}
