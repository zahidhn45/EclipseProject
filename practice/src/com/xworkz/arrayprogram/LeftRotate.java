package com.xworkz.arrayprogram;

public class LeftRotate {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		for (int i = 1; i <= arr.length - 1; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.print(" " + arr[0]);
	}
}
