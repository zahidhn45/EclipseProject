package com.xworkz;

public class SwapNumber {

	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("Befor swapping: a: " + a + " and b: " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping: a: " + a + " and b: " + b);

	}
}
