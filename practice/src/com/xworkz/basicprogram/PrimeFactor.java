package com.xworkz.basicprogram;

public class PrimeFactor {

	public static boolean isPalindrome(String str) {
		if (str.length() == 0 || str.length() == 1)
			return true;
		if (str.charAt(0) == str.charAt(str.length() - 1))
			return isPalindrome(str.substring(1, str.length() - 1));
		return false;
	}

	public static void main(String[] args) {
		int num = 25;
		String str = "123321";

		String palin = isPalindrome(str) ? str + " is palindrome" : str + " is not palindrome";
		System.out.println(palin);

		System.out.print("Prime factors of " + num + " are ");
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
