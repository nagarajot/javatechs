package in.codersclub.javatechs.servlets;

import java.io.IOException;
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

@WebServlet("/employeesByDepts")
public class EmployeesByDeptsServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("EmployeesByDeptsServlet.doGet() ...");
		
		gotoPage(request, response, "organization/employeesByDepts.jsp");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("EmployeesByDeptsServlet.doPost() ...");
		
		Employee employee = null;
		List<Employee> employeeList = null;
		
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		
		String[] deptNo = request.getParameterValues("deptNo");
		
		employeeList = employeeDao.getEmployeesByDeptNo(deptNo);

		if ( employeeList.size() == 0 )
		{
			gotoPage(request, response, "organization/employeesByGender.jsp?message=Not found ...");
			return;
		}
		
		request.setAttribute("employeeList", employeeList);
		gotoPage(request, response, "organization/employeesByDepts.jsp");
	}
	
	private void gotoPage(HttpServletRequest request, HttpServletResponse response, String url)
	throws ServletException, IOException
	{
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request,  response);
	}
}




