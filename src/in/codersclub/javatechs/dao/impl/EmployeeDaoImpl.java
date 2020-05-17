package in.codersclub.javatechs.dao.impl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import in.codersclub.javatechs.dao.EmployeeDao;
import in.codersclub.javatechs.dom.Employee;
import in.codersclub.javatechs.exceptions.EmployeeNotFoundException;
import in.codersclub.javatechs.exceptions.ProcessingException;
import in.codersclub.javatechs.utils.JdbcUtilities;


public class EmployeeDaoImpl implements EmployeeDao
{
 // implementation is left as an exercise to the student
 public void insert(Employee employee)
 throws ProcessingException
 {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    
    String sql = "insert into employees values(?,?,?,?,?,?,?,?,?)";
    
    try
    {
    	connection = JdbcUtilities.getConnection("organization");
    	preparedStatement = connection.prepareStatement(sql);
    	
    	preparedStatement.setInt(1, employee.getEmployeeId());
    	preparedStatement.setString(2, employee.getName());
    	preparedStatement.setString(3, employee.getGender());
    	preparedStatement.setDate(4,employee.getDateOfBirth());
    	preparedStatement.setDate(5, employee.getDateOfJoining());
    	preparedStatement.setInt(6, employee.getDeptNo());
    	preparedStatement.setString(7,employee.getDesignationId());
    	preparedStatement.setInt(8, employee.getManagerId());
    	preparedStatement.setString(9, employee.getEmailId());
    	
    	preparedStatement.executeUpdate();
    }
    catch(SQLException sqle)
    {
    	System.out.println("EmployeeDaoJdbcImpl.insert() : " + sqle);
    	throw new ProcessingException(sqle.toString());
    }
    finally
    {
    	JdbcUtilities.closeStatement(preparedStatement);
    	JdbcUtilities.closeConnection(connection);
    }
 
 }

 // implementation using select count(*) 
/*
 public int getNoOfRows()
 {
	 System.out.println("EmployeeDaoJdbcImpl.getNoOfRows()...");
	 
	 Connection connection = null;
	 Statement statement = null;
	 ResultSet resultSet = null;
	 
	 String sql = "select count(*) from employees";
	 int n = 0;
	 
	 try
	 {
		 connection = JdbcUtilities.getConnection("employees");
		 statement = connection.createStatement();
		 resultSet = statement.executeQuery(sql);

		 if ( resultSet.next() )
		 n = resultSet.getInt(1);
	 }
	 catch(SQLException sqle)
	 {
		 System.out.println("EmployeeDaoJdbcImpl.getNoOfRows()...");
	 }
	 finally
	 {
		 JdbcUtilities.closeStatement(statement);
		 JdbcUtilities.closeConnection(connection);
	 }
	 System.out.println("n = " + n);
	 return n;
 }
*/
 
//implementation using resultSet.last() 
public int getNoOfRows()
{
	 System.out.println("EmployeeDaoJdbcImpl.getNoOfRows()...");
	 
	 Connection connection = null;
	 Statement statement = null;
	 ResultSet resultSet = null;
	 
	 String sql = "select * from employees";
	 int n = 0;
	 
	 try
	 {
		 connection = JdbcUtilities.getConnection("employees");
		 statement = connection.createStatement();
		 resultSet = statement.executeQuery(sql);

		 resultSet.last();
		 n = resultSet.getRow();
	 }
	 catch(SQLException sqle)
	 {
		 System.out.println("EmployeeDaoJdbcImpl.getNoOfRows()...");
	 }
	 finally
	 {
		 JdbcUtilities.closeStatement(statement);
		 JdbcUtilities.closeConnection(connection);
	 }
	 System.out.println("n = " + n);
	 return n;
}
 
 public List<Employee> getAllEmployees()
 {
  System.out.println("EmployeeDaoJdbcImpl.getAllEmployees() - entering");
 
  String query = "select * from employees";
 
  Connection connection = null;
  Statement statement = null;
  ResultSet resultSet = null;
 
  Employee employee = null;
  List<Employee> employeeList = new ArrayList<Employee>();
 
  try
  {
   connection = JdbcUtilities.getConnection("employees");
   statement = connection.createStatement();
   resultSet = statement.executeQuery(query);
 
   while ( resultSet.next())
   {
    employee = new Employee(resultSet.getInt("employee_id"),
      resultSet.getString("name"),
      resultSet.getString("gender"),
      resultSet.getDate("date_of_birth"),
      resultSet.getDate("date_of_joining"),
      resultSet.getInt("dept_no"),
      resultSet.getString("designation_id"),
      resultSet.getInt("manager_id"),
      resultSet.getString("email_id"));
 
    employeeList.add(employee);

   }
  }
  catch(SQLException sqle)
  {
   System.out.println(sqle);
  }
  finally
  {
   JdbcUtilities.closeStatement(statement);
   JdbcUtilities.closeConnection(connection);
  }
 
  System.out.println("employeeList.size = " + employeeList.size());
  System.out.println("EmployeeDaoImpl.getAllEmployees(name) - exiting");
 
  return employeeList;
 }

