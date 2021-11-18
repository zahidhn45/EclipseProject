package com.xworkz.objectclassapp;

public class Sweet {
	private String name;
	private String color;
	private double price;
	private String shape;

	public Sweet(String name, String color, double price, String shape) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.shape = shape;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	@Override
	public String toString() {
		return "Sweet - [name=" + name + ", color=" + color + ", price=" + price + ", shape=" + shape + "]";
	}

}
