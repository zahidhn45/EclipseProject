package com.xworkz.NumberProgram;

public class ISBNNumber {

	public static String reverse(long num) {
		int lenth = String.valueOf(num).length();
		long rev = 0;
		long sum = 0;

		while (num != 0) {
			for (int i = 1; i <= lenth; i++) {
				rev = rev * 10 + num % 10;
				sum = sum + (rev * i);
				num /= 10;
				rev = 0;
			}
		}
		return sum % 11 == 0 ? "ISBN number" : "Not ISBN number";
	}

	public static void main(String[] args) {
		long num = 1259060977;

		System.out.println(reverse(num));

	}
}
