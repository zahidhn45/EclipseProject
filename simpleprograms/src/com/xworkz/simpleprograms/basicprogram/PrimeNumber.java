package com.xworkz.simpleprograms.basicprogram;

public class PrimeNumber {

	public static String prime(int num) {
		int count = 0;
		if (num == 0 || num == 1)
			return num + " is not prime";
		else {
			for (int i = 2; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
		}
		return count > 2 ? num + " is not prime" : num + " is prime";
	}

	public static void main(String[] args) {
		int num = 10;
		System.out.println(prime(num));
	}
}
