package in.codersclub.javatechs.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.codersclub.javatechs.dao.UserDao;
import in.codersclub.javatechs.dom.User;
import in.codersclub.javatechs.exceptions.UserNotFoundException;
import in.codersclub.javatechs.utils.JdbcUtilities;

public class UserDaoImpl implements UserDao
{

	@Override
	public void validate(User user) throws UserNotFoundException {
		
		System.out.println("UserDaoImpl.validate() ...");
		
		String username = user.getUsername();
		String password = user.getPassword();
		
		String sql = "select * from users where username = ? and password = ?";
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try
		{
			connection = JdbcUtilities.getConnection("organization");
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			
			resultSet = preparedStatement.executeQuery();
		
			if ( !resultSet.next())
				throw new UserNotFoundException();
		}
		catch(SQLException sqle)
		{
			
		}
		finally
		{
			JdbcUtilities.closeStatement(preparedStatement);
			JdbcUtilities.closeConnection(connection);
		}
	}
}