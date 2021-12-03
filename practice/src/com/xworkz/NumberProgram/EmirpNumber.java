package com.xworkz.NumberProgram;

public class EmirpNumber {

	public static String prime(int num) {
		int count = 0;

		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		return count > 2 ? "Not prime" : "Prime";
	}

	public static int reverse(int num) {
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		int num = 3049;
		String emrip = prime(num) == prime(reverse(num)) ? +num + " is Emrip Number" : num + " is not Emrip Number";
		System.out.println(emrip);
	}
}
