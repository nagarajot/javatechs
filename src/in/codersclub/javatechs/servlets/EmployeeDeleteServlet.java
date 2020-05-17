package in.codersclub.javatechs.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.codersclub.javatechs.dao.EmployeeDao;
import in.codersclub.javatechs.dao.impl.EmployeeDaoImpl;
import in.codersclub.javatechs.exceptions.EmployeeNotFoundException;

@WebServlet("/employeeDelete")
public class EmployeeDeleteServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("EmployeeDeleteServlet.doGet() ...");
		
		gotoPage(request, response, "organization/employeeDelete.jsp");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("EmployeeDeleteServlet.doPost() ...");
		
		String message = null;
		
		String strEmployeeId = request.getParameter("employeeId");
		int employeeId = Integer.parseInt(strEmployeeId);
		
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		
		try
		{
			employeeDao.delete(employeeId);
			message = "Deleted sucessfully ...";
		}
		catch(EmployeeNotFoundException enfe)
		{
			message = "Not found ...";
		}
		
		gotoPage(request, response, "organization/employeeDelete.jsp?message="+message);
	}
	
	private void gotoPage(HttpServletRequest request, HttpServletResponse response, String url)
	throws ServletException, IOException
	{
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request,  response);
	}
}





