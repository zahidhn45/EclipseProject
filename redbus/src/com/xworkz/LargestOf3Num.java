package com.xworkz;

public class LargestOf3Num {

	public static int largest(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			return num1;
		} else if (num2 > num1 && num2 > num3) {
			return num2;
		} else {
			return num3;
		}
	}

	public static void main(String[] args) {
		int num1 = 122, num2 = 66, num3 = 32;
		System.out.println(largest(num1, num2, num3));
	}
}
