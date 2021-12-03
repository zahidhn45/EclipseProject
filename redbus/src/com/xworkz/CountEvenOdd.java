package com.xworkz;

public class CountEvenOdd {

	public static void main(String[] args) {
		int num = 1234567;
		int evenCount = 0, oddCount = 0, temp = 0, count = 0;
		while (num != 0) {
			temp = num % 10;
			count = temp % 2 == 0 ? evenCount++ : oddCount++;
			num /= 10;
		}
		System.out.println("Even count " + evenCount);
		System.out.println("Odd count " + oddCount);

	}
}
