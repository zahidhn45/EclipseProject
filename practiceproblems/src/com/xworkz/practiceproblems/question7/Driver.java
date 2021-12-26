package com.xworkz.practiceproblems.question7;

import java.util.HashSet;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> set = new HashSet<String>();
		String ans = "";

		do {
			System.out.println("Enter the username");
			String name = sc.nextLine();
			set.add(name);
			System.out.println("Do you want to continue?(y/n)");
			ans = sc.nextLine();
		} while ("y".equals(ans));

		System.out.println("The unique number of usernames is " + set.size());
		sc.close();
	}

}
