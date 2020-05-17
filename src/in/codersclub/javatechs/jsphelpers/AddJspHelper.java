package in.codersclub.javatechs.jsphelpers;

import javax.servlet.http.HttpServletRequest;

public class AddJspHelper
{
	private String operand1;
	private String operand2;
	
	public AddJspHelper(HttpServletRequest request)
	{
		operand1 = request.getParameter("operand1");
		operand2 = request.getParameter("operand2");
	}
	
	public String getOperand1()
	{
		if ( operand1 == null )
			return "";
		else
			return operand1;
	}
	
	public String getOperand2()
	{
		if ( operand2 == null )
			return "";
		else
			return operand2;
	}
}



