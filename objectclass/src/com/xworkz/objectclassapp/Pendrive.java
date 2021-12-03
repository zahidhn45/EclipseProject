package com.xworkz.objectclassapp;

public class Pendrive {
	private int capacity;
	private String working;
	private String brand;
	private double price;

	public Pendrive(int capacity, String working, String brand, double price) {
		super();
		this.capacity = capacity;
		this.working = working;
		this.brand = brand;
		this.price = price;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getWorking() {
		return working;
	}

	public void setWorking(String working) {
		this.working = working;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double isPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pendrive - [capacity=" + capacity + ", working=" + working + ", brand=" + brand + ", price=" + price
				+ "]";
	}

}
