package com.pragim.ctrl;

import java.io.IOException;
import java.io.PrintWriter;

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
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//common settings
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		//req data
		String uname = request.getParameter("uname");
		String age = request.getParameter("age");
		String fatname = request.getParameter("fname");
		
		
		
		/*out.println("<input type=hidden name=username value="+uname+">");
		out.println("<input type=hidden name=perage value="+age+">");
		out.println("<input type=hidden name=fname value="+fatname+">");*/
		
		
		
		out.println("<body><form action=srv2><input type=hidden name=username value="+uname+">"
				+ "<input type=hidden name=perage value="+age+">"
						+ "<input type=hidden name=fname value="+fatname+">"
								+ "<table><tr><td>Income:</td>");
		out.println("<td><input type=text name=income></td></tr>");
		out.println("<tr><td>Tax</td><td><input type=text name=tax></td></tr>");
		out.println("<tr><td><input type=submit value=tax></td></tr></table></form></body>");
		
		
		
		
		
		
	}

}
