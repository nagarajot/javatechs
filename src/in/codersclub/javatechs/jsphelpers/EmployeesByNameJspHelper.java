package in.codersclub.javatechs.jsphelpers;

import javax.servlet.http.HttpServletRequest;

public class EmployeesByNameJspHelper
{
	private String name;
	
	public EmployeesByNameJspHelper(HttpServletRequest request)
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