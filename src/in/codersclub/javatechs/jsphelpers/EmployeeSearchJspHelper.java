package in.codersclub.javatechs.jsphelpers;

import javax.servlet.http.HttpServletRequest;

public class EmployeeSearchJspHelper
{
	private String employeeId;
	
	public EmployeeSearchJspHelper(HttpServletRequest request)
	{
		employeeId = request.getParameter("employeeId");
	}
	
	public String getEmployeeId()
	{
		if ( employeeId != null )
			return employeeId;
		else
			return "";
	}
}



