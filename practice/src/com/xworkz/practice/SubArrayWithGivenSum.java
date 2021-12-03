package com.xworkz.practice;

public class SubArrayWithGivenSum {
	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3, 7, 5 };
		int sum = 0;
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int s = 21; // output - 1 5;
		System.out.print(1 + " ");
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum == s) {
				System.out.println(i + 1);
			}
		}
	}
}
