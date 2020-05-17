package in.codersclub.javatechs.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.codersclub.j2eedemo.dao.impl.ContinentDaoImpl;
import in.codersclub.j2eedemo.dao.impl.CountryDaoImpl;
import in.codersclub.javatechs.dao.ContinentDao;
import in.codersclub.javatechs.dao.CountryDao;
import in.codersclub.javatechs.dom.Continent;
import in.codersclub.javatechs.dom.Country;


@WebServlet("/countriesByContinent")
public class CountriesByContinentServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("CountriesByContinentServlet.doGet() ...");

		ContinentDao continentDao = new ContinentDaoImpl();
		List<Continent> continentList = null;
		continentList = continentDao.getAllContinents();
		
		request.setAttribute("continentList", continentList );
		
		gotoPage(request, response, "geography/countriesByContinent.jsp");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("CountriesByContintnetServlet.doPost() ...");
		
		String continentCode = request.getParameter("continentCode");
		System.out.println("continentCode = " + continentCode);
		
		ContinentDao continentDao = new ContinentDaoImpl();
		List<Continent> continentList = null;
		continentList = continentDao.getAllContinents();
		
		CountryDao countryDao = new CountryDaoImpl();
		List<Country> countryList = null;
		countryList = countryDao.getCountriesOfContinent(continentCode);
	
		String download = request.getParameter("download");
		if ( download == null )
		{
			request.setAttribute("continentList", continentList );
			request.setAttribute("countryList", countryList);
			gotoPage(request, response, "geography/countriesByContinent.jsp");
			return;
		}
		
		// download button clicked
		PrintWriter out = response.getWriter(); 

		response.setContentType("application/vnd.ms-excel"); 
		response.setHeader("Content-Disposition", "inline; filename="+ "country.xls");
	
		out.println("Code\tName\tContinent Code");
		
		for ( Country c : countryList )
		{
			out.println(c.getCode() + "\t" + c.getName() + "\t" + c.getContinentCode()); 
		}
		out.close();
		
	}
	
	public void gotoPage(HttpServletRequest request, HttpServletResponse response, String url)
	throws ServletException, IOException
	{
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request,  response);
	}
}



