package com.xworkz.practice;

public class RotateArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9 };
		int lastElem = arr.length + 1;

		System.out.print(lastElem + " ");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
