package com.xworkz.customexception;

import com.xworkz.exception.CashLessException;

public class MedicalInsurance {

	void canAvailCashLess(String name, double toalHours) throws CashLessException {
		System.out.println("Inside canAvailcashLess");
		if (name != null && name.length() > 2 && name.length() <= 26 && toalHours >= 14.0) {
			System.out.println("Can Avail cash less");
		} else {
			System.err.println("Can't Avail case less");
			throw new CashLessException();
		}
	}
}
