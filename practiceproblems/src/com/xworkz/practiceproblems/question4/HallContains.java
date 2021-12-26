package com.xworkz.practiceproblems.question4;

import java.util.ArrayList;
import java.util.Scanner;

public class HallContains {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		String ans = "";
		int count = 1;

		do {
			System.out.println("Enter the Hall Name " + count++);
			String name = sc.nextLine();
			list.add(name);
			System.out.println("Do you want to add more?(y/n)");
			ans = sc.nextLine();
		} while ("y".equals(ans));
		System.out.println("Enter the hall name to be searched:");
		String search = sc.nextLine();
		boolean found = list.contains(search);
		if (found) {
			System.out.println(search + " hall is found in the list at position " + (list.indexOf(search) + 1));
		} else {
			System.out.println(search + " hall is not found");
		}
		sc.close();
	}
}
