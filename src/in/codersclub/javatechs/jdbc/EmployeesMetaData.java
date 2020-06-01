package in.codersclub.javatechs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeesMetaData
{
    public static void main(String args[])
    {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        ResultSetMetaData resultSetMetaData = null;
        
        String driver = "org.gjt.mm.mysql.Driver"; 
        String url = "jdbc:mysql://localhost:3306/cc"; 
        String username = "root"; 
        String password = ""; 

        String sql = "select * from employees";
        int n = 0;
        
        try 
        { 
             Class.forName(driver); 
             connection = DriverManager.getConnection(url,username,password); 
             
             statement = connection.createStatement();
             resultSet = statement.executeQuery(sql);
             
             resultSetMetaData = resultSet.getMetaData();
             
             n = resultSetMetaData.getColumnCount();
             System.out.println("No of columns : " + n);
             
             for ( int i = 1; i <= n; i++ )
                 System.out.println(resultSetMetaData.getColumnName(i) + " " + resultSetMetaData.getColumnTypeName(i) + " " + resultSetMetaData.getColumnDisplaySize(i));
             
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


