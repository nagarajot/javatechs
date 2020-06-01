package in.codersclub.javatechs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeSearch
{
    public static void main(String args[])
    {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
        String driver = "org.gjt.mm.mysql.Driver"; 
        String url = "jdbc:mysql://localhost:3306/cc"; 
        String username = "root"; 
        String password = ""; 

        String sql = "select * from employees where employee_id = ?";
        Scanner scanner = new Scanner(System.in);
        
        int employeeId = 0;
        System.out.println("employeeId = ");
        employeeId = scanner.nextInt();
        scanner.close();

        try 
        { 
             Class.forName(driver); 
             connection = DriverManager.getConnection(url,username,password); 
             
             preparedStatement = connection.prepareStatement(sql);
             preparedStatement.setInt(1,employeeId);
             
             resultSet = preparedStatement.executeQuery();

             if ( resultSet.next())
             {
                 System.out.println(resultSet.getInt("employee_id") + " " + resultSet.getString("name") + " " + resultSet.getString("gender") + " " + resultSet.getInt("salary")+ " " + resultSet.getString("email_id"));
             }
             else
                 System.out.println("Not found ...");
             
             preparedStatement.close();
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

