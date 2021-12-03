package com.xworkz.NumberProgram;

import java.util.Scanner;

public class ATMProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		int deposit = 0;
		System.out.println("Automatic teller machine");
		do {
			System.out.println("Choose a option");
			System.out.println("1. Deposit\n2. Withdraw\n3. View Balance\n4.Exit");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter amout You want to deposit");
				deposit = sc.nextInt();
			case 2:
				System.out.println();
			}
		} while (ans == 1);
	}
}
