package com.pragim.ctrl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
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
		
		Cookie[] cookies = request.getCookies();
		
		if(cookies!=null && cookies.length>0){
			
			
			for (Cookie cookie : cookies) {
				out.println(cookie.getName()+": "+cookie.getValue());
			}
		}
		
		
		
		
		out.println("Income per year "+income);
		out.println("Tax paid on this year is "+taxPaid);
	}

}