 public List<Employee> getAllEmployees(String name)
 throws EmployeeNotFoundException
 {
  System.out.println("EmployeeDaoImpl.getAllEmployees(name) - entering");
 
  String query = "select * from employees where name like \'" + name + "%\'";
  System.out.println("query = " + query);
  
  Connection connection = null;
  Statement statement = null;
  ResultSet resultSet = null;
 
  Employee employee = null;
  List<Employee> employeeList = new ArrayList<Employee>();
  int rows = 0;
  
  try
  {
   connection = JdbcUtilities.getConnection("employees");
   statement = connection.createStatement();
   resultSet = statement.executeQuery(query);
 
   resultSet.last();
   rows = resultSet.getRow();
   resultSet.beforeFirst();
   
   if ( rows == 0 )
	   throw new EmployeeNotFoundException();
   
   while ( resultSet.next())
   {
    employee = new Employee(resultSet.getInt("employee_id"),
      resultSet.getString("name"),
      resultSet.getString("gender"),
      resultSet.getDate("date_of_birth"),
      resultSet.getDate("date_of_joining"),
      resultSet.getInt("dept_no"),
      resultSet.getString("designation_id"),
      resultSet.getInt("manager_id"),
      resultSet.getString("email_id"));
 
    employeeList.add(employee);

   }
  }
  catch(SQLException sqle)
  {
   System.out.println(sqle);
  }
  finally
  {
   JdbcUtilities.closeStatement(statement);
   JdbcUtilities.closeConnection(connection);
  }
 
  System.out.println("employeeList.size = " + employeeList.size());
  System.out.println("EmployeeDaoImpl.getAllEmployees(name) - exiting");
 
  return employeeList;
 }

 public List<Employee> getAllEmployees(int offset, int count)
 {

  System.out.println("EmployeeDaoImpl.getAllEmployees(name) - entering");
 
  String query = "select * from employees order by name limit ?,?";
  
  Connection connection = null;
  PreparedStatement preparedStatement = null;
  ResultSet resultSet = null;
 
  Employee employee = null;
  List<Employee> employeeList = new ArrayList<Employee>();
  
  try
  {
   connection = JdbcUtilities.getConnection("employees");
   preparedStatement = connection.prepareStatement(query);
   preparedStatement.setInt(1,offset);
   preparedStatement.setInt(2, count);
   resultSet = preparedStatement.executeQuery();
 
   while ( resultSet.next())
   {
    employee = new Employee(resultSet.getInt("employee_id"),
      resultSet.getString("name"),
      resultSet.getString("gender"),
      resultSet.getDate("date_of_birth"),
      resultSet.getDate("date_of_joining"),
      resultSet.getInt("dept_no"),
      resultSet.getString("designation_id"),
      resultSet.getInt("manager_id"),
      resultSet.getString("email_id"));
 
    employeeList.add(employee);
   }
  }
  catch(SQLException sqle)
  {
   System.out.println(sqle);
  }
  finally
  {
   JdbcUtilities.closeStatement(preparedStatement);
   JdbcUtilities.closeConnection(connection);
  }
 
  System.out.println("employeeList.size = " + employeeList.size());
  System.out.println("EmployeeDaoImpl.getAllEmployees(offset, couunt) - exiting");
 
  return employeeList;
 }
 
 
 
 public Employee search(int employeeId)
 throws EmployeeNotFoundException
 {
  System.out.println("EmployeeDaoJdbcImpl.getEmployeeByEmployeeId() - entered");
  System.out.println("employeeId = " + employeeId);
 
  String query = "select * from employees where employee_id = ?";
 
  Connection connection = null;
  PreparedStatement preparedStatement = null;
  ResultSet resultSet = null;
 
  Employee employee = null;
 
  try
  {
   connection = JdbcUtilities.getConnection("employees");
   preparedStatement = connection.prepareStatement(query);
   preparedStatement.setInt(1,employeeId);
   resultSet = preparedStatement.executeQuery();
 
   if ( !resultSet.next())
   {
    throw new EmployeeNotFoundException();
   }
   else
   {
    employee = new Employee(resultSet.getInt("employee_id"),
      resultSet.getString("name"),
      resultSet.getString("gender"),
      resultSet.getDate("date_of_birth"),
      resultSet.getDate("date_of_joining"),
      resultSet.getInt("dept_no"),
      resultSet.getString("designation_id"),
      resultSet.getInt("manager_id"),
      resultSet.getString("email_id"));
   }
  }
  catch(SQLException sqle)
  {
   System.out.println(sqle);
  }
  finally
  {
   JdbcUtilities.closeStatement(preparedStatement);
   JdbcUtilities.closeConnection(connection);
  }
  System.out.println("EmployeeDaoJdbcImpl.getEmployeeByEmployeeId() - exiting");
  return employee;
 }

