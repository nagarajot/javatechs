package in.codersclub.javatechs.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NumberServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("doGet() ...");
		gotoPage(request, response, "number.jsp");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("doPost() ...");
		
		String number = request.getParameter("number");
		int n = Integer.parseInt(number);
		
		String result = null;
		
		switch (n) {
			case 0 :
				result = "Zero";
				break;
			
			case 1 :
				result = "One";
				break;

			case 2 :
				result = "Two";
				break;
				
			case 3 :
				result = "Three";
				break;
				
			case 4 :
				result = "Four";
				break;
				
			case 5 :
				result = "Five";
				break;
				
		}
		
		gotoPage(request, response, "number.jsp?result=" + result );
	}
	
	public void gotoPage(HttpServletRequest request, HttpServletResponse response, String url)
	throws ServletException, IOException
	{
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request,  response);
	}

	
	
	
	
}