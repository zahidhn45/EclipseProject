package com.xworkz.assignmentbook;

public class BookDTO {

	private int bookId;
	private String bookName;
	private double bookPrice;
	private String bookType;

	public BookDTO(int bookId, String bookName, double bookPrice, String bookType) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookType = bookType;
	}

	public BookDTO() {

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

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	@Override
	public String toString() {
		return "BookDTO [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookType="
				+ bookType + "]";
	}

}
