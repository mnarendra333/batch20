package com.pragim.ctrl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
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
				
				/*String parameter = request.getParameter("age");
				int age = Integer.parseInt(parameter);
				
				RequestDispatcher rd = request.getRequestDispatcher("basicInfo.html");*/
			
				Map<String, String[]> parameterMap = request.getParameterMap();
				Set<String> keySet = parameterMap.keySet();
				
				for (String string : keySet) {
					response.addCookie(new Cookie(string, parameterMap.get(string)[0])) ;
				}
				
				out.println("<body><form action=srv2><table><tr><td>Income:</td>");
				out.println("<td><input type=text name=income></td></tr>");
				out.println("<tr><td>Tax</td><td><input type=text name=tax></td></tr>");
				out.println("<tr><td><input type=submit value=tax></td></tr></table></form></body>");
				
	}

}
