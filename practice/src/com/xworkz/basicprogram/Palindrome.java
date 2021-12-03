package com.xworkz.basicprogram;

public class Palindrome {
	public static void main(String[] args) {
		int num = 12345432;
		int temp = num;
		int rev = 0;
		while (temp != 0) {
			rev = rev * 10 + temp % 10;
			temp /= 10;
		}

		String palin = rev == num ? num + " is palindrome Number" : num + " is not palindrome";
		System.out.println(palin);
	}
}
