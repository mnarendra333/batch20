package pack1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfigCtrl
 */
public class ServletConfigCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Connection con = null;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("inside init method");
		String driverClassName = config.getInitParameter("driver");
		
		String url = config.getInitParameter("url");
		String username = config.getInitParameter("username");
		String password = config.getInitParameter("password");
		
		
		//get context data
		
		ServletContext ctx = config.getServletContext();
		String loc = ctx.getInitParameter("imageLoc");
		System.out.println(loc);
		
		
		try {
			Class.forName(driverClassName);
			con = DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		System.out.println("inside service");
		if(con!=null)
			response.getWriter().println("Conneced to DB!!!");
		
	}

}
