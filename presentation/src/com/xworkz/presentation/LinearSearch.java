package com.xworkz.presentation;

public class LinearSearch {

	public static int search(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			if (target == arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 5, 4, 8, 9, 1, 2, 3 };
		int target = 9;

		int ans = search(nums, target);
		System.out.println("The index is " + (ans + 1));
	}
}
