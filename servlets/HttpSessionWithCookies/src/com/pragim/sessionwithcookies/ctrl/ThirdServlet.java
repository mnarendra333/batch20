package com.pragim.sessionwithcookies.ctrl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ThirdServlet
 */
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirdServlet() {
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
		
		Map<String, String[]> form3Data = request.getParameterMap();
		
		HttpSession session = request.getSession();
		System.out.println(session.getId());
		/*Map<String,String[]> form1Data = (Map<String,String[]>)session.getAttribute("form1");
		
		Set<Entry<String, String[]>> entrySet = form1Data.entrySet();
		for (Entry<String, String[]> entry : entrySet) {
			out.println(entry.getKey()+" is "+(entry.getValue().length>1?entry.getValue():entry.getValue()[0]));		
			
		}
		*/
		/*Map<String,String[]> form2Data = (Map<String,String[]>)session.getAttribute("form2");
		
		Set<Entry<String, String[]>> entrySet2 = form2Data.entrySet();
		for (Entry<String, String[]> entry : entrySet2) {
			out.println(entry.getKey()+" is "+(entry.getValue().length>1?entry.getValue():entry.getValue()[0]));		
			
		}*/
		
		
		out.println((String)session.getAttribute("skill"));
		out.println((String)session.getAttribute("exp"));
		
		Set<Entry<String, String[]>> entrySet3 = form3Data.entrySet();
		for (Entry<String, String[]> entry : entrySet3) {
			out.println(entry.getKey()+" is "+(entry.getValue().length>1?entry.getValue():entry.getValue()[0]));		
			
		}
		
		session.invalidate();
		
		
		
		
	}

}
