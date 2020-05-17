package in.codersclub.javatechs.jsphelpers;

import javax.servlet.http.HttpServletRequest;

public class GenderJspHelper
{
	private String gender;
	
	public GenderJspHelper(HttpServletRequest request)
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



