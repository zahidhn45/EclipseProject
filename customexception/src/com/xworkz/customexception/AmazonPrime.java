package com.xworkz.customexception;

import com.xworkz.exception.NotAPrimeMemberException;

public class AmazonPrime {

	public void freeDelivery(boolean primeMember, String country) throws NotAPrimeMemberException {
		System.out.println("Inside freeDelivery()");
		if (primeMember == true && country.equals("India")) {
			System.out.println("Free delivery Available");
		} else {
			System.err.println("Free delevery not available");
			throw new NotAPrimeMemberException();
		}
	}
}
