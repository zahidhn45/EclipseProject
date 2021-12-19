package com.xworkz.linkedlistprac;

import java.util.Scanner;

import com.xworkz.linkedlistprac.dto.BookDTO;
import com.xworkz.linkedlistprac.impl.AssetImpl;

public class BookTester {

	public static void main(String[] args) {
		AssetDAO dao = new AssetImpl();
		Scanner sc = new Scanner(System.in);
		BookDTO dto;

		int ans = 0;
		do {
			System.out.println("Enter a choice");
			System.out.println(
					"1. Add Book\n2. Search Book\n3. Update Book\n4. Delete book\n5. List all Book\n6. Add book at particular Index");
			System.out
					.println("7. Delete last book\n8. Delete First Book\n9. Display First Book\n10. Display last Book");
			System.out.println("11. Add Book in first position\n12. Add book in last position");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				do {
					System.out.println("Enter book id");
					int id = sc.nextInt();

					System.out.println("Enter book name");
					String name = sc.next();

					System.out.println("Enter book price");
					double price = sc.nextDouble();

					System.out.println("Enter pages");
					int noOfPages = sc.nextInt();

					dto = new BookDTO(id, name, price, noOfPages);
					dao.addAsset(dto);
					System.out.println("Book added.....!");
					System.out.println("Do  you want to add more book\nPress 1 if yes else press any key to exit");
					ans = sc.nextInt();
				} while (ans == 1);
				ans = 0;
				break;
			case 2:
				System.out.println("Enter id to search book");
				dao.searchAsset(sc.nextInt());
				break;
			case 3:
				System.out.println("Enter id to update Book and enter updated book name");
				dao.updateAsset(sc.nextInt(), sc.next());
				System.out.println("Book updated.....!");
				break;
			case 4:
				System.out.println("Enter id to delete book");
				dao.deleteAsset(sc.nextInt());
				System.out.println("Book deleted.....!");
				break;
			case 5:
				dao.listAsset();
				break;
			case 6:
				System.out.println("Enter id, name, price, Number of page");
				BookDTO dto2 = new BookDTO(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt());
				System.out.println("Enter index where u want to add Book");
				dao.setAsset(sc.nextInt(), dto2);
				System.out.println("Bood added......!");
				break;
			case 7:
				dao.removeLastAsset();
				System.out.println("Book removed.....!");
				break;
			case 8:
				dao.removeFirstAsset();
				System.out.println("Book removed.....!");
				break;
			case 9:
				dao.getFirstAsset();
				break;
			case 10:
				dao.getLastAsset();
				break;
			case 11:
				System.out.println("Enter id, name, price, number of pages");
				BookDTO dto3 = new BookDTO(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt());
				dao.addFirstAsset(dto3);
				System.out.println("Book added.....!");
				break;
			case 12:
				System.out.println("Enter id, name, price, number of pages");
				BookDTO dto4 = new BookDTO(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt());
				dao.addLastAsset(dto4);
				System.out.println("Book added...!");
				break;
			default:
				System.out.println("Enter from given choice");
				break;
			}

			System.out.println("Do you want to perform more operation\nPress 1 if yes else press any key to exit");
			ans = sc.nextInt();
		} while (ans == 1);
		System.out.println("Thanks for using");
		sc.close();
	}
}
