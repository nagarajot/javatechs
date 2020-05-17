package in.codersclub.javatechs.jsphelpers;

import javax.servlet.http.HttpServletRequest;

public class RangeOfDatesJspHelper
{
	private String fromDate;
	private String toDate;
	
	public RangeOfDatesJspHelper(HttpServletRequest request)
	{
		fromDate = request.getParameter("fromDate");
		toDate = request.getParameter("toDate");
	}
	
	public String getFromDate()
	{
		if ( fromDate == null )
			return "";
		else
			return fromDate;
	}
	
	public String getToDate()
	{
		if ( toDate == null )
			return "";
		else
			return toDate;
	}
	
	
	
}