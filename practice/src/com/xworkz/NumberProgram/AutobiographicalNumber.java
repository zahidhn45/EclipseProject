package com.xworkz.NumberProgram;

public class AutobiographicalNumber {

	public static void main(String[] args) {
		int num = 42101000;

		int length = String.valueOf(num).length();
		int sum = 0;
		while (num != 0) {
			int res = num % 10;
			sum += res;
			num /= 10;
		}

		System.out.println("Length is " + length);
		System.out.println("sum is " + sum);
		String autobio = length == sum ? "AutoBioGraphical Number" : "not AutoBioGraphical Number";
		System.out.println(autobio);
	}
}
