package com.xworkz.simpleprograms.basicprogram;

public class Factorial {

	public static int fact(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int num = 5;
		System.out.println(fact(num));
	}
}
