package in.codersclub.javatechs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TeacherUpdate
{
    public static void main(String args[])
    {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        String driver = "org.gjt.mm.mysql.Driver"; 
        String url = "jdbc:mysql://localhost:3306/school"; 
        String username = "root"; 
        String password = ""; 

        String sql = "update teachers set email = ? where id = ?";
        
        int id = 0;
        String email = null;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("id : ");
        id = scanner.nextInt();
        
        System.out.println("email : ");
        email = scanner.next();
        scanner.close();
        
        try 
        { 
             Class.forName(driver); 
             connection = DriverManager.getConnection(url,username,password); 
             
             preparedStatement = connection.prepareStatement(sql);
             preparedStatement.setString(1,email);
             preparedStatement.setInt(2, id);
             
             int n = preparedStatement.executeUpdate();

             if ( n == 1 )
                 System.out.println("Update successful ...");
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


