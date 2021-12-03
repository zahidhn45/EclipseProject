package com.xworkz.NumberProgram;

public class SpyNumber {

	public static void main(String[] args) {
		int num = 132;
		int temp = num;
		int sum = 0;
		int product = 1;

		while (temp != 0) {
			int res = temp % 10;
			sum += res;
			product *= res;
			temp /= 10;
		}
		System.out.println(sum);
		System.out.println(product);
		String spy = sum == product ? num + " is spy number" : num + " is not spy number";
		System.out.println(spy);
	}
}
