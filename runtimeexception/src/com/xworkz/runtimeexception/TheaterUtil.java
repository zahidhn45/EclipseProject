package com.xworkz.runtimeexception;

import java.util.Scanner;

public class TheaterUtil {

	/*
	 * static boolean isPalindrome(String str) { // If string has 0 or 1 character
	 * if (str.length() == 0 || str.length() == 1) return true; // If string has
	 * multiple characters // Check whether first and last characters are same or
	 * not if (str.charAt(0) == str.charAt(str.length() - 1)) return
	 * isPalindrome(str.substring(1, str.length() - 1)); return false; }
	 */

	static boolean isPalindrome(String str) {
		if (str.length() == 0 || str.length() == 1) {
			return true;
		}
		if (str.charAt(0) == str.charAt(str.length() - 1)) {
			return isPalindrome(str.substring(1, str.length() - 1));
		}
		return false;
	}

	public static void main(String[] args) {
//		Theater theater = new Theater("Mugilpete");
//		theater.bookTicket("Mugilpete", TicketType.GANDHI_CLASS, 5);
//		theater.bookTicket("Mugilpete", TicketType.MIDDLE_CLASS, 5);
//		theater.bookTicket("Mugilpete", TicketType.BALCONY, 2);

		// Take input from the user
		// Take input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		boolean palin = isPalindrome(str);
		String temp = palin ? str + " is palindrome" : str + " is not palindrome";
		System.out.println(temp);
	}
}
