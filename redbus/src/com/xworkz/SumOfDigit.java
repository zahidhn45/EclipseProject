package com.xworkz;

public class SumOfDigit {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		while (num != 0) {
			int rev = num % 10;
			sum += rev;
			num /= 10;
		}
		System.out.println(sum);
	}
}
