package com.xworkz.arrayprogram;

import java.util.Arrays;

public class RemoveDuplicate {

	public static int removeDuplicates(int[] nums) {
		int newArray[] = new int[nums.length];
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					newArray[i] = nums[i];
					count++;
				}
			}
		}
		System.out.println(Arrays.toString(newArray));
		return count;
	}

	public static int singleNumber(int[] nums) {
		int singleNo = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					singleNo = nums[i];
				}
			}
		}
		return singleNo;
	}

	public static int missingNumber(int[] nums) {
		int sum = 0;
		for (int i = 1; i <= nums.length; i++) {
			sum += i;
		}

		int newSum = 0;
		for (int i = 0; i < nums.length; i++) {
			newSum += nums[i];
		}

		int finalSum = sum - newSum;
		return finalSum;
	}

	public static void main(String[] args) {
		int[] num = { 1, 1, 2, 3, 2, 4, 3 };
		int[] num1 = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
//		System.out.println(singleNumber(num));
		System.err.println(missingNumber(num1));
	}
}
