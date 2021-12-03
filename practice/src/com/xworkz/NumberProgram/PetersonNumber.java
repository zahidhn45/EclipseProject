package com.xworkz.NumberProgram;

public class PetersonNumber {
	public static void main(String[] args) {
		int num = 145;
		int fact = 1, sum = 0;
		int temp = num;
		while (temp != 0) {
			int rev = temp % 10;
			for (int i = 1; i <= rev; i++) {
				fact = i * fact;
			}
			sum += fact;
			temp /= 10;
			fact = 1;
		}

		String peterson = sum == num ? num + " is Peterson Number" : num + " Is not peterson number";
		System.out.println(peterson);
	}
}
