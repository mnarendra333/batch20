package com.pragim.listner;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * Application Lifecycle Listener implementation class MyServletReqListner
 *
 */
public class MyServletReqListner implements ServletRequestListener {

	long startTime,endTime;
    public MyServletReqListner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent sre)  { 
         // TODO Auto-generated method stub
    	 endTime = System.currentTimeMillis();
    	 ServletContext ctx = sre.getServletContext();
     	 ctx.log("Time taken to process the request is  "+(endTime-startTime));
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent sre)  { 
    	
    	startTime = System.currentTimeMillis();
    	ServletContext ctx = sre.getServletContext();
    	
    	ctx.log("request created at "+startTime);
    }
	
}
