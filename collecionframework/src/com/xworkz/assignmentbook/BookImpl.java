package com.xworkz.assignmentbook;

public class BookImpl implements Book {

	private BookDTO[] bookDTO;
	int index;

	public BookImpl(int size) {
		bookDTO = new BookDTO[size];
	}

	@Override
	public boolean addBooks(BookDTO bookDTO) {
		boolean isAdded = false;
		if (bookDTO != null) {
			this.bookDTO[index++] = bookDTO;
			isAdded = true;
		} else {
			System.out.println("Nothing to add");
		}
		return isAdded;
	}

	@Override
	public boolean updateBook(int id, String name) {
		boolean isUpdated = false;

		for (int i = 0; i < bookDTO.length; i++) {
			if (bookDTO[i] != null) {
				if (bookDTO[i].getBookId() == id) {
					bookDTO[i].setBookName(name);
					isUpdated = true;
				}
			}
		}
		if (!isUpdated) {
			System.out.println("Id not found");
		}
		return isUpdated;
	}

	@Override
	public boolean deleteBook(int id) {
		boolean isDeleted = false;

		for (int i = 0; i < bookDTO.length; i++) {
			if (bookDTO[i] != null) {
				if (bookDTO[i].getBookId() == id) {
					bookDTO[i] = null;
					isDeleted = true;
				}
			}
		}
		if (!isDeleted) {
			System.out.println("Id not found");
		}
		return isDeleted;
	}

	@Override
	public void printDetails() {
		for (int i = 0; i < bookDTO.length; i++) {
			if (bookDTO[i] != null) {
				System.out.println("Book Id: " + bookDTO[i].getBookId() + ", Name: " + bookDTO[i].getBookName()
						+ ", Price: " + bookDTO[i].getBookPrice() + ", Type: " + bookDTO[i].getBookType());
			}
		}
	}

	@Override
	public BookDTO searchBook(int id) {
		BookDTO dto = null;
		boolean isFound = false;
		for (int i = 0; i < bookDTO.length; i++) {
			if (bookDTO[i].getBookId() == id) {
				dto = bookDTO[i];
				isFound = true;
			}
		}
		if (!isFound) {
			System.out.println("Id not found");
		}
		return dto;
	}

}
