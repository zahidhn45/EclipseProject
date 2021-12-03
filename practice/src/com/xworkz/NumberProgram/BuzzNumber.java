package com.xworkz.NumberProgram;

public class BuzzNumber {

	public static void main(String[] args) {
		int num = 147;
		int lastDigit = num % 10;

		if (num % 7 == 0 || lastDigit == 7) {
			System.out.println(num + " Buzz number");
		} else {
			System.out.println(num + " is Not Buzz Number");
		}

	}
}
