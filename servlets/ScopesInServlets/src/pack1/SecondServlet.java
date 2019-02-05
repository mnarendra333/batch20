package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
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
		
		
		
		PrintWriter pw = response.getWriter();
		//collect the data from request object
		
		String requname = (String)request.getAttribute("username1");
		String reqage = (String)request.getAttribute("age1");
		String reqphno = (String)request.getAttribute("phno1");
		
		
		pw.println("request data : \n "+requname+" "+reqage+" "+reqphno);
		//collect the data from session object
		
		HttpSession session = request.getSession();
		String sesuname = (String)session.getAttribute("username2");
		String sesage = (String)session.getAttribute("age2");
		String sesphno = (String)session.getAttribute("phno2");
		pw.println("session data : \n "+sesuname+" "+sesage+" "+sesphno);
		//collect the data from context
		
		ServletContext servletContext = getServletContext();
		String ctxName = (String)servletContext.getAttribute("username3");
		String ctxage = (String)servletContext.getAttribute("age3");
		String ctxphno = (String)servletContext.getAttribute("phno3");
		
		pw.println("conext data : \n "+ctxName+" "+ctxage+" "+ctxphno);
	}

}
