package com.pragim.rddemo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String num = request.getParameter("number");
		
		int no = Integer.parseInt(num);
		
		int squre = no*no;
		out.println("squere value of "+no+" is "+squre);
		
		
		//carry the request from source to dest
		
		RequestDispatcher rd = request.getRequestDispatcher("/srv2");
		rd.include(request, response);
		
		/*RequestDispatcher rd = request.getRequestDispatcher("success.html");
		rd.include(request, response);*/
		
		/*RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
		rd.forward(request, response);*/
		
		
	}

}
