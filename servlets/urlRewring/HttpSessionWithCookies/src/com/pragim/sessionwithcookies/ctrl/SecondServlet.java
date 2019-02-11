package com.pragim.sessionwithcookies.ctrl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		response.setContentType("text/html");
	
		
		
		HttpSession session = request.getSession();
		Enumeration<String> parameterNames = request.getParameterNames();
		while (parameterNames.hasMoreElements()) {
			String string = (String) parameterNames.nextElement();
			Map<String, String[]> parameterMap = request.getParameterMap();
			session.setAttribute(string, parameterMap.get(string)[0]);
			
		}
		
		
		
		out.println("<body><form action="+response.encodeUrl("tsrv")+"><table><tr><td>Prefered Loc</td><td><select name=loc multiselect><option>bangl</option>");
		out.println("<option>chenni</option><option>hyd</option></select></td></tr>");
		out.println("<tr><td>Sal</td><td><input type=text name=sal></td></tr>");
		out.println("<tr><td><input type=submit value=submit></td></tr></table></form></body>");
		
	}

}
