package com.xworkz.basicprogram;

public class DuplicateArrays {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 2, 3, 5, 6, 5, 6 };
		int index = 0, i, j;

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
		for (int j2 = 0; j2 < index; j2++) {
			System.out.print(nums[j2] + " ");
		}
	}
}
