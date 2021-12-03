package com.xworkz.practice;

public class AtmosphericNumber {
	public static void main(String[] args) {
		int num = 76;

		int square = num * num;
		System.out.println("original num " + square);
		int rev = 0;
		int temp = 0;
		while (square != 0) {
			temp = temp * 10 + square % 10;
			while (temp != 0) {
				rev = rev * 10 + temp % 10;
				temp /= 10;
			}
			square /= 100;
		}
		System.out.println(temp);
		System.out.println(rev);

	}
}
