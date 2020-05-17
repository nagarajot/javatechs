package in.codersclub.javatechs.jsphelpers;

import javax.servlet.http.HttpServletRequest;

public class LanguagesJspHelper
{
	private String[] languages;
	
	public LanguagesJspHelper(HttpServletRequest request)
	{
		languages = request.getParameterValues("language");
	}
	
	public String isLanguageChecked(String s)
	{
		if ( languages != null )
		for ( String s1 : languages )
			if ( s1.equals(s))
				return "checked";

		return "";
	}
}


