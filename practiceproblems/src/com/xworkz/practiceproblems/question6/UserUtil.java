package com.xworkz.practiceproblems.question6;

import java.util.Scanner;

import com.xworkz.practiceproblems.question6.dto.UserDTO;

public class UserUtil {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans = "";
		User user = new User();

		do {
			System.out.println("1. Add\n2. Detete\n3. Display");
			System.out.println("Enter a choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter user name, contact number, user name, email");
				user.add(new UserDTO(sc.next(), sc.next(), sc.next(), sc.next()));
				System.out.println("Added successfully");
				break;
			case 2:
				System.out.println("Enter range to delete number");
				user.removeRange(sc.nextInt(), sc.nextInt());
				break;
			case 3:
				user.display();
				break;
			default:
				System.out.println("Enter from give chice");
				break;
			}
			System.out.println("Do you want to continue?(y/n)");
			ans = sc.next();
		} while ("y".equals(ans));
		sc.close();
	}

}
