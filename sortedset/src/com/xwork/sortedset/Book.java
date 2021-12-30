package com.xwork.sortedset;

import java.util.SortedSet;
import java.util.TreeSet;

public class Book {

	public static void main(String[] args) {
		BookDTO bookDTO1 = new BookDTO(1, "ghi", 1000, 243);
		BookDTO bookDTO2 = new BookDTO(2, "xyz", 250.00, 450);
		BookDTO bookDTO3 = new BookDTO(3, "abc", 450, 876);

		SortedSet<BookDTO> set = new TreeSet<BookDTO>();

		set.add(bookDTO1);
		set.add(bookDTO2);
		set.add(bookDTO3);

		System.out.println(set);
		System.out.println(set.first());
		System.out.println(set.last());
	}

}
