package com.xworkz.arrayprogram;

public class CountFrequency {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 4, 1, 2, 1, 9 };
		int[] newArray = new int[arr.length];
		int visited = -1;

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					newArray[j] = visited;
				}
			}
			if (newArray[i] != visited) {
				newArray[i] = count;
			}
		}
		for (int i = 0; i < newArray.length; i++) {
			if (newArray[i] != visited) {
				System.out.println("The frequency of " + arr[i] + " is " + newArray[i]);
			}

		}
	}
}
