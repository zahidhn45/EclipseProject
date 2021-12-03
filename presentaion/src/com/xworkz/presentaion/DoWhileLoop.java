package com.xworkz.presentaion;

import java.util.Random;
import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {

		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int num = 50;

		int randomInt = random.nextInt(num);
		System.out.println("Welcome to number guessing game");
		System.out.println("Hint - there will be only 9 attemp");
		boolean guessed = false;

		int count = 1;
		int attemp = 0;
		do {
			System.out.println("Enter a number");
			int guess = sc.nextInt();

			if (guess > randomInt) {
				System.out.println("Enter lower value");
			} else if (guess < randomInt) {
				System.out.println("Enter greater value");
			} else {
				System.out.println("You guess correct");
				System.out.println("you took " + count);
				guessed = true;
				break;
			}
			count++;
			attemp++;
		} while (attemp != 9);

		if (!guessed) {
			System.out.println("Game completed");
			System.out.println("Real number was " + randomInt);
		}

		sc.close();
	}
}
