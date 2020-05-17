package in.codersclub.javatechs.storedprocedures;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class DoubleNumber
{
	public static void main(String args[])
	{
	    int n = 0; 
		
	     Scanner scanner = new Scanner(System.in);
	     System.out.println("n = ");
	     n = scanner.nextInt();
	     scanner.close();
	
	     Connection connection = null;
	     CallableStatement callableStatement = null;
	     
		 String driver = "org.gjt.mm.mysql.Driver";
		 String url = "jdbc:mysql://localhost:3306/school";
		 String username = "root";
		 String password = "";
	     
	     try
	     {
             Class.forName(driver); 
             connection = DriverManager.getConnection(url,username,password); 
             
             callableStatement = connection.prepareCall("{call DoubleNumber(?)}");
             callableStatement.registerOutParameter(1, Types.INTEGER);
             callableStatement.setInt(1,n);
             callableStatement.execute();
             
             int m = callableStatement.getInt(1);
             System.out.println("m = " + m);
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


