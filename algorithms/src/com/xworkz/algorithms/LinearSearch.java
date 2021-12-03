package com.xworkz.algorithms;

public class LinearSearch {

	public static int search(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (target == arr[i]) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 10, 1, 12, 15, 8, 19, 20, 25 };
		int target = 19;

		int ans = search(nums, target);
		System.out.println("The Element found at index: " + ans);
	}
}
