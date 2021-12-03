package com.xworkz.customexception;

import com.xworkz.exception.CashLessException;

public class MedicalInsurenceUtil {

	public static void main(String[] args) throws CashLessException {
		MedicalInsurance medicalInsurance = new MedicalInsurance();
		medicalInsurance.canAvailCashLess("Zahid", 15.00);
	}
}
