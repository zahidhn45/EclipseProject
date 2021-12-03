package com.xworkz.NumberProgram;

public class MysteryNumber {

	public static void main(String[] args) {
		int x = 6;
		int y = 8;

		int solution = 11 * (x + y);

		String num1 = Integer.toString(x);
		String num2 = Integer.toString(y);

		String first = num1 + num2;
		String second = num2 + num1;

		int num3 = Integer.parseInt(first);
		int num4 = Integer.parseInt(second);

		int sum = num3 + num4;

		String mystry = sum == solution ? "Mystery Number" : "Not Mystry Number";
		System.out.println(mystry);
	}
}
