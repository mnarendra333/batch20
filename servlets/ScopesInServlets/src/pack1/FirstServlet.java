package pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
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
		
		
		//get the request data
		
		
		String username = request.getParameter("uname");
		String age = request.getParameter("age");
		String phno = request.getParameter("phoneno");
		
		
		//set the data to request scope
		
		
		
		request.setAttribute("username1", username);
		request.setAttribute("age1", age);
		request.setAttribute("phno1", phno);
		
		// set the data into session scope
		
		
		HttpSession session = request.getSession();
		session.setAttribute("username2", username);
		session.setAttribute("age2", age);
		session.setAttribute("phno2", phno);
		
		
		//set the data to conext scope
		ServletContext ctx = getServletContext();
		ctx.setAttribute("username3", username);
		ctx.setAttribute("age3", age);
		ctx.setAttribute("phno3", phno);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/srv2");
		requestDispatcher.forward(request, response);
		
	}

}
