package in.codersclub.javatechs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckConnection
{
    public static void main(String args[])
    {
        String driver = "org.gjt.mm.mysql.Driver";
        String url = "jdbc:mysql://localhost:3306/cc";
        String username = "root";
        String password = "";
        
        Connection connection = null;
        
        try
        {
            Class.forName(driver);
            connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connection successful ...");
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


