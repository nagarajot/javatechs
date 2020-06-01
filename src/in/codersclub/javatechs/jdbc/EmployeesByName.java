package in.codersclub.javatechs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeesByName
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

        Scanner scanner = new Scanner(System.in);
        String name = "";
        System.out.println("Enter starting chars of name : ");
        name = scanner.next();
        scanner.close();
        
        String sql = "select * from employees where name like \'" + name + "%\'";
        System.out.println(sql);
        
        try 
        { 
             Class.forName(driver); 
             connection = DriverManager.getConnection(url,username,password); 
             
             statement = connection.createStatement();
             resultSet = statement.executeQuery(sql);

             while ( resultSet.next())
             {
                 System.out.println(resultSet.getInt("employee_id") + " " + resultSet.getString("name") + " " + resultSet.getString("gender") + " " + resultSet.getInt("salary") + " " + resultSet.getString("email_id"));
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



