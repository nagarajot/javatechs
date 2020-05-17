package in.codersclub.javatechs.jsphelpers;

import javax.servlet.http.HttpServletRequest;

public class EmployeesByDeptsJspHelper
{
	private String[] deptNo;
	
	public EmployeesByDeptsJspHelper(HttpServletRequest request)
	{
		deptNo = request.getParameterValues("deptNo");
	}
	
	public String isDeptNoChecked(String s)
	{
		if ( deptNo != null )
		for ( String s1 : deptNo )
			if ( s1.equals(s))
				return "checked";

		return "";
	}
}


