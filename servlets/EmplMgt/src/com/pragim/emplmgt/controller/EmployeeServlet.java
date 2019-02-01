package com.pragim.emplmgt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.pragim.emplmgt.dao.EmployeeDAO;
import com.pragim.emplmgt.util.ConnectionUtility;

/**
 * Servlet implementation class EmployeeServlet
 */
public class EmployeeServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw = response.getWriter();
		EmployeeDAO empDao = new EmployeeDAO();
		ResultSet rs = empDao.getEmployeeList();
		try {
			while (rs.next()) {
				pw.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
