package in.codersclub.javatechs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeesSort
{
    public static void main(String args[])
    {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        String driver = "org.gjt.mm.mysql.Driver"; 
        String url = "jdbc:mysql://localhost:3306/cc"; 
        String username = "root"; 
        String password = ""; 

        String sql = "select * from employees order by employee_id";
        
        try 
        { 
             Class.forName(driver); 
             connection = DriverManager.getConnection(url,username,password); 
             
             statement = connection.createStatement();
             resultSet = statement.executeQuery(sql);
             
             while ( resultSet.next())
             {
                 System.out.println(resultSet.getInt("employee_id") + " " + resultSet.getString("name"));
             }

             statement.close();
             connection.close();
        } 
        catch(ClassNotFoundException cnfe) 
        { 
             System.out.println(cnfe); 
        } 
        catch(SQLException sqle) 
        { 
             System.out.println(sqle); 
        }        
    }
}

