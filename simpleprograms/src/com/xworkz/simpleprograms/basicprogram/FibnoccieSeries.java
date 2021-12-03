package com.xworkz.simpleprograms.basicprogram;

public class FibnoccieSeries {

	public static void fibnocci(int num) {
		int num1 = 0, num2 = 1, sum = 0;
		System.out.println("Fibnocci series are");
		System.out.print(num1 + " " + num2);
		for (int i = 2; i <= num; i++) {
			sum = num1 + num2;
			System.out.print(" " + sum);
			num1 = num2;
			num2 = sum;
		}
	}

	public static void main(String[] args) {
		int num = 10;
		fibnocci(num);
	}
}
