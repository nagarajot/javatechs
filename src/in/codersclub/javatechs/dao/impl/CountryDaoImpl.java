package in.codersclub.javatechs.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import in.codersclub.javatechs.dao.CountryDao;
import in.codersclub.javatechs.dom.Country;
import in.codersclub.javatechs.exceptions.CountryNotFoundException;
import in.codersclub.javatechs.exceptions.ProcessingException;
import in.codersclub.javatechs.utils.JdbcUtilities;

import java.util.ArrayList;


public class CountryDaoImpl implements CountryDao
{
	public Country search(String code)
	throws CountryNotFoundException
	{
		System.out.println("CountryDaoImpl.search() ... entered");
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		Country country = null;
		
		String sql = "select * from countries where code = ?";
		
		try
		{
			connection = JdbcUtilities.getConnection("geography");
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,code);
			resultSet = preparedStatement.executeQuery();
			
			if ( !resultSet.next())
				throw new CountryNotFoundException();
			
			country = new Country(
					resultSet.getString("code"),
					resultSet.getString("name"),
					resultSet.getString("continent_code"),
					resultSet.getString("capital"),
					resultSet.getInt("area"),
					resultSet.getInt("population"),
					resultSet.getString("island"),
					resultSet.getString("harbour"));
		}
		catch(SQLException sqle)
		{
			System.out.println("CountryDaoImpl.search() : " + sqle);
		}
		finally
		{
			JdbcUtilities.closeStatement(preparedStatement);
			JdbcUtilities.closeConnection(connection);
		}
		return country;
	}

	public List<Country> getAllCountries()
	{
		System.out.println("CountryDaoImpl.getAllCountries() ... entered");

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		Country country = null;
		List<Country> countryList = new ArrayList<Country>();
		
		String sql = "select * from countries";
		
		try
		{
			connection = JdbcUtilities.getConnection("geography");
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			
			while ( resultSet.next())
			{
				country = new Country(
					resultSet.getString("code"),
					resultSet.getString("name"),
					resultSet.getString("continent_code"),
					resultSet.getString("capital"),
					resultSet.getInt("area"),
					resultSet.getInt("population"),
					resultSet.getString("island"),
					resultSet.getString("harbour"));
				
				countryList.add(country);
			}	
		}
		catch(SQLException sqle)
		{
			System.out.println("CountryDaoImpl.getAllCountries() : " + sqle);
		}
		finally
		{
			JdbcUtilities.closeStatement(statement);
			JdbcUtilities.closeConnection(connection);
		}
		System.out.println("No of rows : " + countryList.size());
		return countryList;
	}
	
    public List<Country> getAllCountries(String startingChars)
    throws CountryNotFoundException
    {
		System.out.println("CountryDaoImpl.getAllCountries(String startingChars) ... entered");
    	
    	Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		int rows = 0;
		Country country = null;
		List<Country> countryList = new ArrayList<Country>();
		
		String sql = "select * from countries where name like \'" + startingChars + "%\'";
		System.out.println(sql);
		
		try
		{
			connection = JdbcUtilities.getConnection("geography");
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
	
		   resultSet.last();
		   rows = resultSet.getRow();
		   resultSet.beforeFirst();
			   
		   if ( rows == 0 )
			   throw new CountryNotFoundException();

			while ( resultSet.next())
			{
				country = new Country(
					resultSet.getString("code"),
					resultSet.getString("name"),
					resultSet.getString("continent_code"),
					resultSet.getString("capital"),
					resultSet.getInt("area"),
					resultSet.getInt("population"),
					resultSet.getString("island"),
					resultSet.getString("harbour"));
				
				countryList.add(country);
			}	
		}
		catch(SQLException sqle)
		{
			System.out.println("CountryDaoImpl.getAllCountries(String startingChars) : " + sqle);
		}
		finally
		{
			JdbcUtilities.closeStatement(statement);
			JdbcUtilities.closeConnection(connection);
		}
		return countryList;
    }

    public List<Country> getCountriesOfContinent(String continentCode)
    {
		System.out.println("CountryDaoImpl.getCountriesByContinent() ... entered");
		System.out.println("continentCode = " + continentCode);
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		Country country = null;
		List<Country> countryList = new ArrayList<Country>();
		
		String sql = "select * from countries where continent_code = ?";
		
		try
		{
			connection = JdbcUtilities.getConnection("geography");
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,continentCode);
			resultSet = preparedStatement.executeQuery();
			
			while ( resultSet.next())
			{	
				country = new Country(
					resultSet.getString("code"),
					resultSet.getString("name"),
					resultSet.getString("continent_code"),
					resultSet.getString("capital"),
					resultSet.getInt("area"),
					resultSet.getInt("population"),
					resultSet.getString("island"),
					resultSet.getString("harbour"));
				countryList.add(country);
			}	
		}
		catch(SQLException sqle)
		{
			System.out.println("CountryDaoImpl.getCountriesByContinent() : " + sqle);
		}
		finally
		{
			JdbcUtilities.closeStatement(preparedStatement);
			JdbcUtilities.closeConnection(connection);
		}
		System.out.println("CountryDaoImpl.getCountriesByContinent() size = " + countryList.size()); 
		return countryList;
    }

    public int getCount()
    {
    	int count = 0;
    	
    	System.out.println("CountryDaoImpl.getCount() ... entered");

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		Country country = null;
		List<Country> countryList = new ArrayList<Country>();
		
		String sql = "select count(*) from countries";
		
		try
		{
			connection = JdbcUtilities.getConnection("geography");
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			
			if ( !resultSet.next())
				count = 0;
			else
				count = resultSet.getInt(1);
		}
		catch(SQLException sqle)
		{
			System.out.println("CountryDaoImpl.getCount() : " + sqle);
		}
		finally
		{
			JdbcUtilities.closeStatement(statement);
			JdbcUtilities.closeConnection(connection);
		}
		return count;
    }

    public void insert(Country country) throws ProcessingException
    {
		System.out.println("CountryDaoImpl.insert() ... entered");
		
		int n = 0;
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		List<Country> countryList = new ArrayList<Country>();
		
		String sql = "insert into countries values(?,?,?,?,?,?,?,?)";
		
		try
		{
			connection = JdbcUtilities.getConnection("geography");
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,country.getCode());
			preparedStatement.setString(2,country.getName());
			preparedStatement.setString(3,country.getContinentCode());
			preparedStatement.setString(4,country.getCapital());
			preparedStatement.setLong(5,country.getArea());
			preparedStatement.setLong(6,country.getPopulation());
			preparedStatement.setString(7,country.getIsland());
			preparedStatement.setString(8,country.getHarbour());
			
			n = preparedStatement.executeUpdate();
		}
		catch(SQLException sqle)
		{
			throw new ProcessingException(sqle.toString());
		}
		finally
		{
			JdbcUtilities.closeStatement(preparedStatement);
			JdbcUtilities.closeConnection(connection);
		}
		System.out.println("CountryDaoImpl.insert() : size = " + n );
    }
}    




