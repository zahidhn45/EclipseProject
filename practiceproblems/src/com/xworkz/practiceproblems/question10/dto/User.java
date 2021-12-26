package com.xworkz.practiceproblems.question10.dto;

public class User {

	private String userName;
	private String bankName;

	public User(String userName, String bankName) {
		super();
		this.userName = userName;
		this.bankName = bankName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return String.format("%-20s%-20s", userName, bankName);
	}

}
