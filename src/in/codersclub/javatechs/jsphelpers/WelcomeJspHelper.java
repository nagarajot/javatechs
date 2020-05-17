package in.codersclub.javatechs.jsphelpers;

import javax.servlet.http.HttpServletRequest;

public class WelcomeJspHelper
{
	private String name;
	
	public WelcomeJspHelper(HttpServletRequest request)
	{
		name = request.getParameter("name");
	}
	
	public String getName()
	{
		if ( name == null )
			return "";
		else
			return name;
	}
}