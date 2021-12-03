package com.xworkz;

public class SumOfArray {

	public static int sumOfArrayElem(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		int sum = sumOfArrayElem(nums);
		System.out.println("Sum: " + sum);

		System.out.println("Even number");
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				System.out.print(nums[i] + " ");
			}
		}
		System.out.println();
		System.out.println("Odd number");
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 != 0) {
				System.out.print(nums[i] + " ");
			}
		}
	}
}
