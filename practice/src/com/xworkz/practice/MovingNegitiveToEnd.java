package com.xworkz.practice;

public class MovingNegitiveToEnd {
	public static void main(String[] args) {
		int[] arr = { -5, 7, -3, -4, 9, 10, -1, 11 }; // 7 9 10 11 -5 -3 -4 -1
		int positive = 0;
		int negitive = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				positive = arr[i];
				System.out.print(positive + " ");
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				negitive = arr[i];
				System.out.print(" " + negitive + " ");

			}
		}
	}
}
