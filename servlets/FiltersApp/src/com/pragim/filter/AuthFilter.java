package com.pragim.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.pragim.utility.ConnectionUtility;

/**
 * Servlet Filter implementation class AuthFilter
 */
public class AuthFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AuthFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		
		try {
			
			Connection connection = ConnectionUtility.getConnectionFromOracle();
			PreparedStatement pstmt = connection.prepareStatement("select * from userlist where username=? and password=?");
			pstmt.setString(1, request.getParameter("uname"));
			pstmt.setString(2, request.getParameter("pwd"));
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next())
				chain.doFilter(request, response);
			else{
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.forward(request, response); 
			}
			
			//response.setContentType("application/json");
			PrintWriter out = response.getWriter();
			out.println("username is "+request.getParameter("uname"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		// pass the request along the filter chain
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
