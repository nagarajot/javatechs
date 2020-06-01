package in.codersclub.javatechs.jdbc;

import java.sql.Connection;

import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CcMetaData 
{  
	public static void main(String args[])
	{
		Connection connection = null;
		DatabaseMetaData databaseMetaData = null;
		ResultSet resultSet = null;
		
        String driver = "org.gjt.mm.mysql.Driver"; 
        String url = "jdbc:mysql://localhost:3306/cc"; 
        String username = "root"; 
        String password = ""; 
		
		try
		{  
			Class.forName(driver);  
 			connection = DriverManager.getConnection(url, username, password); 

 			databaseMetaData = connection.getMetaData();  
  
			System.out.println("Driver Name: "+databaseMetaData.getDriverName());  
			System.out.println("Driver Version: "+databaseMetaData.getDriverVersion());  
			System.out.println("UserName: "+databaseMetaData.getUserName());  
			System.out.println("Database Product Name: "+databaseMetaData.getDatabaseProductName());  
			System.out.println("Database Product Version: "+databaseMetaData.getDatabaseProductVersion());  
  
			
			String tables[]={"TABLE"};  
			resultSet = databaseMetaData.getTables(null,null,null,tables);  
			
			System.out.println("List of tables ...");
			while ( resultSet.next())  
				System.out.println(resultSet.getString(3));  
			 
			String views[] = {"VIEW"};  
			resultSet = databaseMetaData.getTables(null,null,null,views);  
			
			System.out.println("List of views ...");
			while ( resultSet.next())  
				System.out.println(resultSet.getString(3));  

			System.out.println("List of procedures ...");
			resultSet = databaseMetaData.getProcedures(null, null,null );
			while ( resultSet.next())
				System.out.println(resultSet.getString("PROCEDURE_CAT") + " " + resultSet.getString("PROCEDURE_NAME"));
			
			connection.close();  
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}  
	}  
}  


/*
Creating views;

create view male_employees as select employee_id, name, gender from employees where gender = 'M';
select * from male_employees;

*/






