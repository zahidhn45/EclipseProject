package com.xworkz.practice;

public class DuplicateElement {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
		int duplicate = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					duplicate = arr[i];
					System.out.print(duplicate + " ");
				}
			}
		}
	}
}
