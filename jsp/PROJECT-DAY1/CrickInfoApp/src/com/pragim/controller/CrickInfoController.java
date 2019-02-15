package com.pragim.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pragim.dao.CrickInfoDao;
import com.pragim.dao.CrickInoDaoImpl;
import com.pragim.model.Teams;

/**
 * Servlet implementation class CrickInfoController
 */
@WebServlet("/getdata")
public class CrickInfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrickInfoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String operation = request.getParameter("click");
		if(operation!=null){
			
			//if(operation.equalsIgnoreCase("playrlist"))
			
			
		}
		
					
		CrickInfoDao dao  =new CrickInoDaoImpl();
		List<Teams> teamsInfo = dao.getTeamsInfo();
		request.setAttribute("teamlist", teamsInfo);
		
		//dispatch logic
		
		RequestDispatcher rd = request.getRequestDispatcher("displayTeams.jsp");
		rd.forward(request, response);
		
		
	}

}
