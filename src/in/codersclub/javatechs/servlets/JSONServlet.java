package in.codersclub.javatechs.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import in.codersclub.javatechs.dom.Country;

@WebServlet("/jsonCountry")
public class JSONServlet extends HttpServlet
{
	public void service(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("JSONServlet ...");
		
		PrintWriter out = response.getWriter();
		
	 	Country country = new Country("AFG","Afganistan","AS","Kabul",652,23,"N","N");
 
	 	Gson gson = new Gson();
	 	
	 	String jsonStr = gson.toJson(country);
        
	 	out.println(jsonStr);
	 	System.out.println(jsonStr);
	}
}


