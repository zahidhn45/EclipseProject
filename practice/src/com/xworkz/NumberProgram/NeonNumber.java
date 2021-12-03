package com.xworkz.NumberProgram;

public class NeonNumber {

	public static void main(String[] args) {
		int num = 45;

		int square = num * num;
		int sum = 0;
		while (square != 0) {
			int res = square % 10;
			sum += res;
			square /= 10;
		}
		String neon = sum == num ? num + " is neon number" : num + " is not neon number";
		System.out.println(neon);
	}
}
