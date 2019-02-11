package com.pragim.sessionwithcookies.ctrl;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
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
		
		/*Map<String, String[]> form3Data = request.getParameterMap();
		
		HttpSession session = request.getSession();
		System.out.println(session.getId());
		Map<String,String[]> form1Data = (Map<String,String[]>)session.getAttribute("form1");
		
		Set<Entry<String, String[]>> entrySet = form1Data.entrySet();
		for (Entry<String, String[]> entry : entrySet) {
			out.println(entry.getKey()+" is "+(entry.getValue().length>1?entry.getValue():entry.getValue()[0]));		
			
		}
		
		Map<String,String[]> form2Data = (Map<String,String[]>)session.getAttribute("form2");
		
		Set<Entry<String, String[]>> entrySet2 = form2Data.entrySet();
		for (Entry<String, String[]> entry : entrySet2) {
			out.println(entry.getKey()+" is "+(entry.getValue().length>1?entry.getValue():entry.getValue()[0]));		
			
		}
		
		
		out.println((String)session.getAttribute("skill"));
		out.println((String)session.getAttribute("exp"));
		
		Set<Entry<String, String[]>> entrySet3 = form3Data.entrySet();
		for (Entry<String, String[]> entry : entrySet3) {
			out.println(entry.getKey()+" is "+(entry.getValue().length>1?entry.getValue():entry.getValue()[0]));		
			
		}*/
		
		
		//current form
		String location = request.getParameter("loc");
		String salary = request.getParameter("sal");
		
		HttpSession session = request.getSession(false);
		
		//form-1
		if(session!=null){
		String name = (String)session.getAttribute("uname");
		String age = (String)session.getAttribute("age");
		String dob = (String)session.getAttribute("dob");
		String gen = (String)session.getAttribute("gender");
		String hobbies = (String)session.getAttribute("hobbies");
		String address = (String)session.getAttribute("addr");
		String country = (String)session.getAttribute("country");
		String state = (String)session.getAttribute("state");
		
		//form-2
		String skill = (String)session.getAttribute("skill");
		String exp = (String)session.getAttribute("exp");
		
		
		
		
		
		Connection connection = ConnectionUtility.getConnectionFromOracle();
		
		try {
			PreparedStatement pstmt = connection.prepareStatement("insert into reg_table values(regi_seq.nextval,?,?,?,?,?,?,?,?,?,?,?,?)");
			pstmt.setString(1, name);
			pstmt.setInt(2, Integer.parseInt(age));
			
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
			Date parse = sdf.parse(dob);
			java.sql.Date dobDate = new java.sql.Date(parse.getTime());
			
			pstmt.setDate(3, dobDate);
			pstmt.setString(4, gen);
			pstmt.setString(5, hobbies);
			pstmt.setString(6, address);
			pstmt.setString(7, country);
			pstmt.setString(8, state);
			pstmt.setString(9, skill);
			pstmt.setInt(10, Integer.parseInt(exp));
			pstmt.setString(11, location);
			pstmt.setInt(12, Integer.parseInt(salary));
		
			int executeUpdate = pstmt.executeUpdate();
			
			if(executeUpdate>0)
				out.println("<h1><font color='green'>Reg Completed Successfully</font></h1>");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		}else{
			out.println("Session is blocked");
		}
		
		
		
		
	}

}
