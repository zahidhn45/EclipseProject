package com.xworkz.hanamant;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {

		byte a1[] = { 23, 21, 47, 45 };
		short a2[] = { 545, 525, 454 };
		int a3[] = { 1, 2, 3, 4, 5, 6 };
		long a4[] = { 85554, 78454, 45487 };
		float a5[] = { 2.1f, 2.3f, 3.2f };
		double a6[] = { 23.22d, 25.21d, 23.89d, 58.23d };
		char a7[] = { 'a', 'b', 'c' };
		String a8[] = { "Java", "C", "Python" };

		Arrays.sort(a1);
		Arrays.sort(a2);
		Arrays.sort(a3);
		Arrays.sort(a3);
		Arrays.sort(a4);
		Arrays.sort(a5);
		Arrays.sort(a6);
		Arrays.sort(a7);
		Arrays.sort(a8);

		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(a3));
		System.out.println(Arrays.toString(a4));
		System.out.println(Arrays.toString(a5));
		System.out.println(Arrays.toString(a6));
		System.out.println(Arrays.toString(a7));
		System.out.println(Arrays.toString(a8));
	}
}
