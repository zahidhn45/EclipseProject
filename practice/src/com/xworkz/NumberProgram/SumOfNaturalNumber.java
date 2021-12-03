package com.xworkz.NumberProgram;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		int range = 100;
		int sum = 0;
		for (int i = 1; i <= range; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
