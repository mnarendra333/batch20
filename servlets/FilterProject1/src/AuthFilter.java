

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class AuthFilter
 */
public class AuthFilter implements Filter {

	
	private FilterConfig fc=null;
	private ServletContext sc=null;
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

		// pass the request along the filter chain
		
		HttpServletRequest hreq=(HttpServletRequest)request;
		String login_page="/one.html";
		String un=request.getParameter("uname");
		String pw=request.getParameter("pwd");
		
		sc.log("in filter :"+hreq.getRequestURI());
		sc.log("in filter :"+hreq.getServletPath());
		sc.log("uname="+un+"password"+pw);
		
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			
			PreparedStatement pstmt=con.prepareStatement("select * from userlist where username=? and password=?");
			pstmt.setString(1, un);
			pstmt.setString(2, pw);
			
			ResultSet rs=pstmt.executeQuery();
			
			if(rs.next())
				
			{
				sc.log("username and password that you given are correct");
				chain.doFilter(request, response);
			}
			else
			{
				sc.log("trying to display the same login page");
				RequestDispatcher rd=request.getRequestDispatcher(login_page);
				rd.forward(request, response);
			}
		
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	
	fc=fConfig;
	sc=fc.getServletContext();
	}

}
