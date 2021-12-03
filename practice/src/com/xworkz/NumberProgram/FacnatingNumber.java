package com.xworkz.NumberProgram;

public class FacnatingNumber {

	public static void main(String[] args) {
		int num = 2019;

		int mutByTwo = num * 2;
		int mutByThree = num * 3;
		int count = 0;

		String num1 = Integer.toString(num);
		String num2 = Integer.toString(mutByTwo);
		String num3 = Integer.toString(mutByThree);

		String sum = num1 + num2 + num3;
		System.out.println(sum);

		for (int i = 0; i < 9; i++) {
			if (sum.charAt(i) == i) {
				count++;
			}
		}
		String facanating = count > 1 ? num + " is Not facnating number" : num + " is  facnating number";
		System.out.println(facanating);
	}
}
