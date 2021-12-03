package com.xworkz.customexception;

import com.xworkz.exception.NotEligibleForVote;

public class ElectorialCommission {

	public void canVote(String name, int age) throws NotEligibleForVote {
		System.out.println("Inside canVote()");
		if (name != null && name.length() > 2 && name.length() <= 26 && age >= 18) {
			System.out.println("You can vote");
		} else {
			System.err.println("You can't vote");
			throw new NotEligibleForVote();
		}
	}
}
