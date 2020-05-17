package in.codersclub.javatechs.jsphelpers;

import javax.servlet.http.HttpServletRequest;

public class TimeZoneJspHelper
{
	private String zoneId;
	
	public TimeZoneJspHelper(HttpServletRequest request)
	{
		zoneId = request.getParameter("zoneId");
	}
	
	public String isZoneIdSelected(String s)
	{
		if ( zoneId == null )
			return "";
		
		if ( zoneId.equals(s) )
			return "selected";
		else
			return "";
	}
}


