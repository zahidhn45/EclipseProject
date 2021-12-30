package com.xwork.sortedset;

public class BookDTO implements Comparable<BookDTO> {
	private int bookId;
	private String bookName;
	private double bookPrice;
	private int noOfPage;

	public BookDTO(int bookId, String bookName, double bookPrice, int noOfPage) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.noOfPage = noOfPage;
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

	public int getNoOfPage() {
		return noOfPage;
	}

	public void setNoOfPage(int noOfPage) {
		this.noOfPage = noOfPage;
	}

	@Override
	public String toString() {
		return "Book - [bookId = " + bookId + ", bookName = " + bookName + ", bookPrice = " + bookPrice
				+ ", noOfPage = " + noOfPage + "]";
	}

	@Override
	public int hashCode() {
		return bookId;
	}

	@Override
	public boolean equals(Object obj) {
		BookDTO dto = (BookDTO) obj;
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.bookId == dto.getBookId() && this.bookName.equals(dto.getBookName())
				&& this.bookPrice == dto.getBookPrice() && this.noOfPage == dto.getNoOfPage())
			return true;
		return false;
	}

	@Override
	public int compareTo(BookDTO dto) {
		int value = this.bookName.compareTo(dto.getBookName());

		if (value > 0)
			return 20;
		if (value < 0)
			return -20;
		if (value == 0)
			return 0;
		return 0;
	}

}
