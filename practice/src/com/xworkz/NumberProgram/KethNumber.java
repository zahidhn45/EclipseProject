package com.xworkz.NumberProgram;

public class KethNumber {

	public static void main(String[] args) {
		int num = 742;
		int i = 0;
		int res1 = 0;
		int res = 0;
		int temp1;
		int temp = temp1 = num;
		int sum = 0, sum1 = 0;
		int length = String.valueOf(temp).length();

		while (temp1 != 0) {
			while (temp != 0) {
				res = temp % 10;
				sum = sum + res;
				temp /= 10;
			}
			while (i < (length - 1)) {
				res1 = res1 * 10 + num % 10;
				sum1 = sum1 + res1 + sum;
				num /= 10;
				i++;
			}
			temp1++;
		}
		System.out.println("Res1 " + res1);

		System.out.println();
		System.out.println(sum1);
	}
}

// OUTPUT NOT FOUND....!!!!
