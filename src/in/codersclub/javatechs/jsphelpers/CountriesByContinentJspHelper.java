package in.codersclub.javatechs.jsphelpers;

import javax.servlet.http.HttpServletRequest;

public class CountriesByContinentJspHelper
{
	private String continentCode;
	
	public CountriesByContinentJspHelper(HttpServletRequest request)
	{
		continentCode = request.getParameter("continentCode");
	}
	
	public String isContinentCodeSelected(String s)
	{
		if ( continentCode == null )
			return "";
		
		if ( continentCode.equals(s) )
			return "selected";
		else
			return "";
	}
}


