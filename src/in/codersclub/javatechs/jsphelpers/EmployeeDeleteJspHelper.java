package in.codersclub.javatechs.jsphelpers;

import javax.servlet.http.HttpServletRequest;

public class EmployeeDeleteJspHelper
{
	private String employeeId;
	
	public EmployeeDeleteJspHelper(HttpServletRequest request)
	{
		employeeId = request.getParameter("employeeId");
	}
	
	public String getEmployeeId()
	{
		if ( employeeId == null )
			return "";
		else
			return employeeId;
	}
}


