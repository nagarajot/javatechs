package in.codersclub.javatechs.listeners;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppContextListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent servletContextEvent) {
    	ServletContext ctx = servletContextEvent.getServletContext();
    
    	String driver = ctx.getInitParameter("DBDRIVER");  	
    	String url = ctx.getInitParameter("DBURL");
    	String dbName = ctx.getInitParameter("DBNAME");
    	String username = ctx.getInitParameter("DBUSER");
    	String password = ctx.getInitParameter("DBPWD");
    	
    	Connection connection = null;
    	
        try 
        { 
             Class.forName(driver); 
             connection = DriverManager.getConnection(url+dbName,username,password); 
        } 
        catch(ClassNotFoundException cnfe) 
        { 
             System.out.println("JdbcUtilities.getConnection : " + cnfe); 
        } 
        catch(SQLException sqle) 
        { 
             System.out.println("JdbcUtilities.getConnection : " + sqle); 
        } 
    	
    	//create database connection from init parameters and set it to context
    	ctx.setAttribute("connObject", connection);
    	System.out.println("AppContextListener.contextInitialized() : Database connection initialized for Application.");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
    	ServletContext ctx = servletContextEvent.getServletContext();
    	Connection connection = (Connection) ctx.getAttribute("connObject");
    	try
    	{
    		connection.close();
    	}
    	catch(SQLException sqle)
    	{
    		System.out.println(sqle);
    	}
    	System.out.println("AppContextListener.contextDestroyed() : Database connection closed for Application.");
    }
}


