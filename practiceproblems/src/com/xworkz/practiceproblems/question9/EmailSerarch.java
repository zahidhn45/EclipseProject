package com.xworkz.practiceproblems.question9;

import java.util.HashSet;
import java.util.Scanner;

public class EmailSerarch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> set = new HashSet<String>();
		String ans = "";

		do {
			System.out.println("Enter Email address");
			String email = sc.nextLine();
			set.add(email);
			System.out.println("Do you want to Continue?(yes/no)");
			ans = sc.nextLine();
		} while ("yes".equals(ans));

		System.out.println("Enter the email addresses to be searched");
		String searched = sc.nextLine();

		if (set.contains(searched)) {
			System.out.println("Email addresses is present");
		} else {
			System.out.println("Email addresses is not present");
		}
		sc.close();
	}
}
