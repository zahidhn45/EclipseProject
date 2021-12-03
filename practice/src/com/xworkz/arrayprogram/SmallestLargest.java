package com.xworkz.arrayprogram;

public class SmallestLargest {

	public static void main(String[] args) {
		int[] arr = { 4, 9, 2, 5, 10, 45 };
		int smallest = arr[0];
		int largest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (smallest > arr[i]) {
				smallest = arr[i];
			}
			if (largest < arr[i]) {
				largest = arr[i];
			}
		}
		System.out.println(smallest);
		System.out.println(largest);
	}
}
