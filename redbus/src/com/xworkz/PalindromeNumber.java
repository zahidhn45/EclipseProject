package com.xworkz;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 12345;
		int temp = num;
		int rev = 0;
		while (temp != 0) {
			rev = rev * 10 + temp % 10;
			temp /= 10;
		}
		String palindrome = num == rev ? num + " is palindrome" : num + " is not palindrome";
		System.out.println(palindrome);
	}
}
