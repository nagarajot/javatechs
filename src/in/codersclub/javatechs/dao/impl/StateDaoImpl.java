package in.codersclub.javatechs.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import in.codersclub.javatechs.dao.StateDao;
import in.codersclub.javatechs.dom.State;
import in.codersclub.javatechs.utils.JdbcUtilities;

public class StateDaoImpl implements StateDao
{

	@Override
	public List<State> getAllStates() {
		  System.out.println("StateDaoJdbcImpl.getAllStates() - entering");
		  
		  String query = "select * from states";
		 
		  Connection connection = null;
		  Statement statement = null;
		  ResultSet resultSet = null;
		 
		  State state = null;
		  List<State> statesList = new ArrayList<State>();
		 
		  try
		  {
		   connection = JdbcUtilities.getConnection("india");
		   statement = connection.createStatement();
		   resultSet = statement.executeQuery(query);
		 
		   while ( resultSet.next())
		   {
			   state = new State(resultSet.getString("state_code"),
					   resultSet.getString("name"),
					   resultSet.getString("capital"),
					   resultSet.getString("state_or_ut"),
					   resultSet.getInt("population"));
			   statesList.add(state);
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
		 
		  System.out.println("statesList.size = " + statesList.size());
		  System.out.println("StateDaoImpl.getAllStates() - exiting");
		 
		  return statesList;
	}
	
}




