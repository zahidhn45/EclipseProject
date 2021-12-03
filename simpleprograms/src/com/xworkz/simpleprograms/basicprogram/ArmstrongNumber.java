package com.xworkz.simpleprograms.basicprogram;

public class ArmstrongNumber {

	public static String armstrong(int num) {
		int temp = num;
		int length = String.valueOf(num).length();
		int rev = 0, arm = 0;
		while (temp != 0) {
			rev = temp % 10;
			arm += (int) Math.pow(rev, length);
			temp /= 10;
		}
		return num == arm ? num + " is Armstrong Number" : num + " is not Armstrong number";
	}

	public static void main(String[] args) {
		int num = 153;
		System.out.println(armstrong(num));
	}
}
