package com.xworkz.objectclassapp;

public class Camera {
	private String brand;
	private int modelNum;
	private double price;
	private String company;

	public Camera(String brand, int modelNum, double price, String company) {
		super();
		this.brand = brand;
		this.modelNum = modelNum;
		this.price = price;
		this.company = company;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getModelNum() {
		return modelNum;
	}

	public void setModelNum(int modelNum) {
		this.modelNum = modelNum;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Camera - [brand=" + brand + ", modelNum=" + modelNum + ", price=" + price + ", company=" + company
				+ "]";
	}

}
