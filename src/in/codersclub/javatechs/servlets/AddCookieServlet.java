package in.codersclub.javatechs.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addCookie")
public class AddCookieServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("AddCookieServlet.doGet() ...");
		
		gotoPage(request, response, "addCookie.jsp");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("AddCookieServlet.doPost() ...");
		
		 PrintWriter out = response.getWriter();

         String cookieName = request.getParameter("cookieName");
         String cookieValue = request.getParameter("cookieValue");

         System.out.println("cookieName = " + cookieName);
         System.out.println("cookieValue = " + cookieValue);
         
         //Creating two cookies
         Cookie cookie=new Cookie(cookieName,cookieValue);

         //Adding the cookies to response header
         response.addCookie(cookie);
		
         gotoPage(request, response, "addCookie.jsp?message=cookie added");
	}
	
	private void gotoPage(HttpServletRequest request, HttpServletResponse response, String url)
	throws ServletException, IOException
	{
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request,  response);
	}
}




