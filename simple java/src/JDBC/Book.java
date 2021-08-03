package JDBC;

import lombok.Getter;

public class Book {
	private int bookId;
	private String bookName;
	private String author;
	private int bookPrice;
	public Book(int bookId, String bookName, String author, int bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.bookPrice = bookPrice;
	}
	
	public Book() {
	
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
}
