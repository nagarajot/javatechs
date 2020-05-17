package in.codersclub.javatechs.servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/info")
public class InfoServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("InfoServlet.doGet() ...");

		System.out.println("contentLength = " + request.getContentLength());
		System.out.println("method        = " + request.getMethod());
		
		gotoPage(request, response, "info.jsp");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("InfoServlet.doPost() ...");
		
		System.out.println("contentLength = " + request.getContentLength());
		System.out.println("method        = " + request.getMethod());

	    Enumeration<String> headerNames = request.getHeaderNames();
	    
        while (headerNames.hasMoreElements()) {
 
            String headerName = headerNames.nextElement();
            System.out.println("headername = " + headerName);
 
            Enumeration<String> headers = request.getHeaders(headerName);
            while (headers.hasMoreElements()) {
                String headerValue = headers.nextElement();
                System.out.println(headerValue);
            }
        }		
	
        // Request body
        System.out.println("body hnadling ...");
        StringBuilder builder = new StringBuilder();
        BufferedReader reader = request.getReader();
        if (reader == null) {
                System.out.println("Request body could not be read because it's empty.");
                return;
        }
        
        String line;
        while ((line = reader.readLine()) != null) {
                builder.append(line);
        }
        
        System.out.println(builder);
        
        
        
        
        
        
        gotoPage(request, response, "info.jsp");
	}

	
	
	private void gotoPage(HttpServletRequest request, HttpServletResponse response, String url)
	throws ServletException, IOException
	{
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request,  response);
	}
}




