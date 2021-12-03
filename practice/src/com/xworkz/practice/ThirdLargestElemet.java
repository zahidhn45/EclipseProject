package com.xworkz.practice;

public class ThirdLargestElemet {
	public static void main(String[] args) {
//		int[] arr = { 44, 66, 99, 77, 33, 22, 55 }; // output = 66;
		int arr[] = { 1, 2, 5, 6, 3, 2 }; // output = 3
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
		}
		System.out.println("Third largest Element is " + arr[4 - count]);
	}
}
