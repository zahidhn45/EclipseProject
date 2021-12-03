package com.xworkz;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void game() {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int num = random.nextInt(50);
		int attemp = 1;
		int count = 0;
		boolean isGuessed = false;
		while (attemp != 9) {
			System.out.println("Enter a number");
			int guess = sc.nextInt();

			if (guess > num) {
				System.out.println("Enter a lesser value");
			} else if (guess < num) {
				System.out.println("Enter greater valus");
			} else {
				System.out.println("You guess correct");
				System.out.println("You too " + attemp + " to guess correctly");
				isGuessed = true;
				break;
			}
			attemp++;
			count++;
		}
		if (!isGuessed) {
			System.out.println("Game Over...!");
			System.out.println("Do you want to play again if yes press 1");
			int ans = sc.nextInt();
			if (ans == 1) {
				game();
			} else {
				System.out.println("Thanks For palying the game");
				System.out.println("The Number was " + num);
			}
		}
		sc.close();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to number Gussing game");
		System.out.println("There will be only 9 attempts");
		System.out.println("Hint - The number will be between 0 - 50");
		game();
	}
}
