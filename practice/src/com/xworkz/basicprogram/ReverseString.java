package com.xworkz.basicprogram;

public class ReverseString {

	public static void main(String[] args) {
		String name = "zahid";

		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
	}
}
