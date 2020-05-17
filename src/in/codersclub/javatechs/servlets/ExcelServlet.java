package in.codersclub.javatechs.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/excel")
public class ExcelServlet extends HttpServlet
{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("ExcelServlet.doGet() ...");

		PrintWriter out = response.getWriter(); 

		response.setContentType("application/vnd.ms-excel"); 
		response.setHeader("Content-Disposition", "inline; filename="+ "xyz.xls");
        
		out.println("Sr No\tUSN\tName");
		
		out.println("01\tCS001\tGeorge");
		out.println("02\tCS003\tAlbert");
		out.println("03\tCS008\tRita");
		out.println("04\tCS012\tRobert");
		
		out.close();
	}
}






