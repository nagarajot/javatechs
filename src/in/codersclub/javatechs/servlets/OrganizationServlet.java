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
import javax.servlet.http.HttpSession;

import in.codersclub.javatechs.dao.EmployeeDao;
import in.codersclub.javatechs.dao.impl.EmployeeDaoImpl;
import in.codersclub.javatechs.dom.Employee;
import in.codersclub.javatechs.dom.User;

@WebServlet("/organization")
public class OrganizationServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("OrganizationServlet.doGet() ...");
		
		HttpSession session = null;
		session = request.getSession(false);
		
		if ( session == null )
		{
			System.out.println("Here 1 ...");
			System.out.println("Redirecting to login page ...");
			gotoPage(request, response,"login.jsp");
			return;
		}
		User user = (User)session.getAttribute("user");
		if ( user == null )
		{
			System.out.println("Here 2 ...");
			System.out.println("Redirecting to login page ...");
			gotoPage(request, response,"login.jsp");
			return;
		}
		
		String option = request.getParameter("option");
		System.out.println("option = " + option);
		
		
		switch (option)
		{
			case "displayAllEmployees":
				handleDisplayAllEmployees(request, response);
				break;
				
			case "displayEmployeesByGender":
				handleDisplayEmployeesByGender(request, response);
				break;
		}
		
		
	}
	
	private void handleDisplayAllEmployees(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("Organization.handleDisplayAllEmployees() ...");

		Employee employee = null;
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		List<Employee> employeeList = new ArrayList<Employee>();

		
		employeeList = employeeDao.getAllEmployees();
		request.setAttribute("employeeList", employeeList);
		gotoPage(request, response,"/org/displayAllEmployees.jsp");
	}
	
	private void handleDisplayEmployeesByGender(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
	
		
		
		
	}
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("AddServlet.doPost() ...");
		
		String operand1 = request.getParameter("operand1");
		String operand2 = request.getParameter("operand2");
		
		int opr1 = Integer.parseInt(operand1);
		int opr2 = Integer.parseInt(operand2);
		
		int result = opr1 + opr2;
		
		gotoPage(request, response, "add.jsp?result="+result);
	}
	
	private void gotoPage(HttpServletRequest request, HttpServletResponse response, String url)
	throws ServletException, IOException
	{
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request,  response);
	}
}




