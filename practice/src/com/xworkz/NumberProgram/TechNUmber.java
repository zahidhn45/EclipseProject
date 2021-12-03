package com.xworkz.NumberProgram;

public class TechNUmber {

	public static void main(String[] args) {
		int num = 10000;
		int rev = num % 100;
		int rev1 = num / 100;

		System.out.println(rev);
		System.out.println(rev1);
		int sum = rev + rev1;
		int square = sum * sum;

		String tech = square == num ? num + " is tech Number" : num + " is not tech numbr";
		System.out.println(tech);
	}
}
