package com.xworkz.practice;

public class SwapNumber {

	public static void main(String[] args) {
		int a = 10, b = 20;

		System.out.println("a: " + a + " b: " + b);
		int temp = a;
		a = b;
		b = temp;

		System.out.println("a: " + a + " b: " + b);
	}
}
