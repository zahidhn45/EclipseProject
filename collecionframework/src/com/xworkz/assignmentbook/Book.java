package com.xworkz.assignmentbook;

public interface Book {

	boolean addBooks(BookDTO bookDTO);

	BookDTO searchBook(int id);

	boolean updateBook(int id, String name);

	boolean deleteBook(int id);

	void printDetails();
}
