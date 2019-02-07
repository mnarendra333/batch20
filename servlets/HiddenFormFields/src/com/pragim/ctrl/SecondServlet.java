package com.pragim.ctrl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		PrintWriter out = response.getWriter();
		//collect data from req
		
		
		String income = request.getParameter("income");
		String taxPaid = request.getParameter("tax");
		
		
		String uname = request.getParameter("username");
		String age = request.getParameter("perage");
		String fname = request.getParameter("fname");
		
		
		out.println("Name : "+uname);
		
		out.println("Age : "+age);
		
		out.println("Fathers Name : "+fname);
		
		out.println("Income per year "+income);
		out.println("Tax paid on this year is "+taxPaid);
		
	}

}
