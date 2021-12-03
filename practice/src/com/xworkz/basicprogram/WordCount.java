package com.xworkz.basicprogram;

public class WordCount {

	public static void main(String[] args) {
		String word = "zahid is a good boy";
		int count = 0;

		String[] slitt = word.split(" ");
		for (int i = 0; i < slitt.length; i++) {
			count++;
		}
		System.out.println(count);
	}
}
