package in.codersclub.javatechs.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.codersclub.javatechs.dao.DistrictDao;
import in.codersclub.javatechs.dom.Country;
import in.codersclub.javatechs.dom.District;
import in.codersclub.javatechs.exceptions.CountryNotFoundException;
import in.codersclub.javatechs.utils.JdbcUtilities;

public class DistrictDaoImpl implements DistrictDao
{

	@Override
	public List<District> getDistrictsByState(String stateCode) {
		  System.out.println("DistrictDaoImpl.getDistrictsByState() - entering");
		  System.out.println("stateCode = " + stateCode);
		 
		  String query = "select * from districts where state_code = ?";
		 
		  Connection connection = null;
		  PreparedStatement preparedStatement = null;
		  ResultSet resultSet = null;
		 
		  District district = null;
		  List<District> districtList = new ArrayList<District>();
		 
		  try
		  {
			  connection = JdbcUtilities.getConnection("india");
			  preparedStatement = connection.prepareStatement(query);
			  preparedStatement.setString(1,stateCode);
			  resultSet = preparedStatement.executeQuery();
		 
			  while ( resultSet.next())
			  {
				  district = new District(resultSet.getString("district_code"),
					   resultSet.getString("name"),
					   resultSet.getString("head_quarters"),
					   resultSet.getString("state_code"),
					   resultSet.getInt("area"),
					   resultSet.getInt("population"),
					   resultSet.getInt("no_of_taluks"));
		 
				  districtList.add(district);
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
		 
		  System.out.println("disrictList.size = " + districtList.size());
		  System.out.println("DistrictDaoImpl.getDistrictByState() - exiting");
		 
		  return districtList;
	}
	
	public District search(String districtCode)
	{
		System.out.println("DistrictDaoImpl.search() ... entered");
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		District district = null;
		
		String sql = "select * from districts where district_code = ?";
		
		try
		{
			connection = JdbcUtilities.getConnection("india");
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,districtCode);
			resultSet = preparedStatement.executeQuery();
			
	
			if ( resultSet.next())
				district = new District(
					resultSet.getString("district_code"),
					resultSet.getString("name"),
					resultSet.getString("head_quarters"),
					resultSet.getString("state_code"),
					resultSet.getInt("area"),
					resultSet.getInt("population"),
					resultSet.getInt("no_of_taluks"));
		}
		catch(SQLException sqle)
		{
			System.out.println("DistrictDaoImpl.search() : " + sqle);
		}
		finally
		{
			JdbcUtilities.closeStatement(preparedStatement);
			JdbcUtilities.closeConnection(connection);
		}
		return district;

	}
	
}




