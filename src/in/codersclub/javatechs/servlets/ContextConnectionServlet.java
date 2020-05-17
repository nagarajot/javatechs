package in.codersclub.javatechs.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contextConnection")
public class ContextConnectionServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("ContextConnectionServlet.doGet() ...");
		
		ServletContext ctx = request.getServletContext();
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		
		String sql = "select * from employees";
		
		connection = (Connection)ctx.getAttribute("connObject");
	
		try
		{
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			
			while ( resultSet.next())
				System.out.println(resultSet.getInt("employee_id") + " " + resultSet.getString("name"));
		}
		catch(SQLException sqle)
		{
			System.out.println(sqle);
		}
	}
}




