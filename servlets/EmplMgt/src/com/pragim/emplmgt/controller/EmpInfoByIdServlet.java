package com.pragim.emplmgt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.pragim.emplmgt.util.ConnectionUtility;

/**
 * Servlet implementation class EmpInfoByIdServlet
 */
public class EmpInfoByIdServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public EmpInfoByIdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		try {
			
			PrintWriter pw = response.getWriter();
			String eno = request.getParameter("eno");
			int empNo = Integer.parseInt(eno);
			
			Connection con = ConnectionUtility.getConFromOracle();
			PreparedStatement pstmt = con.prepareStatement("select * from empl where id = ?");
			pstmt.setInt(1, empNo);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
				pw.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
				
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