 // Overloaded
 public List<Employee> getEmployeesByGender(String gender)
 {
  System.out.println("EmployeeDaoImpl.getEmployeesByGender() - entering");
  System.out.println("gender = " + gender);
 
  String query = "select * from employees where gender = ?";
 
  Connection connection = null;
  PreparedStatement preparedStatement = null;
  ResultSet resultSet = null;
 
  Employee employee = null;
  List<Employee> employeeList = new ArrayList<Employee>();
 
  try
  {
   connection = JdbcUtilities.getConnection("organization");
   preparedStatement = connection.prepareStatement(query);
   preparedStatement.setString(1,gender);
   resultSet = preparedStatement.executeQuery();
 
   while ( resultSet.next())
   {
    employee = new Employee(resultSet.getInt("employee_id"),
      resultSet.getString("name"),
      resultSet.getString("gender"),
      resultSet.getDate("date_of_birth"),
      resultSet.getDate("date_of_joining"),
      resultSet.getInt("dept_no"),
      resultSet.getString("designation_id"),
      resultSet.getInt("manager_id"),
      resultSet.getString("email_id"));
 
    employeeList.add(employee);
 
   }
  }
  catch(SQLException sqle)
  {
   System.out.println(sqle);
  }
  finally
  {
   JdbcUtilities.closeStatement(preparedStatement);
   JdbcUtilities.closeConnection(connection);
  }
 
  System.out.println("employeeList.size = " + employeeList.size());
  System.out.println("EmployeeDaoImpl.getEmployeesByGender() - exiting");
 
  return employeeList;
 }

 

 // implementation is left as an exercise to the student
 public List<Employee> getEmployeesByDeptNo(int deptNo)
 throws EmployeeNotFoundException
 {
  return null;
 }

 // implementation using create statement
/*
 public List<Employee> getEmployeesByDeptNo(String deptNo[])
 {
	 System.out.println("EmployeeDaoImpl.getEmployeesByDeptNo() ...");

	 Connection connection = null;
	 Statement statement = null;
	 ResultSet resultSet = null;
	 
	 Employee employee = null;
	 List<Employee> employeeList = new ArrayList<Employee>();
	 
	 if ( deptNo != null )
		 for ( String s : deptNo )
			 System.out.println("s = " + s);
	 
	 String sql = "select * from employees where ";
	 boolean flag = false;
	 if ( deptNo != null )
		 for ( String s : deptNo )
			 if ( flag == false )
			 {		 
			    sql = sql + "dept_no = " + s;
	            flag = true;
			 }
			 else
				sql = sql + " or dept_no = " + s; 
	 
	 System.out.println("sql = " + sql);
	 
	  try
	  {
	   connection = JdbcUtilities.getConnection("employees");
	   statement = connection.createStatement();
	   resultSet = statement.executeQuery(sql);
	 
	   while ( resultSet.next())
	   {
	    employee = new Employee(resultSet.getInt("employee_id"),
	      resultSet.getString("name"),
	      resultSet.getString("gender"),
	      resultSet.getDate("date_of_birth"),
	      resultSet.getDate("date_of_joining"),
	      resultSet.getInt("dept_no"),
	      resultSet.getString("designation_id"),
	      resultSet.getInt("manager_id"),
	      resultSet.getString("email_id"));
	 
	    employeeList.add(employee);

	   }
	  }
	  catch(SQLException sqle)
	  {
	   System.out.println(sqle);
	  }
	  finally
	  {
	   JdbcUtilities.closeStatement(statement);
	   JdbcUtilities.closeConnection(connection);
	  }
	 
	 return employeeList;
 }
*/


// Implementation using prepared statement and in clause
 public List<Employee> getEmployeesByDeptNo(String deptNo[])
 {
	 System.out.println("EmployeeDaoImpl.getEmployeesByDeptNo() ...");

	 Connection connection = null;
	 PreparedStatement preparedStatement = null;
	 ResultSet resultSet = null;
	 
	 Employee employee = null;
	 List<Employee> employeeList = new ArrayList<Employee>();
	 
	 
	 String sql = "select * from employees where dept_no in (";
	 
	 boolean flag = false;
	 if ( deptNo != null )
		 for ( String s : deptNo )
			 if ( flag == false )
			 {		 
			    sql = sql + "?";
	            flag = true;
			 }
			 else
				sql = sql + ",?";
	 sql = sql + ")";
	 
	 System.out.println("sql = " + sql);
	 int i = 0;
	 
	  try
	  {
	   connection = JdbcUtilities.getConnection("employees");
	   preparedStatement = connection.prepareStatement(sql);
	   for ( String d : deptNo )
		   preparedStatement.setInt(++i,Integer.parseInt(d));
	   
	   resultSet = preparedStatement.executeQuery();
	 
	   while ( resultSet.next())
	   {
	    employee = new Employee(resultSet.getInt("employee_id"),
	      resultSet.getString("name"),
	      resultSet.getString("gender"),
	      resultSet.getDate("date_of_birth"),
	      resultSet.getDate("date_of_joining"),
	      resultSet.getInt("dept_no"),
	      resultSet.getString("designation_id"),
	      resultSet.getInt("manager_id"),
	      resultSet.getString("email_id"));
	 
	    employeeList.add(employee);

	   }
	  }
	  catch(SQLException sqle)
	  {
	   System.out.println(sqle);
	  }
	  finally
	  {
	   JdbcUtilities.closeStatement(preparedStatement);
	   JdbcUtilities.closeConnection(connection);
	  }
	 
	 System.out.println("size = " + employeeList.size()); 
	 System.out.println("EmployeeDaoImpl.getEmployeesByDeptNo ... exiting"); 
	 return employeeList;
 }

 
 
 
 
