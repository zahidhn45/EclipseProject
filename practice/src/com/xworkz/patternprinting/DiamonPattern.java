package com.xworkz.patternprinting;

public class DiamonPattern {
	public static void main(String[] args) {
		int row = 8;

		for (int i = 1; i <= row; i++) {
			for (int sp = row - i; sp >= 1; sp--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
