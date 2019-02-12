package com.pragim.listner;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class MyContextListner
 *
 */
public class MyContextListner implements ServletContextListener {

    
	long startTime,endTime;
    public MyContextListner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	endTime = System.currentTimeMillis();
    	ServletContext ctx = sce.getServletContext();
    	
    	ctx.log("Context destoryed at "+startTime);
    	ctx.log("application running for "+(endTime - startTime));
    	//write the logic to send a mail
    	ctx.log("sending mail with server downtime notification");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	startTime = System.currentTimeMillis();
    	ServletContext ctx = sce.getServletContext();
    	
    	
    	ctx.log("Context created at "+startTime);
    	//write the logic to send a mail
    	ctx.log("sending mail");
    	
    }
	
}
