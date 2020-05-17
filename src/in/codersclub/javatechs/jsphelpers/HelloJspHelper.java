package in.codersclub.javatechs.jsphelpers;

import javax.servlet.http.HttpServletRequest;

public class HelloJspHelper
{
	private String name;
	
	public HelloJspHelper(HttpServletRequest request)
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


