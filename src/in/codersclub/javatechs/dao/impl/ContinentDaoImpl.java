package in.codersclub.javatechs.dao.impl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import in.codersclub.javatechs.dao.ContinentDao;
import in.codersclub.javatechs.dom.Continent;
import in.codersclub.javatechs.exceptions.ContinentNotFoundException;
import in.codersclub.javatechs.utils.JdbcUtilities;


public class ContinentDaoImpl implements ContinentDao
{
	public Continent search(String continentCode)
	throws ContinentNotFoundException
	{
		System.out.println("ContinentDaoImpl.search() ... entered");
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		Continent continent = null;
		
		String sql = "select * from continents where continent_code = ?";
		
		try
		{
			connection = JdbcUtilities.getConnection("countries");
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,continentCode);
			resultSet = preparedStatement.executeQuery();
			
			if ( !resultSet.next())
				throw new ContinentNotFoundException();
			
			continent = new Continent(
					resultSet.getString("continent_code"),
					resultSet.getString("name"));
		}
		catch(SQLException sqle)
		{
			System.out.println("ContinentDaoImpl.search() : " + sqle);
		}
		finally
		{
			JdbcUtilities.closeStatement(preparedStatement);
			JdbcUtilities.closeConnection(connection);
		}
		return continent;
	}
	
	public List<Continent> getAllContinents()
	{
		System.out.println("ContinentDaoImpl.getAllContinents() ... entered");

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		Continent continent = null;
		List<Continent> continentList = new ArrayList<Continent>();
		
		String sql = "select * from continents";
		
		try
		{
			connection = JdbcUtilities.getConnection("countries");
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			
			while ( resultSet.next())
			{
				continent = new Continent(
					resultSet.getString("continent_code"),
					resultSet.getString("name"));
				
				continentList.add(continent);
			}	
		}
		catch(SQLException sqle)
		{
			System.out.println("ContinentDaoImpl.getAllCountries() : " + sqle);
		}
		finally
		{
			JdbcUtilities.closeStatement(statement);
			JdbcUtilities.closeConnection(connection);
		}
		return continentList;
	}
}




