package com.xworkz.interfaceprogram;

import java.util.Scanner;

public class InternetUtil {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Internet internet1 = new TataInternet();
		Internet internet2 = new AirtelInternet();

		Browser browser = new Browser(internet1);
		Browser browser2 = new Browser(internet2);

		System.out.println("Choose for you favorit connection");
		System.out.println("Enter choice\n1.Tata Interner\n2. Airtel Internet");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			browser.browse();
			browser.changeInternet();
			break;
		case 2:
			browser2.browse();
			browser2.changeInternet();
			break;

		default:
			System.out.println("Enter from given choice");
			break;
		}
		sc.close();
	}
}
