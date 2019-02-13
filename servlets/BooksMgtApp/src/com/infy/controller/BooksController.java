package com.infy.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infy.dao.BooksDao;
import com.infy.dao.BooksDaoImpl;
import com.infy.model.Book;

/**
 * Servlet implementation class BooksController
 */
@WebServlet("/listofbooks")
public class BooksController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BooksController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		BooksDao dao = new BooksDaoImpl();
		String id = request.getParameter("id");
		int bookId = 0,qtyValue=0,pagesValue=0;
		double priceValue = 0;
		if(id!=null)
			bookId = Integer.parseInt(id);
		
		String bname = request.getParameter("bookname");
		String price = request.getParameter("price");
		
		if(price!=null)
			priceValue = Double.parseDouble(price);
		String author = request.getParameter("author");
		String qty = request.getParameter("qty");
		
		if(qty!=null)
			qtyValue = Integer.parseInt(qty);
		
		String pages = request.getParameter("pages");
		if(pages!=null)
			pagesValue  =Integer.parseInt(pages);
		String publisher = request.getParameter("publisher");
		
		String buttonName = request.getParameter("btnName");
		
		
		if(buttonName!=null && buttonName.equalsIgnoreCase("edit")){
			
			Book book = dao.getBookInfoById(bookId);
			request.setAttribute("bookInfo", book);
		}
		else if(buttonName!=null && buttonName.equalsIgnoreCase("delete")){
			
			
			String message = dao.deleteBook(bookId);
			request.setAttribute("messageValue", message);
			
		}else if(buttonName!=null && buttonName.equalsIgnoreCase("add")){
			
			
			
			Book bookObj  =new Book(0, bname, priceValue, author, qtyValue, pagesValue, publisher);
			
			String msg = dao.addBook(bookObj);
			request.setAttribute("messageValue", msg);
			
		}
		else if(buttonName!=null && buttonName.equalsIgnoreCase("update")){
			Book bookObj  =new Book(bookId, bname, priceValue, author, qtyValue, pagesValue, publisher);
			String message = dao.updateBook(bookObj);
			request.setAttribute("messageValue", message);
		}
		
		
		List<Book> listOfBooks = dao.getListOfBooks();
		request.setAttribute("list", listOfBooks);
		
		//moving the control from servet to jsp
		
		RequestDispatcher rd  =request.getRequestDispatcher("home.jsp");
		rd.forward(request, response);
	}

}
