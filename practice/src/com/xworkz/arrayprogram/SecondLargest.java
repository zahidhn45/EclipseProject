package com.xworkz.arrayprogram;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[] arr = { 4, 9, 5, 7, 2, 12 };

		System.out.println("Original array " + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted array " + Arrays.toString(arr));
		System.out.println(arr[arr.length - 2]);
	}
}
