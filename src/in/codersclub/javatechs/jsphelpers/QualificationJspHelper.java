package in.codersclub.javatechs.jsphelpers;

import javax.servlet.http.HttpServletRequest;

public class QualificationJspHelper
{
	private String qualification;
	
	public QualificationJspHelper(HttpServletRequest request)
	{
		qualification = request.getParameter("qualification");
	}
	
	public String isQualificationSelected(String s)
	{
		if ( qualification == null )
			return "";
		if ( qualification.equals(s))
			return "selected";
		else
			return "";
	}
}



