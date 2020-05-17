package in.codersclub.javatechs.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.codersclub.javatechs.dao.CountryDao;
import in.codersclub.javatechs.dao.impl.CountryDaoImpl;
import in.codersclub.javatechs.dom.Country;

@WebServlet("/displayAllCountries")
public class DisplayAllCountriesServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		CountryDao countryDao = new CountryDaoImpl();
		List<Country> countryList = null;
		
		countryList = countryDao.getAllCountries();
		request.setAttribute("countryList", countryList);
		gotoPage(request, response, "geography/displayAllCountries.jsp");
	}
	
	
	private void gotoPage(HttpServletRequest request, HttpServletResponse response, String url)
	throws ServletException, IOException
	{
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request,  response);
	}
}







