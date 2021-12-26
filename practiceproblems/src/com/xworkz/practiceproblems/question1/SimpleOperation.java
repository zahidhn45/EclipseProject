package com.xworkz.practiceproblems.question1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class SimpleOperation {

	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int count = 1;
		String ans = "";

		do {
			System.out.println("Enter the Username " + count++);
			collection.add(sc.nextLine());
			System.out.println("Do you want to continue?(y/n)");
			ans = sc.nextLine();
		} while ("y".equals(ans));
		sc.close();
		System.out.println();
		System.out.println("The Names entered are");
		Iterator<String> itr = collection.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
		}
	}

}
