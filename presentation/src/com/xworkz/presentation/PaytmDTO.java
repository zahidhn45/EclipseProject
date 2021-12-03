package com.xworkz.presentation;

public class PaytmDTO {

	private int paytmId;
	private double Amount;
	private String name;

	public PaytmDTO(int paytmId, double amount, String name) {
		super();
		this.paytmId = paytmId;
		Amount = amount;
		this.name = name;
	}

	public PaytmDTO() {
	}

	public int getPaytmId() {
		return paytmId;
	}

	public void setPaytmId(int paytmId) {
		this.paytmId = paytmId;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
