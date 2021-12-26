package com.xworkz.practiceproblems.question3.dto;

public class HallDTO {

	private String name;
	private String contactNumber;
	private double costPerDay;
	private String ownerName;

	public HallDTO(String name, String contactNumber, double costPerDay, String ownerName) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.costPerDay = costPerDay;
		this.ownerName = ownerName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return String.format("%-20s%-20s%-20.1f%-20s", name, contactNumber, costPerDay, ownerName);
	}
}
