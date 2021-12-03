package com.xworkz.constructorapp;

public class Demo {

	public static void main(String[] args) {
		int arr[] = { 7, 10, 4, 3, 20, 15, 24, 2 };
		int smallest = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					smallest = arr[j];
				}
			}
		}
		System.out.println(smallest);

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(arr[smallest - 1]);
	}
}
