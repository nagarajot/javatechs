package in.codersclub.javatechs.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.codersclub.javatechs.dao.ZodiacSignDao;
import in.codersclub.javatechs.dao.impl.ZodiacSignDaoImpl;
import in.codersclub.javatechs.dom.ZodiacSign;

@WebServlet("/zodiacSigns")
public class ZodiacSignsServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("AddServlet.doGet() ...");
		
		gotoPage(request, response, "zodiacSigns.jsp");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("ZodiacSignsServlet.doPost() ...");

		String month = request.getParameter("month");
		String date = request.getParameter("date");
		
		System.out.println("month = " + month);
		System.out.println("date  = " + date);
		
		ZodiacSign zodiacSign = null;
		
		ZodiacSignDao zodiacSignDao = new ZodiacSignDaoImpl();
		zodiacSign = zodiacSignDao.getZodiacSign(date, month);
		
		if (  zodiacSign == null )
			System.out.println("zodiacSign is null");
		else
			System.out.println("zodiacSign is not null");
		
		gotoPage(request, response, "zodiacSigns.jsp?zodiacSign=" + zodiacSign.getZodiacSign());
	}
	
	private void gotoPage(HttpServletRequest request, HttpServletResponse response, String url)
	throws ServletException, IOException
	{
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request,  response);
	}
}


