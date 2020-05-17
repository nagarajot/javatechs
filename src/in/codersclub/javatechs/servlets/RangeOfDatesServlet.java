package in.codersclub.javatechs.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.codersclub.javatechs.utils.DateArithmetic;

@WebServlet("/rangeOfDates")
public class RangeOfDatesServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("RangeOfDatesServlet.doGet() ...");
		
		gotoPage(request, response, "rangeOfDates.jsp");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("RangeOfDatesServlet.doPost() ...");
		
		String fromDate = request.getParameter("fromDate");
		String toDate = request.getParameter("toDate");
		
		System.out.println("fromDate : " + fromDate);
		System.out.println("toDate   : " + toDate);
		
		List<String> l = new ArrayList<String>();
		
		String curDate = fromDate;
		
		for ( ;; )
		{
			l.add(curDate);
			curDate = DateArithmetic.addDays(curDate, 1);
			if ( curDate.equals(toDate)) break;
		}
		
		request.setAttribute("dateList", l);
		gotoPage(request, response, "rangeOfDates.jsp");
	}
	
	private void gotoPage(HttpServletRequest request, HttpServletResponse response, String url)
	throws ServletException, IOException
	{
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request,  response);
	}
}




