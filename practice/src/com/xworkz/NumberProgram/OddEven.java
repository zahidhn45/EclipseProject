package com.xworkz.NumberProgram;

public class OddEven {

	public static void even(int range) {
		System.out.println("Even number are:- ");
		for (int i = 1; i <= range; i++) {
			if (i % 2 == 0) {
				System.out.print(i + ", ");
			}
		}
	}

	public static void odd(int range) {
		System.out.println("Odd number are:- ");
		for (int i = 1; i <= range; i++) {
			if (i % 2 != 0) {
				System.out.print(i + ", ");
			}
		}
	}

	public static void main(String[] args) {
		int range = 100;
		even(range);
		System.out.println();
		odd(range);
	}
}
