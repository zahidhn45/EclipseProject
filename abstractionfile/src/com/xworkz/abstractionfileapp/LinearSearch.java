package com.xworkz.abstractionfileapp;

public class LinearSearch {

	static int search(int[] arr, int target) {
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
		int[] nums = { 4, 9, 5, 1, 12, 14, 19, 10, 11 };
		int target = 10;

		int ans = search(nums, target);
		System.out.println("Found at index " + ans);
	}

}
