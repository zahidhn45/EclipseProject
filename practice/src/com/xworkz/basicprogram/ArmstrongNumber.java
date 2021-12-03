package com.xworkz.basicprogram;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num = 1634;
		int temp = num;
		int arm = 0;
		int length = String.valueOf(num).length();
		while (temp != 0) {
			int res = temp % 10;
			arm += Math.pow(res, length);
			temp /= 10;
		}
		System.out.println(arm);
		String armstrong = num == arm ? num + " is armstrong number" : num + " is not armstrong number";
		System.out.println(armstrong);
	}
}
