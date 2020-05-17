package in.codersclub.javatechs.jsphelpers;

import javax.servlet.http.HttpServletRequest;

public class ZodiacSignJspHelper
{
	private String date;
	private String month;
	
	public ZodiacSignJspHelper(HttpServletRequest request)
	{
		date = request.getParameter("date");
		month = request.getParameter("month");
	}
	
	public String isDateSelected(String s)
	{
		if ( date == null )
			return "";
		if ( date.equals(s))
			return "selected";
		else
			return "";
	}
	
	public String isMonthSelected(String s)
	{
		if ( month == null )
			return "";
		if ( month.equals(s))
			return "selected";
		else
			return "";
	}
}


