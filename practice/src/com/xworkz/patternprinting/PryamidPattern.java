package com.xworkz.patternprinting;

public class PryamidPattern {
	public static void main(String[] args) {
		int row = 5;

		for (int i = 1; i <= row; i++) {
			for (int sp = row - i; sp >= 1; sp--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
