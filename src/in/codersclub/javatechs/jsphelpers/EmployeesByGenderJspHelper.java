package in.codersclub.javatechs.jsphelpers;

import javax.servlet.http.HttpServletRequest;

public class EmployeesByGenderJspHelper
{
	private String gender;
	
	public EmployeesByGenderJspHelper(HttpServletRequest request)
	{
		gender = request.getParameter("gender");
	}
	
	public String isGenderChecked(String s)
	{
		if ( gender == null )
			return "";
		if ( gender.equals(s))
			return "checked";
		else
			return "";
	}
}



