package in.codersclub.javatechs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeesCount
{
    public static void main(String args[])
    {
        System.out.println("No of rows = " + count1());
        System.out.println("No of rows = " + count2());
    }
    
    private static int count1()
    {
        int rows = 0;
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        String driver = "org.gjt.mm.mysql.Driver"; 
        String url = "jdbc:mysql://localhost:3306/cc"; 
        String username = "root"; 
        String password = ""; 

        String sql = "select count(*) from employees";
        
        try 
        { 
             Class.forName(driver); 
             connection = DriverManager.getConnection(url,username,password); 
             statement = connection.createStatement();
             resultSet = statement.executeQuery(sql);
             
             if ( resultSet.next() )
                 rows = resultSet.getInt(1);
             
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
        return rows;
    }

    private static int count2()
    {
        int rows = 0;
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        String driver = "org.gjt.mm.mysql.Driver"; 
        String url = "jdbc:mysql://localhost:3306/cc"; 
        String username = "root"; 
        String password = ""; 

        String sql = "select * from employees";
        
        try 
        { 
             Class.forName(driver); 
             connection = DriverManager.getConnection(url,username,password); 
             statement = connection.createStatement();
             resultSet = statement.executeQuery(sql);
             
             resultSet.last();
             rows = resultSet.getRow();

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
        return rows;
    }
}

