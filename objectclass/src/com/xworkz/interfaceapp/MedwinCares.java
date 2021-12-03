package com.xworkz.interfaceapp;

public class MedwinCares implements Hospital {

	@Override
	public void register() {
		System.out.println("Registered in hospital");
	}

	@Override
	public void payAdvance() {
		System.out.println("Pay advance");
	}

	@Override
	public void validInsurence() {
		System.out.println("insurence is valid");
	}

}
