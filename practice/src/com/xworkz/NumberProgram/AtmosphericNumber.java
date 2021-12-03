package com.xworkz.NumberProgram;

public class AtmosphericNumber {

	public static void main(String[] args) {

		int num = 76, i = 0, temp = 0;
		int square = num * num;
		int length = String.valueOf(num).length();
		while (i < length) {
			temp = temp * 10 + square % 10;
			square /= 10;
			i++;
		}
		int ans = 0;
		while (temp != 0) {
			ans = ans * 10 + temp % 10;
			temp /= 10;
		}

		String armstrong = ans == num ? num + " is a Armstrong Number" : num + " is not a Armstrong number";
		System.out.println(armstrong);

	}
}
