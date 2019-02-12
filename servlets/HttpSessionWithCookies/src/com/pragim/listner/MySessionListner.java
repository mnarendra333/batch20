package com.pragim.listner;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MySessionListner
 *
 */
public class MySessionListner implements HttpSessionListener {

   long startTime,endTime;
    public MySessionListner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
    	startTime = System.currentTimeMillis();
    	
    	ServletContext ctx = se.getSession().getServletContext();
    	ctx.log("session created at "+startTime);
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	endTime = System.currentTimeMillis();
    	
    	ServletContext ctx = se.getSession().getServletContext();
    	ctx.log("Total session time is  "+(endTime-startTime));
    }
	
}
