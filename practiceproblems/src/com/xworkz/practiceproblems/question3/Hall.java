package com.xworkz.practiceproblems.question3;

import java.util.Scanner;

import com.xworkz.practiceproblems.question3.dto.HallDTO;

public class Hall {
	public static void main(String[] args) {
		Scanner scInt = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		HallBO hallBO = new HallBO();
		String ans = "";

		do {
			System.out.println("Enter an option:");
			System.out.println("1. Add\n2. Replace\n3. Display\n4. Exit");
			int choice = scInt.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the name of the hall:");
				String name = scString.nextLine();
				System.out.println("Enter the contact number of the hall:");
				String contactNumber = scString.nextLine();
				System.out.println("Enter the cost per day of the hall:");
				double costPerDay = scInt.nextDouble();
				System.out.println("Enter the owner name of the hall:");
				String ownername = scString.nextLine();
				hallBO.add(new HallDTO(name, contactNumber, costPerDay, ownername));
				System.out.println("Hall added successfully");
				break;
			case 2:
				System.out.println("Enter the hall number which should be replaced:");
				int HallNumber = scInt.nextInt();
				System.out.println("Enter the name of the hall:");
				String name1 = scString.nextLine();
				System.out.println("Enter the contact number of the hall:");
				String contactNumber1 = scString.nextLine();
				System.out.println("Enter the cost per day of the hall:");
				double costPerDay1 = scInt.nextDouble();
				System.out.println("Enter the owner name of the hall:");
				String ownername1 = scString.nextLine();
				HallDTO dto = new HallDTO(name1, contactNumber1, costPerDay1, ownername1);
				hallBO.replace(HallNumber, dto);
				System.out.println("Hall replaced successfully");
				break;
			case 3:
				hallBO.display();
				break;
			case 4:
				System.out.println("Exiting Application");
				break;
			default:
				System.out.println("Enter from the given choice");
				break;
			}
			System.out.println("Do you want to perform more operation?(y/n)");
			ans = scString.nextLine();
		} while ("y".equals(ans));
		scInt.close();
		scString.close();
	}
}
