package in.codersclub.javatechs.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("CalculatorServlet.doGet() ...");
		
		gotoPage(request, response, "calculator.jsp");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("CalculatorServlet.doPost() ...");
		
		String operand1 = request.getParameter("operand1");
		String operand2 = request.getParameter("operand2");
		String operator = request.getParameter("operator");
		
		System.out.println("operand1 = " + operand1);
		System.out.println("operand2 = " + operand2);
		System.out.println("operator = " + operator);
		
		int opr1 = Integer.parseInt(operand1);
		int opr2 = Integer.parseInt(operand2);
		
		int result = 0;
		
		switch (operator) {
			case "+" :
				result = opr1 + opr2;
				break;
				
			case "-" :
				result = opr1 - opr2;
				break;
				
			case "X" :
				result = opr1 * opr2;
				break;
				
			case "/" :
				result = opr1 / opr2;
				break;
				
			case "%" :
				result = opr1 % opr2;
				break;
		}
		
		gotoPage(request, response, "calculator.jsp?result="+result);
	}
	
	private void gotoPage(HttpServletRequest request, HttpServletResponse response, String url)
	throws ServletException, IOException
	{
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request,  response);
	}
}




