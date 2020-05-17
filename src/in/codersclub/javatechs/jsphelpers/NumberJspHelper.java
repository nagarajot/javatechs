package in.codersclub.javatechs.jsphelpers;

import javax.servlet.http.HttpServletRequest;

public class NumberJspHelper
{
	private String number;
	
	public NumberJspHelper(HttpServletRequest request)
	{
		number = request.getParameter("number");
	}
	
	public String getNumber()
	{
		if ( number == null )
			return "";
		else
			return number;
	}
}