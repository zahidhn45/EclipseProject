package com.xworkz.practiceproblems.question2.dto;

public class ItemTypeDTO {

	private String name;
	private double deposit;
	private double costPerDay;

	public ItemTypeDTO(String name, double deposit, double costPerDay) {
		super();
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}

	@Override
	public String toString() {
		return String.format("%-20s%-20.1f%-20.1f", name, deposit, costPerDay);
	}

}
