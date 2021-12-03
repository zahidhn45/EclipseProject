package com.xworkz.interfaceprogram;

import java.util.Scanner;

public class Browser {

	Scanner sc = new Scanner(System.in);
	private Internet internet;

	public Browser(Internet internet) {
		this.internet = internet;
	}

	public void browse() {
		if (internet != null) {
			boolean connect = internet.connect();
			int speed = internet.speed();
			if (connect == true && speed >= 1) {
				System.out.println("Connection is good... you are allowed to browse");
			} else {
				internet.disconnect();
			}
		}
	}

	public void changeInternet() {
		System.out.println("Do you want to change connection if yes press 1");
		int ans = sc.nextInt();
		if (ans == 1) {
			System.out.println("Enter a choice");
			System.out.println("1.Tata Internet\n2.Airtel Internet");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Switched to Tata internet");
				break;
			case 2:
				System.out.println("Switched to Airtel internet");
				break;

			default:
				System.out.println("Enter From the option given");
				break;
			}
		}
	}
}
