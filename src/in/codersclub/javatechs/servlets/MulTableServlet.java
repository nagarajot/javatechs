package in.codersclub.javatechs.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mulTable")
public class MulTableServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest requst, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("MulTableServlet.doGet() ...");
		gotoPage(requst, response, "/mulTable.jsp");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("MulTableServlet.doPost() ...");
		String number = request.getParameter("number");
		gotoPage(request, response, "/mulTable.jsp?number" + number);
	}

	
	
	public void gotoPage(HttpServletRequest request, HttpServletResponse response, String url)
	throws ServletException, IOException
	{
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request,  response);
	}
	
	
}