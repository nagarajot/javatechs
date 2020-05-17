package in.codersclub.javatechs.jsphelpers;

import javax.servlet.http.HttpServletRequest;

public class MulTableJspHelper
{
	private String number;
	
	public MulTableJspHelper(HttpServletRequest request)
	{
		number = request.getParameter("number");
	}
	
	public String isNumberSelected(String s)
	{
		if ( number == null )
			return "";
		if ( number.equals(s))
			return "selected";
		else 
			return "";
	}
}



