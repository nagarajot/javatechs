package in.codersclub.javatechs.jsphelpers;

import javax.servlet.http.HttpServletRequest;

public class StateJspHelper
{
	private String stateCode;
	private String districtCode;
	
	public StateJspHelper(HttpServletRequest request)
	{
		stateCode = request.getParameter("stateCode");
		districtCode = request.getParameter("districtCode");
	}
	
	public String isStateSelected(String s)
	{
		if ( stateCode == null )
			return "";
		if ( stateCode.equals(s))
			return "selected";
		else
			return "";
	}

	public String isDistrictSelected(String s)
	{
		if ( districtCode == null )
			return "";
		if ( districtCode.equals(s))
			return "selected";
		else
			return "";
	}



}



