package in.codersclub.javatechs.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import in.codersclub.javatechs.dao.DesignationDao;
import in.codersclub.javatechs.dom.Designation;
import in.codersclub.javatechs.exceptions.DesignationNotFoundException;
import in.codersclub.javatechs.utils.JdbcUtilities;

public class DesignationDaoImpl implements DesignationDao
{
	public Designation search(String designationId)
	throws DesignationNotFoundException
	{
		System.out.println("DesignationDaoImpl.search() ... entered");
		System.out.println("designationId = " + designationId);
		
		String query = "select * from designations where designation_id = ?";
		
		Designation designation = null;
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try
		{
			connection = JdbcUtilities.getConnection("employees");
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, designationId);
			resultSet = preparedStatement.executeQuery();
			
			if ( !resultSet.next() )
				throw new DesignationNotFoundException();
		
			designation = new Designation(
					resultSet.getString("designation_id"),
					resultSet.getString("name"));
		}
		catch(SQLException sqle)
		{
			System.out.println("DesignationDaoImpl.search() : " + sqle);
		}
		System.out.println("DesignationDaoImpl.search() ... exiting");
		return designation;
	}

	public List<Designation> getAllDesignations()
	{
		System.out.println("DesignationDaoImpl.getAllDesignations() ... entered");
		String query = "select * from designations order by designation_id";
		
		Designation designation = null;
		List<Designation> designationList = new ArrayList<Designation>();
		
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
				designation = new Designation(
					resultSet.getString("designation_id"),
					resultSet.getString("name"));
				designationList.add(designation);
			}
		}
		catch(SQLException sqle)
		{
			System.out.println("DesignationDaoImpl.getAllDesignations() : " + sqle);
		}
		System.out.println("size = " + designationList.size());
		System.out.println("DesignationDaoImpl.getAllDesignations() ... exiting");
		return designationList;
	}
}



