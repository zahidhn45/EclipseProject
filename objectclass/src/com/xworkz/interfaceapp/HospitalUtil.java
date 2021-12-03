package com.xworkz.interfaceapp;

public class HospitalUtil {

	public static void main(String[] args) {
		Hospital hospital = new MedwinCares();

		hospital.register();
		hospital.payAdvance();
		hospital.validInsurence();
	}
}
