package com.xworkz.abstractionapp;

public abstract class Bank {
	public void bankBrunch(String name, String ifscCode) {
		System.out.println("Inside bankBrunch");
	}

	public abstract void provideLoan();

	public abstract void openAccount();

	public abstract void closeAccount();

}
