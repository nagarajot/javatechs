package in.codersclub.javatechs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeInsert
{
    public static void main(String args[])
    {
         Connection connection = null;  
         PreparedStatement preparedStatement = null;
              
         String driver = "org.gjt.mm.mysql.Driver"; 
         String url = "jdbc:mysql://localhost:3306/cc"; 
         String username = "root"; 
         String password = ""; 

         String sql = "insert into employees values(?,?,?,?,?)";
         
         int employeeId = 0;
         String name = null;
         String gender = null;
         int salary = 0;
         String emailId = null;
         
         
         Scanner scanner = new Scanner(System.in);

         System.out.println("Employee Id     : ");
         employeeId = scanner.nextInt();
         
         System.out.println("Name            : ");
         name = scanner.next();
         
         System.out.println("Gender          : ");
         gender = scanner.next();
         
         System.out.println("Salary          : ");
         salary = scanner.nextInt();
         
         System.out.println("Email Id        : ");
         emailId = scanner.next();
         
         scanner.close();
         
         try 
         { 
              Class.forName(driver); 
              connection = DriverManager.getConnection(url,username,password); 
              
              preparedStatement = connection.prepareStatement(sql);
              
              preparedStatement.setInt(1, employeeId);
              preparedStatement.setString(2, name);
              preparedStatement.setString(3, gender);
              preparedStatement.setInt(4, salary);
              preparedStatement.setString(5, emailId);
              
              int rows = preparedStatement.executeUpdate();
              
              if ( rows == 1 )
                  System.out.println("Insert Success ...");
              else
                  System.out.println("Insert failure ...");
              
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



