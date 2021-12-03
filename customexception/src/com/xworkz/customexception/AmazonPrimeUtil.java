package com.xworkz.customexception;

import com.xworkz.exception.NotAPrimeMemberException;

public class AmazonPrimeUtil {

	public static void main(String[] args) throws NotAPrimeMemberException {
		AmazonPrime amazonPrime = new AmazonPrime();
		amazonPrime.freeDelivery(true, "china");
	}
}
