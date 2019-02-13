package com.infy.dao;

import java.util.List;

import com.infy.model.Book;

public interface BooksDao {
	
	
	public String addBook(Book book);
	public String deleteBook(int bookId);
	public List<Book> getListOfBooks();
	public String updateBook(Book book);
	public Book getBookInfoById(int bookId);
	

}
