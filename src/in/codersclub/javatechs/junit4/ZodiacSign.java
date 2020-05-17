package in.codersclub.j2eedemo.junit4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class ZodiacSign
{
	public static String findZodiacSign(int day, int month)
	{
		String result = null;
		
		String date = null;
		
		date = 2008 + "-" + month + "-" + day;
		String sql = "select * from zodiac_signs where ? >= start_date and ? <= end_date";	
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
	    String driver = "org.gjt.mm.mysql.Driver"; 
	    String url = "jdbc:mysql://localhost:3306/zodiac_signs"; 
	    String username = "root"; 
	    String password = ""; 
		
		try
		{
            Class.forName(driver); 
            connection = DriverManager.getConnection(url,username,password); 
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, date);
			preparedStatement.setString(2, date);
			resultSet = preparedStatement.executeQuery();
			
			if ( resultSet.next())
				result = resultSet.getString("zodiac_sign");
			
			preparedStatement.close();
			connection.close();
		}
		catch(SQLException sqle)
		{
			System.out.println(sqle);
		}
		catch(ClassNotFoundException cnfe)
		{
			System.out.println(cnfe);
		}
		return result;
	}
}


