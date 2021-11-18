package com.xworkz.objectclassapp;

public class Bridge {
	private String name;
	private double length;
	private double cost;
	private String openYear;

	public Bridge(String name, double length, double cost, String openYear) {
		super();
		this.name = name;
		this.length = length;
		this.cost = cost;
		this.openYear = openYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getOpenYear() {
		return openYear;
	}

	public void setOpenYear(String openYear) {
		this.openYear = openYear;
	}

	@Override
	public String toString() {
		return "Bridge - [name=" + name + ", length=" + length + ", cost=" + cost + ", openYear=" + openYear + "]";
	}

}
