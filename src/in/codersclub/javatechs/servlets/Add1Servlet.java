package in.codersclub.javatechs.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add1")
public class Add1Servlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("AddServlet.doGet() ...");
		
		response.sendRedirect("add1.jsp");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("AddServlet.doPost() ...");
		
		String operand1 = request.getParameter("operand1");
		String operand2 = request.getParameter("operand2");
		
		int opr1 = Integer.parseInt(operand1);
		int opr2 = Integer.parseInt(operand2);
		
		int result = opr1 + opr2;
		
		response.sendRedirect("add.jsp?result="+result);
	}

	// Not used
	private void gotoPage(HttpServletRequest request, HttpServletResponse response, String url)
	throws ServletException, IOException
	{
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request,  response);
	}
}




