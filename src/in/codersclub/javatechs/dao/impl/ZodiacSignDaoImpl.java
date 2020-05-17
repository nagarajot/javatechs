package in.codersclub.javatechs.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import in.codersclub.javatechs.dao.ZodiacSignDao;
import in.codersclub.javatechs.dom.ZodiacSign;
import in.codersclub.javatechs.utils.JdbcUtilities;

public class ZodiacSignDaoImpl implements ZodiacSignDao
{

	@Override
	public List<ZodiacSign> getAllZodiacSigns() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ZodiacSign getZodiacSign(String date, String month) 
	{
		String d = "2008" + "-" + month + "-" + date;

		System.out.println("d = " + d);
		java.sql.Date birthDate = java.sql.Date.valueOf(d);
		System.out.println("birthDate = " + birthDate);
		
		String sql = "select * from zodiac_signs where start_date < ? and end_date > ?";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
	
		ZodiacSign zodiacSign = null;
		
		try
		{
			connection = JdbcUtilities.getConnection("zodiac_signs");
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setDate(1, birthDate);
			preparedStatement.setDate(2, birthDate);
			
			resultSet = preparedStatement.executeQuery();
			
			if ( resultSet.next())
			{
				zodiacSign = new ZodiacSign(resultSet.getString("zodiac_sign"),
						resultSet.getDate("start_date"),
						resultSet.getDate("end_date"));
			}
		}
		catch(SQLException sqle)
		{
			System.out.println("ZodiacSignDaoImpl.getZodiacSign() : " + sqle);
		}
		return zodiacSign;
	}
}




