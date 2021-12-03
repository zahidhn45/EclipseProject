package com.xworkz.simpleprograms.arrayprogram;

public class ArraysInReverse {

	public static void reverse(int[] nums) {
		System.out.println();
		System.out.println("Reverse order");
		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.print(nums[i] + " ");
		}
	}

	public static void evenPos(int[] nums) {
		System.out.println();
		System.out.println("Odd position arrays are");
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 != 0) {
				System.out.print(nums[i] + " ");
			}
		}
	}

	static public void oddPos(int[] nums) {
		System.out.println();
		System.out.println("odd position arrays are");
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				System.out.print(nums[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println();
		System.out.println("Main method");
	}

	static {
		int[] nums = { 1, 2, 3, 4, 5 };
		System.out.println("Original array");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		reverse(nums);
		oddPos(nums);
		evenPos(nums);
	}

}
