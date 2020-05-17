package in.codersclub.javatechs.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readCookies")
public class ReadCookiesServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		//Reading cookies
		Cookie cookies[]=request.getCookies(); 
			
		//Displaying User name value from cookie
		CookieData cookieData = null;
		List<CookieData> cookieList = new ArrayList<CookieData>();
		
		for ( Cookie c : cookies )
		{
			cookieData = new CookieData(c.getName(), c.getValue());
			cookieList.add(cookieData);
		}
		
		request.setAttribute("cookieList", cookieList);
		gotoPage(request, response, "readCookies.jsp");
		
	}
	
	private void gotoPage(HttpServletRequest request, HttpServletResponse response, String url)
	throws ServletException, IOException
	{
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request,  response);
	}

}



