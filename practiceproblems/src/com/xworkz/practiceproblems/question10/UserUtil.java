package com.xworkz.practiceproblems.question10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import com.xworkz.practiceproblems.question10.dto.User;

public class UserUtil {

	public static void main(String[] args) {
		Scanner scString = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);
		HashSet<User> set = new HashSet<User>();

		System.out.println("Enter number of users:");
		int size = scInt.nextInt();
		int count = 1;

		for (int i = 0; i < size; i++) {
			System.out.println("Enter details of user " + count++);
			System.out.println("Username");
			String name = scString.nextLine();

			System.out.println("Bank name:");
			String bank = scString.nextLine();

			set.add(new User(name, bank));
		}
		System.out.println("Enter the user name to be searched");
		String userName = scString.nextLine();
		System.out.println();

		Iterator<User> irt = set.iterator();
		System.out.printf("%-20s%-20s\n", "userName", "bankName");
		while (irt.hasNext()) {
			User user = (User) irt.next();
			if (userName.equals(user.getUserName())) {
				System.out.println(user);
			}
		}
		scInt.close();
		scString.close();
	}

}
