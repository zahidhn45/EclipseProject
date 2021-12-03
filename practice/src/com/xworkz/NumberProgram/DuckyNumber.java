package com.xworkz.NumberProgram;

public class DuckyNumber {

	public static void main(String[] args) {
		int num = 032040;
		int count = 0;
		String convNum = Integer.toString(num);
		for (int i = 1; i <= convNum.length(); i++) {
			if ((num % 10 == 0 || convNum.charAt(i - 1) == '0') && convNum.charAt(1) != '0') {
				count++;
			}
		}
		if (count > 1) {
			System.out.println("Ducky");
		} else {
			System.out.println("Not ducky");
		}
	}
}
