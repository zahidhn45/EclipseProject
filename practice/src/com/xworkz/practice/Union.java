package com.xworkz.practice;

public class Union {

	public static void main(String[] args) {
		int arr1[] = { 5, 3 };
		int[] arr2 = { 1, 2, 3, 4, 5 };
		int count = 0;
		int total = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					count++;
				}
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				total = arr1.length + arr2.length;
			}
		}
		System.out.println(total - count);
	}
}
