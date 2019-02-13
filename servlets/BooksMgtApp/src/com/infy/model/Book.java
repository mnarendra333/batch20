package com.infy.model;

public class Book {
	
	private int id;
	private String bookName;
	private double price;
	private String author;
	private int qty;
	private int pages;
	private String publisher;
	
	public Book(int id, String bookName, double price, String author, int qty,
			int pages, String publisher) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.price = price;
		this.author = author;
		this.qty = qty;
		this.pages = pages;
		this.publisher = publisher;
	}
	
	

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", price=" + price
				+ ", author=" + author + ", qty=" + qty + ", pages=" + pages
				+ ", publisher=" + publisher + "]";
	}



	public int getId() {
		return id;
	}

	public String getBookName() {
		return bookName;
	}

	public double getPrice() {
		return price;
	}

	public String getAuthor() {
		return author;
	}

	public int getQty() {
		return qty;
	}

	public int getPages() {
		return pages;
	}

	public String getPublisher() {
		return publisher;
	}
	
	
	
	
	

}
