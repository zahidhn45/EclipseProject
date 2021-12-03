package com.xworkz.basicprogram;

public class PrimeNumber {
	public static void main(String[] args) {
		int num = 2;
		int count = 0;

		if (num == 0 || num == 1) {
			System.out.println(num + " Not a Prime number");
		} else {
			for (int i = 2; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			String prime = count > 2 ? num + " is not prime number" : num + " is Prime Number";
			System.out.println(prime);
		}
	}
}
