package com.xworkz.simpleprograms.arrayprogram;

import java.util.Arrays;

public class CopyElement {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };

		int[] copyArray = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			copyArray[i] = nums[i];
		}
		System.out.println(Arrays.toString(copyArray));
	}
}
