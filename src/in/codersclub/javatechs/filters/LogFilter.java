package in.codersclub.javatechs.filters;

import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LogFilter implements Filter  {
   public void  init(FilterConfig config) throws ServletException {
      
	  System.out.println("LogFilter.init() ...");
      // Get init parameter 
      String testParam = config.getInitParameter("cc"); 

      //Print the init parameter 
      System.out.println("Test Param: " + testParam); 
   }
   
   public void  doFilter(ServletRequest request, ServletResponse response,
      FilterChain chain) throws java.io.IOException, ServletException {

      // Get the IP address of client machine.
      String ipAddress = request.getRemoteAddr();

      // Log the IP address and current timestamp.
      System.out.println("IP address :  "+ ipAddress);
      System.out.println("Time       :  "+ new Date());

      // Pass request back down the filter chain
      chain.doFilter(request,response);
   }

   public void destroy() {
      System.out.println("LogFilter.destroy() ...");
   }
}


