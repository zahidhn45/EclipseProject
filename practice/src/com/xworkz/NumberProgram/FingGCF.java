package com.xworkz.NumberProgram;

public class FingGCF {

	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 8;
		int gcd = 1;

		for (int i = 1; i <= num1 && i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		System.out.println("GCD is " + gcd);
	}
}
