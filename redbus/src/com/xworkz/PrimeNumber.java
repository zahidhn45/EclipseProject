package com.xworkz;

public class PrimeNumber {

	public static String prime(int num) {
		int count = 0;
		if (num == 0 || num == 1) {
			System.out.println("Prime Number");
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		return count > 2 ? num + " is Not prime" : num + " is prime";
	}

	public static void main(String[] args) {
		int num = 1;
		String prime = prime(num);
		System.out.println(prime);
	}
}
