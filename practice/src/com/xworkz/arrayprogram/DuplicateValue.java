package com.xworkz.arrayprogram;

public class DuplicateValue {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 2, 6, 1, 4, 9, 6 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
				}
			}
		}
	}
}
