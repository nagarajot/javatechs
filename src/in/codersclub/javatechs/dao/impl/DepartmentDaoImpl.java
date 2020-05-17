package in.codersclub.javatechs.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import in.codersclub.javatechs.dao.DepartmentDao;
import in.codersclub.javatechs.dom.Department;
import in.codersclub.javatechs.exceptions.DepartmentNotFoundException;
import in.codersclub.javatechs.utils.JdbcUtilities;


public class DepartmentDaoImpl implements DepartmentDao
{
	public Department search(int deptNo)
	throws DepartmentNotFoundException
	{
		System.out.println("DepartmentDaoImpl.search() ... entered");
		String query = "select * from departments where dept_no = ?";
		
		Department department = null;
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try
		{
			connection = JdbcUtilities.getConnection("employees");
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, deptNo);
			resultSet = preparedStatement.executeQuery();
			
			if ( !resultSet.next() )
				throw new DepartmentNotFoundException();
		
			department = new Department(
					resultSet.getInt("dept_no"),
					resultSet.getString("name"));
		}
		catch(SQLException sqle)
		{
			System.out.println("DepartmentDaoImpl.search() ...");
		}
		System.out.println("DepartmentDaoImpl.search() ... exiting");
		return department;
	}
	
	public List<Department> getAllDepartments()
	{
		System.out.println("DepartmentDaoImpl.getAllDepartments() ... entered");
		String query = "select * from departments order by dept_no";
		
		Department department = null;
		List<Department> departmentList = new ArrayList<Department>();
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try
		{
			connection = JdbcUtilities.getConnection("employees");
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
			
			while ( resultSet.next() )
			{
				department = new Department(
					resultSet.getInt("dept_no"),
					resultSet.getString("name"));
				departmentList.add(department);
			}
		}
		catch(SQLException sqle)
		{
			System.out.println("DepartmentDaoImpl.getAllDepartments() : " + sqle);
		}
		System.out.println("size = " + departmentList.size());
		System.out.println("DepartmentDaoImpl.getAllDepartments() ... exiting");
		return departmentList;
	}
}



