package com.xworkz.algorithms;

import java.util.Arrays;

public class QuickSort {

	public static void sort(int[] arr, int low, int high) {
		if (low > high) {
			return;
		}
		int start = low;
		int end = high;
		int mid = start + (end - start) / 2;
		int pivoit = arr[mid];

		while (start <= end) {
			while (arr[start] < pivoit) {
				start++;
			}
			while (arr[end] > pivoit) {
				end--;
			}
			if (start <= end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
		sort(arr, low, end);
		sort(arr, start, high);
	}

	public static void main(String[] args) {
		int[] nums = { 1, 4, 3, 2, 5 };

		sort(nums, 0, nums.length - 1);
		System.out.println(Arrays.toString(nums));
	}
}
