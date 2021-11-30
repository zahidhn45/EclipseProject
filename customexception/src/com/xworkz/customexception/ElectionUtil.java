package com.xworkz.customexception;

import com.xworkz.exception.NotEligibleForVote;

public class ElectionUtil {

	public static void main(String[] args) throws NotEligibleForVote {
		ElectorialCommission election = new ElectorialCommission();
		election.canVote("Za", 21);
	}
}
