package in.codersclub.javatechs.servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/timeZone")
public class TimeZoneServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("TimeZoneServlet.doGet() ...");
		
		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		request.setAttribute("availableZoneIds", availableZoneIds);
		
		gotoPage(request, response, "timeZone.jsp");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("TimeZoneServlet.doPost() ...");
		
		String timeZone = request.getParameter("zoneId");
		System.out.println(timeZone);
		
		ZoneId zoneId = ZoneId.of(timeZone);
		
		LocalDate localDate = LocalDate.now(zoneId);
		LocalTime localTime = LocalTime.now(zoneId);

		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		request.setAttribute("availableZoneIds", availableZoneIds);
		gotoPage(request, response, "timeZone.jsp?localDate="+localDate+"&localTime="+localTime);
	}
	
	private void gotoPage(HttpServletRequest request, HttpServletResponse response, String url)
	throws ServletException, IOException
	{
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request,  response);
	}
}
