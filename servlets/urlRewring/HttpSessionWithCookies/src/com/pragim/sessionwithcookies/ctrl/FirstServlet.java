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
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		Map<String, String[]> req1 = new HashMap<String, String[]>();
		
		
		Enumeration<String> parameterNames = request.getParameterNames();
		HttpSession session = request.getSession();
		while (parameterNames.hasMoreElements()) {
			String string = (String) parameterNames.nextElement();
			
			Map<String, String[]> parameterMap = request.getParameterMap();
			session.setAttribute(string, parameterMap.get(string)[0]);
		}
		
		
	
		System.out.println(session.getId());
		session.setAttribute("form1", req1);
		
		
		out.println("<body><form action="+response.encodeUrl("ssrv")+"><table><tr><td>Skills</td><td><select name=skill><option>JAVA&&J2EE</option>");
		out.println("<option>HTML</option><option>JS</option></select></td></tr>");
		out.println("<tr><td>Exp</td><td><input type=text name=exp></td></tr>");
		out.println("<tr><td><input type=submit value=continue></td></tr></table></form></body>");
		
	}

}
