package com.xworkz.practiceproblems.question2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import com.xworkz.practiceproblems.question2.dto.ItemTypeDTO;

public class ItemType {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);
		Collection<ItemTypeDTO> collection = new ArrayList<ItemTypeDTO>();
		String ans = "";
		int count = 1;

		do {
			System.out.println("Enter the details of item type " + count++);
			System.out.println("Name");
			String name = sc.nextLine();
			System.out.println("Deposit");
			double deposit = scInt.nextDouble();
			System.out.println("Cost per day");
			double cost = scInt.nextDouble();
			collection.add(new ItemTypeDTO(name, deposit, cost));
			System.out.println("Do you want to continue?(y/n)");
			ans = sc.nextLine();
		} while ("y".equals(ans));

		sc.close();
		scInt.close();

		Iterator<ItemTypeDTO> itr = collection.iterator();
		System.out.printf("%-20s%-20s%-20s", "Name", "Deposit", "Cost per day");
		System.out.println();
		while (itr.hasNext()) {
			ItemTypeDTO itemTypeDTO = (ItemTypeDTO) itr.next();
			System.out.println(itemTypeDTO);
		}
	}
}
