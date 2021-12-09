package com.xworkz.assignmentbook;

import java.util.Scanner;

public class BookTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size");
		int size = sc.nextInt();
		Book book = new JavaBook(size);
		JavaBook javaBook = new JavaBook(size);
		javaBook.bookname();

		for (int i = 0; i < size; i++) {
			BookDTO dto = new BookDTO();
			System.out.println("Enter book id");
			dto.setBookId(sc.nextInt());

			System.out.println("Enter Book name");
			dto.setBookName(sc.next());

			System.out.println("Enter Book Price");
			dto.setBookPrice(sc.nextDouble());

			System.out.println("Enter Book Type");
			dto.setBookType(sc.next());

			book.addBooks(dto);
		}

		int ans = 0;
		do {
			System.out.println("Enter a choice");
			System.out.println(
					"1. List all the available asset\n2. Searching an asset\n3. Updating an asset\n4. Deleting an asset");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				book.printDetails();
				break;
			case 2:
				System.out.println("Enter id to search an element");
				BookDTO dto = book.searchBook(sc.nextInt());
				if (dto != null) {
					System.out.println(dto.getBookId() + " " + dto.getBookName() + " " + dto.getBookPrice() + " "
							+ dto.getBookType());
				}

				break;
			case 3:
				System.out.println("Enter the id for which you want to update");
				int updateId = sc.nextInt();
				System.out.println("Enter the updated name");
				String updatedName = sc.next();
				book.updateBook(updateId, updatedName);
				System.out.println("Item updated");
				break;
			case 4:
				System.out.println("Enter the id for which you want to delete");
				book.deleteBook(sc.nextInt());
				System.out.println("Item deleted");
				break;

			default:
				System.out.println("Enter from the given choice");
				break;
			}
			System.out.println(
					"Do you want to perform more operation if yes press 1 or press any key to terminate the program");
			ans = sc.nextInt();
		} while (ans == 1);
		System.out.println("Thanks for using");

		sc.close();
	}
}
