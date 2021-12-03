package com.xworkz.NumberProgram;

public class PerfectSquare {

	public static void main(String[] args) {
		int num = 624;
		boolean flag = false;
		for (int i = 1; i <= num; i++) {
			if (i * i == num) {
				System.out.println("Perfect square");
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("Not a pefrfect square");
		}
	}
}
