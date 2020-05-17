package in.codersclub.javatechs.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.codersclub.javatechs.dao.DepartmentDao;
import in.codersclub.javatechs.dao.DesignationDao;
import in.codersclub.javatechs.dao.EmployeeDao;
import in.codersclub.javatechs.dao.impl.DepartmentDaoImpl;
import in.codersclub.javatechs.dao.impl.DesignationDaoImpl;
import in.codersclub.javatechs.dao.impl.EmployeeDaoImpl;
import in.codersclub.javatechs.dom.Department;
import in.codersclub.javatechs.dom.Designation;
import in.codersclub.javatechs.dom.Employee;
import in.codersclub.javatechs.exceptions.ProcessingException;

@WebServlet("/employeeInsert")
public class EmployeeInsertServlet extends HttpServlet
{

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("EmployeeInsertServlet.doGet() ...");
	
		List<Department> departmentList = new ArrayList<Department>();
		List<Designation> designationList = new ArrayList<Designation>();
		
		DepartmentDao departmentDao = new DepartmentDaoImpl();
		DesignationDao designationDao = new DesignationDaoImpl();

		departmentList = departmentDao.getAllDepartments();
		designationList = designationDao.getAllDesignations();

		request.setAttribute("departmentList", departmentList);
		request.setAttribute("designationList",designationList);
	
		
		gotoPage(request, response, "organization/employeeInsert.jsp");
	}
	
	
	

	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("EmployeeServlet.doEmployeeInsert() ...");
		Employee employee = null;
		
		EmployeeDao employeeDao = new EmployeeDaoImpl();

		List<Department> departmentList = new ArrayList<Department>();
		List<Designation> designationList = new ArrayList<Designation>();
		
		DepartmentDao departmentDao = new DepartmentDaoImpl();
		DesignationDao designationDao = new DesignationDaoImpl();
		
		int employeeId = 0;
		String name = null;
		String gender = null;
		java.sql.Date dateOfBirth = null;
		java.sql.Date dateOfJoining = null;
		int deptNo = 0;
		String designationId = null;
		int managerId = 0;
		String emailId = null;
		
		String dob = null;
		String doj = null;
		String depNo = null;
		String mgrId = null;
		
		java.util.Date utilDate = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		long l = 0;
		
		String id = request.getParameter("employeeId");
		if ( id != null )
		{
			employeeId = Integer.parseInt(id);
			name = request.getParameter("name");
			gender = request.getParameter("gender");
			dob = request.getParameter("dateOfBirth");
			doj = request.getParameter("dateOfJoining");
			
			System.out.println("dob = " + dob);
			System.out.println("doj = " + doj);
			
		    try
		    {
		         utilDate = sdf.parse(dob);
			     l = utilDate.getTime();
			     dateOfBirth =  new java.sql.Date(l);			

		         utilDate = sdf.parse(doj);
			     l = utilDate.getTime();
			     dateOfJoining =  new java.sql.Date(l);			
		    }
		    catch(ParseException pe)
		    {
		         System.out.println("EmployeeServlet.employeeInsert()  : " + pe);
		    }

		    depNo = request.getParameter("deptNo");
			deptNo = Integer.parseInt(depNo);
			designationId = request.getParameter("designationId");
			mgrId = request.getParameter("managerId");
			managerId = Integer.parseInt(mgrId);
			emailId = request.getParameter("emailId");
			
			System.out.println("employeeId = " + employeeId);
			System.out.println("name = " + name);
			System.out.println("gender = " + gender);
			System.out.println("date of birth = " + dateOfBirth);
			System.out.println("date of joining = " + dateOfJoining);
			System.out.println("deptNo = " + deptNo);
			System.out.println("designationId = " + designationId);
			System.out.println("managerId = " + managerId);
			System.out.println("emailId = " + emailId);
			
			employee = new Employee(employeeId, name, gender, dateOfBirth,
					dateOfJoining, deptNo, designationId,managerId,emailId);
		}
		
		if ( employee != null )
		{
			try
			{
				employeeDao.insert(employee);

				departmentList = departmentDao.getAllDepartments();
				designationList = designationDao.getAllDesignations();

				request.setAttribute("departmentList", departmentList);
				request.setAttribute("designationList",designationList);
				
				gotoPage(request, response,"organization/employeeInsert.jsp?message=Insertion success");
			}
			catch(ProcessingException pe)
			{
				gotoPage(request, response,"organization/employeeInsert.jsp?message="+pe);
			}
		}

		
		gotoPage(request, response,"organization/employeeInsert.jsp");
	}

	private void gotoPage(HttpServletRequest request, HttpServletResponse response, String url)
	throws ServletException, IOException
	{
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request,  response);
	}


}


