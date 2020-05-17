package in.codersclub.javatechs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TeacherInsert
{
    public static void main(String args[])
    {
         Connection connection = null;  
         PreparedStatement preparedStatement = null;
         ResultSet resultSet = null;
              
         String driver = "org.gjt.mm.mysql.Driver"; 
         String url = "jdbc:mysql://localhost:3306/school"; 
         String username = "root"; 
         String password = ""; 

         String sql = "insert into teachers values(?,?,?,?,?,?,?,?,?,?)";
         
         int id = 0;
         String name = null;
         String gender = null;
         String qualification = null;
         
         String strDateOfBirth = null;
         java.sql.Date dateOfBirth = null;
         
         String strDateOfJoining = null;
         java.sql.Date dateOfJoining = null;
     
         String aadharCardNo = null;
         String panCardNo = null;
         String mobileNo = null;
         String email = null;
         
         Scanner scanner = new Scanner(System.in);

         System.out.println("Id              : ");
         id = scanner.nextInt();
         
         System.out.println("Name            : ");
         name = scanner.next();
         
         System.out.println("Gender          : ");
         gender = scanner.next();
         
         System.out.println("Qualification   : ");
         qualification = scanner.next();
         
         System.out.println("Date of birth   : ");
         strDateOfBirth = scanner.next();
         dateOfBirth = java.sql.Date.valueOf(strDateOfBirth);
         
         System.out.println("Date of joining : ");
         strDateOfJoining = scanner.next();
         dateOfJoining = java.sql.Date.valueOf(strDateOfJoining);

         System.out.println("Aadhar Card No  : ");
         aadharCardNo = scanner.next();
         
         System.out.println("PAN Card No     : ");
         panCardNo = scanner.next();

         System.out.println("Mobile No       : ");
         mobileNo = scanner.next();

         System.out.println("Email           : ");
         email = scanner.next();
         scanner.close();

         
         try 
         { 
              Class.forName(driver); 
              connection = DriverManager.getConnection(url,username,password); 
              
              preparedStatement = connection.prepareStatement(sql);
              
              preparedStatement.setInt(1, id);
              preparedStatement.setString(2, name);
              preparedStatement.setString(3, gender);
              preparedStatement.setString(4, qualification);
              
              preparedStatement.setDate(5, dateOfBirth);
              preparedStatement.setDate(6, dateOfJoining);
              
              preparedStatement.setString(7, aadharCardNo);
              preparedStatement.setString(8, panCardNo);
              preparedStatement.setString(9, mobileNo);
              preparedStatement.setString(10, email);
              
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



