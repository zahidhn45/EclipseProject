package com.xworkz.basicprogram;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		int num = 50;
		int randomNum = random.nextInt(num);
		int attemp = 0;
		int count = 1;
		boolean flag = false;

		System.out.println("Welcome to number gussing game");
		System.out.println("There will be only 9 attemp");
		System.out.println("Hint - Number will be between 0 - 50");
		System.out.println();
		do {
			System.out.println("Enter a number");
			int guess = sc.nextInt();

			if (guess > randomNum) {
				System.out.println("Enter Lower Number");
			} else if (guess < randomNum) {
				System.out.println("Enter Greater number");
			} else {
				System.out.println("You guess correct....!");
				System.out.println("You gussed in " + count + " attempt");
				flag = true;
				break;
			}
			count++;
			attemp++;
		} while (attemp != 9);
		if (!flag) {
			System.out.println("There is no more attemp left...!!!!");
			System.out.println("Correct number is " + randomNum);
		}
	}
}
