

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class PerfTestFilter
 */
public class PerfTestFilter implements Filter {

	FilterConfig fc=null;
	
    /**
     * Default constructor. 
     */
    public PerfTestFilter() {
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
		
		long beforeProcess=System.currentTimeMillis();
		chain.doFilter(request, response);
		long afterProcess=System.currentTimeMillis();
		
		
		long diff=afterProcess-beforeProcess;
		
		HttpServletRequest hreq=(HttpServletRequest)request;
		
		ServletContext sc=fc.getServletContext();
		
		sc.log("total time required for processing"+hreq.getRequestURI()+":"+diff);
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		
		fc=fConfig;
	}

}
