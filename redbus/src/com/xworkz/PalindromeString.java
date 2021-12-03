package com.xworkz;

public class PalindromeString {

	static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;

		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		String name = "mum";
		boolean palindrome = isPalindrome(name);

		String palin = !palindrome ? name + " is not palindrome" : name + " is palindrome";
		System.out.println(palin);
	}
}
