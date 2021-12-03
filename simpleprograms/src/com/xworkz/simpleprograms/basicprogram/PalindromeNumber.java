package com.xworkz.simpleprograms.basicprogram;

public class PalindromeNumber {

	public static String palindromeNumber(int num) {
		int temp = num, rev = 0;
		while (temp != 0) {
			rev = rev * 10 + temp % 10;
			temp /= 10;
		}
		return rev == num ? num + " is palindrome" : num + " is not palindrome";
	}

	public static boolean palindromeString(String str) {
		if (str.length() == 0 || str.length() == 1)
			return true;
		if (str.charAt(0) == str.charAt(str.length() - 1))
			return palindromeString(str.substring(1, str.length() - 1));
		return false;
	}

	public static void main(String[] args) {
		int num = 1345431;
		String str = "zahidihaz";
		System.out.println(palindromeNumber(num));
		boolean palinStr = palindromeString(str);
		String palin = palinStr ? str + " is palindrome" : str + " is not palindrome";
		System.out.println(palin);
	}
}
