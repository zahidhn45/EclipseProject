package com.xworkz.arrayprogram;

import java.util.Arrays;

public class CopyArrayElement {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 9, 12 };
		int[] newArray = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			newArray[i] = arr[i];
		}

		System.out.println(Arrays.toString(newArray));
	}
}
