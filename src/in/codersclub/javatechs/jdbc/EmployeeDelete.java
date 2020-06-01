package in.codersclub.javatechs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeDelete
{
    public static void main(String args[])
    {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        String driver = "org.gjt.mm.mysql.Driver"; 
        String url = "jdbc:mysql://localhost:3306/cc"; 
        String username = "root"; 
        String password = ""; 

        String sql = "delete from employees where employee_id = ?";
        
        int employeeId = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("employeeId : ");
        employeeId = scanner.nextInt();
        scanner.close();
        
        try 
        { 
             Class.forName(driver); 
             connection = DriverManager.getConnection(url,username,password); 
             
             preparedStatement = connection.prepareStatement(sql);
             preparedStatement.setInt(1,employeeId);
             
             int n = preparedStatement.executeUpdate();

             if ( n == 1 )
                 System.out.println("Delete successful ...");
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


