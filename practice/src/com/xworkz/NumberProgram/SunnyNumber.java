package com.xworkz.NumberProgram;

public class SunnyNumber {

	public static void main(String[] args) {
		int num = 10;

		int newNum = num + 1;
		double squareRoot = Math.sqrt(newNum);

		String sunny = squareRoot - Math.floor(squareRoot) == 0 ? num + " is sunny Number"
				: num + " is not sunny Number";
		System.out.println(sunny);
	}
}
