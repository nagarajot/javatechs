package in.codersclub.javatechs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TeacherSearch
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

        String sql = "select * from teachers where id = ?";
        Scanner scanner = new Scanner(System.in);
        
        int id = 0;
        System.out.println("Id = ");
        id = scanner.nextInt();
        scanner.close();

        try 
        { 
             Class.forName(driver); 
             connection = DriverManager.getConnection(url,username,password); 
             
             preparedStatement = connection.prepareStatement(sql);
             preparedStatement.setInt(1,id);
             
             resultSet = preparedStatement.executeQuery();

             if ( resultSet.next())
             {
                 System.out.println(resultSet.getInt("id") + " " + resultSet.getString("name") + " " + resultSet.getDate("date_of_birth"));
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

