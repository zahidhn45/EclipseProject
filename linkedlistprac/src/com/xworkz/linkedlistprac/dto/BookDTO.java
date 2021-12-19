package com.xworkz.linkedlistprac.dto;

public class BookDTO {

	private int bookId;
	private String bookName;
	private double bookPrice;
	private int noOfBook;

	public BookDTO(int bookId, String bookName, double bookPrice, int noOfBook) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.noOfBook = noOfBook;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public int getNoOfBook() {
		return noOfBook;
	}

	public void setNoOfBook(int noOfBook) {
		this.noOfBook = noOfBook;
	}

	@Override
	public String toString() {
		return "Book - [bookId = " + bookId + ", bookName = " + bookName + ", bookPrice = " + bookPrice
				+ ", noOfBook = " + noOfBook + "]";
	}

	@Override
	public int hashCode() {
		return bookId;
	}
//
//	@Override
//	public boolean equals(Object obj) {
//		BookDTO dto = (BookDTO) obj;
//		if (this == obj) {
//			return false;
//		}
//		if (obj == null) {
//			return false;
//		}
//		if (this.bookId != dto.bookId) {
//			return false;
//		}
//		return true;
//	}

}
