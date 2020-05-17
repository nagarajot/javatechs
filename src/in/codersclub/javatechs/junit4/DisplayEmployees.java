package in.codersclub.j2eedemo.junit4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayEmployees
{
	public static void main(String args[])
	{
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
        String driver = "org.gjt.mm.mysql.Driver"; 
        String url = "jdbc:mysql://localhost:3306/organization"; 
        String username = "root"; 
        String password = ""; 

        String sql = "select * from employees";
        
        try 
        { 
             Class.forName(driver); 
             connection = DriverManager.getConnection(url,username,password); 
             statement = connection.createStatement();
             resultSet = statement.executeQuery(sql);
             
             while ( resultSet.next() )
             {
            	 System.out.println(resultSet.getInt("employee_no") + " " + resultSet.getString("name"));
             }
             
             statement.close();
             connection.close();
        } 
        catch(ClassNotFoundException cnfe) 
        { 
             System.out.println("JdbcUtilities.getConnection : " + cnfe); 
        } 
        catch(SQLException sqle) 
        { 
             System.out.println("JdbcUtilities.getConnection : " + sqle); 
        } 
	}
}



