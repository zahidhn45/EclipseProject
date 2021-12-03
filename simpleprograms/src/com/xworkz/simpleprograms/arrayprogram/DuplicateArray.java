package com.xworkz.simpleprograms.arrayprogram;

public class DuplicateArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1, 3, 5, 5 };
		int i, j, index = 0;

		for (i = 0; i < nums.length; i++) {
			for (j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					break;
				}
			}
			if (i == j) {
				nums[index++] = nums[i];
			}

		}
		for (int k = 0; k < index; k++) {
			System.out.print(nums[k] + " ");
		}
	}
}
