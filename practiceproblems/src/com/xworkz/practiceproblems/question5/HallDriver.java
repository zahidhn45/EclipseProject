package com.xworkz.practiceproblems.question5;

import java.util.Scanner;

import com.xworkz.practiceproblems.question3.dto.HallDTO;

public class HallDriver {

	public static void main(String[] args) {
		Scanner scInt = new Scanner(System.in);
		Scanner scStr = new Scanner(System.in);
		Hall hall = new Hall();
		String ans = "";

		do {
			System.out.println("Action");
			System.out.println("1. Add Hall\n2. Remove Hall");
			System.out.println("Enter your choice");
			int choice = scInt.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the Hall details in CSV format name, phone, cost, owner name");
				String name = scStr.nextLine();
				String phone = scStr.nextLine();
				double cost = scInt.nextDouble();
				String owner = scStr.nextLine();
				HallDTO dto = new HallDTO(name, phone, cost, owner);
				hall.add(dto);
				break;
			case 2:
				System.out.println("Enter the index of the hall to be removed");
				int index = scInt.nextInt();
				hall.remove(index);
				break;
			default:
				System.out.println("Please enter a valid choice");
				break;
			}
			System.out.println("Do you want to continue?(y/n)");
			ans = scStr.nextLine();
		} while ("y".equals(ans));
		scInt.close();
		scStr.close();
	}

}
