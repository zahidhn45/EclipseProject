package com.xworkz.stringprogram;

public class CountVowel {

	public static void main(String[] args) {
		String str = "Zahid";

		int vowelcount = 0;
		int consCount = 0;

		for (int i = 0; i < str.toLowerCase().length(); i++) {
			if ((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o')
					|| (str.charAt(i) == 'u')) {
				vowelcount++;
			} else {
				consCount++;
			}
		}
		System.out.println(vowelcount);
		System.out.println(consCount);
	}
}
