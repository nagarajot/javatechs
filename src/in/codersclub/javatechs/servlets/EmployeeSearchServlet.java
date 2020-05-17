package in.codersclub.javatechs.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.codersclub.javatechs.dom.Employee;
import in.codersclub.javatechs.dao.EmployeeDao;
import in.codersclub.javatechs.dao.impl.EmployeeDaoImpl;
import in.codersclub.javatechs.exceptions.EmployeeNotFoundException;

@WebServlet("/employeeSearch")
public class EmployeeSearchServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("EmployeeSearchServlet.doGet() ...");
		gotoPage(request, response, "organization/employeeSearch.jsp");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("EmployeeSearchServlet.doPost() ...");

		String strEmployeeId = request.getParameter("employeeId");
		int employeeId = Integer.parseInt(strEmployeeId);
		
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		Employee employee = null;
		
		try
		{
			employee = employeeDao.search(employeeId);
			request.setAttribute("employee", employee);
			gotoPage(request, response, "organization/employeeSearch.jsp");
		}
		catch(EmployeeNotFoundException enfe)
		{
			System.out.println(enfe);
			gotoPage(request, response, "organization/employeeSearch.jsp?message=Not found ...");
		}
	}

	private void gotoPage(HttpServletRequest request, HttpServletResponse response, String url)
	throws ServletException, IOException
	{
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request,  response);
	}
}