 // implementation is left as an exercise to the student
 public void delete(int employeeId)
 throws EmployeeNotFoundException
 {
	 System.out.println("EmployeeDaoImpl.getEmployeesByDeptNo() ...");
	 System.out.println("employeeId = " + employeeId);
	 
	 Connection connection = null;
	 PreparedStatement preparedStatement = null;
	 ResultSet resultSet = null;

	 String query = "delete from employees where employee_id = ?";
	 int rows = 0;
	 
	 try
	 {
		 connection = JdbcUtilities.getConnection("organization");
		 preparedStatement = connection.prepareStatement(query);
		 preparedStatement.setInt(1,employeeId);
		 rows = preparedStatement.executeUpdate();

		 if ( rows == 0 )
			 throw new EmployeeNotFoundException();
	 }
	  catch(SQLException sqle)
	  {
		  System.out.println("EmployeesDaoImpl.delete() : " + sqle);
	  }
	  finally
	  {
		  JdbcUtilities.closeStatement(preparedStatement);
		  JdbcUtilities.closeConnection(connection);
	  }
 }

 // implementation is left as an exercise to the student
 public void update(int employeeNo, String name)
 throws EmployeeNotFoundException
 {
 
 }

 	// implementation is left as an exercise to the student
 	public List<Employee> getEmployeesByDateOfBirth(java.sql.Date fromDate, java.sql.Date toDate)
 			throws EmployeeNotFoundException
 	{
 		System.out.println("Inside impl " + fromDate + " " + toDate);
 		
 		
 		Connection connection = null;
 		PreparedStatement preparedStatement = null;
 		ResultSet resultSet = null;
 		
 		Employee employee = null;
 		List<Employee> employeeList = null;
 		
 		String sql = "select * from employees where date_of_birth > ? and date_of_birth < ? order by date_of_birth";
 		
 		try
 		{
 			connection = JdbcUtilities.getConnection("organization");
 			preparedStatement = connection.prepareStatement(sql);
 			preparedStatement.setDate(1,fromDate);
 			preparedStatement.setDate(2,toDate);
 			
 			resultSet = preparedStatement.executeQuery();
 			
 			if ( !resultSet.next() )
 			{	
 				throw new EmployeeNotFoundException();
 			}
 				
 			resultSet.first();
 			employeeList = new ArrayList<Employee>();
 			
 			while ( resultSet.next() )
 			{
 			    employee = new Employee(resultSet.getInt("employee_id"),
 			 	      resultSet.getString("name"),
 			 	      resultSet.getString("gender"),
 			 	      resultSet.getDate("date_of_birth"),
 			 	      resultSet.getDate("date_of_joining"),
 			 	      resultSet.getInt("dept_no"),
 			 	      resultSet.getString("designation_id"),
 			 	      resultSet.getInt("manager_id"),
 			 	      resultSet.getString("email_id"));
 			 	 
 			 	    employeeList.add(employee);
 			}
 		}
 		catch(SQLException sqle)
 		{
 			System.out.println(sqle);
 		}
 		
 		System.out.println("Size = " + employeeList.size());
 		return employeeList;
 	}

 // implementation is left as an exercise to the student 
 public List<Employee> getRetiringEmployeesAt60Years(String monthYear)
 throws EmployeeNotFoundException
 {
  return null;
 }
}

