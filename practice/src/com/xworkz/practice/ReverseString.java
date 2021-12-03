package com.xworkz.practice;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "zahid";
		System.out.println("The string is " + str);
		System.out.println("Enter character from string");
		char ch = sc.next().charAt(0);
//		for (int i = str.length() - 1; i >= 0; i--) { // d = 5
//			System.out.print(str.charAt(i));
//		}

		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				System.out.println(str.charAt(i) + " = " + (i + 1));
			}

		}
	}
}
