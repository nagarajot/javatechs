package in.codersclub.javatechs.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.codersclub.javatechs.dao.EmployeeDao;
import in.codersclub.javatechs.dao.impl.EmployeeDaoImpl;
import in.codersclub.javatechs.dom.Employee;
import in.codersclub.javatechs.exceptions.EmployeeNotFoundException;
import in.codersclub.javatechs.utils.DateArithmetic;

@WebServlet("/employeesByDateOfBirth")
public class EmployeesByDateOfBirthServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("EmployeesByDateOfBirthServlet.doGet() ...");
		
		gotoPage(request, response, "organization/employeesByDateOfBirth.jsp");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("EmployeesByDateOfBirthServlet.doPost() ...");
		
		String fromDate = request.getParameter("fromDate");
		String toDate = request.getParameter("toDate");
		
		System.out.println("fromDate : " + fromDate);
		System.out.println("toDate   : " + toDate);

		java.sql.Date sqlFromDate = java.sql.Date.valueOf(fromDate);
		java.sql.Date sqlToDate = java.sql.Date.valueOf(toDate);
		
		Employee employee = null;
		List<Employee> employeeList = null;
		
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		
		try
		{
			employeeList = employeeDao.getEmployeesByDateOfBirth(sqlFromDate, sqlToDate);
			request.setAttribute("employeeList", employeeList);
		}
		catch(EmployeeNotFoundException enfe)
		{
			gotoPage(request, response, "organization/employeesByDateOfBirth.jsp?message=No data ...");
			return;
		}
		gotoPage(request, response, "organization/employeesByDateOfBirth.jsp");
	}
	
	private void gotoPage(HttpServletRequest request, HttpServletResponse response, String url)
	throws ServletException, IOException
	{
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request,  response);
	}
}




