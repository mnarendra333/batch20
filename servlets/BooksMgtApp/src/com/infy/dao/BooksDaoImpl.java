package com.infy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.infy.model.Book;
import com.infy.utility.ConnectionUtility;

public class BooksDaoImpl implements BooksDao {

	@Override
	public String addBook(Book book) {
		String message = null;
		Connection connection = ConnectionUtility.getConnection();
		try {
			PreparedStatement pstmt = connection.prepareStatement("insert into books values(books_seq.nextval,?,?,?,?,?,?)");
			pstmt.setString(1, book.getBookName());
			pstmt.setDouble(2, book.getPrice());
			pstmt.setString(3, book.getAuthor());
			pstmt.setInt(4, book.getQty());
			pstmt.setInt(5, book.getPages());
			pstmt.setString(6, book.getPublisher());
			
			
			int count = pstmt.executeUpdate();
			
			if(count>0)
				message  ="record added successfully";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return message;
	}

	@Override
	public String deleteBook(int bookId) {
		int count = 0;
		String message= null;
		Connection connection = ConnectionUtility.getConnection();
		try {
			PreparedStatement pstmt = connection.prepareStatement("delete from books where id=?");
			pstmt.setInt(1, bookId);
			
			count = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(count>0)
			message = "record deleted successfully";
		return message;
	}

	@Override
	public List<Book> getListOfBooks() {
		// TODO Auto-generated method stub
		Connection con = ConnectionUtility.getConnection();
		List<Book> booklist = new ArrayList<Book>();
		try {
			PreparedStatement pstmt = con.prepareStatement("select * from books");
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Book obj  = new Book(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getString(7));
				booklist.add(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return booklist;
	}

	@Override
	public String updateBook(Book book) {
		// TODO Auto-generated method stub
		
		String message = null;
		try {
			Connection connection = ConnectionUtility.getConnection();
			PreparedStatement pstmt = connection.prepareStatement("update books set bname=?,price=?,author=?,qty=?,pages=?,publisher=? where id=?");
			pstmt.setString(1, book.getBookName());
			pstmt.setDouble(2, book.getPrice());
			pstmt.setString(3, book.getAuthor());
			pstmt.setInt(4, book.getQty());
			pstmt.setInt(5, book.getPages());
			pstmt.setString(6, book.getPublisher());
			pstmt.setInt(7, book.getId());
			
			int count = pstmt.executeUpdate();
			if(count>0)
				message = "record updated successfully";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return message;
	}

	@Override
	public Book getBookInfoById(int bookId) {
		// TODO Auto-generated method stub
		Book obj = null;
		Connection con = ConnectionUtility.getConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement("select * from books where id=?");
			pstmt.setInt(1, bookId);
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
				obj = new Book(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getString(7));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return obj;
	}

}
