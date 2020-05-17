package in.codersclub.javatechs.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.codersclub.javatechs.dao.ContinentDao;
import in.codersclub.javatechs.dao.CountryDao;
import in.codersclub.javatechs.dao.impl.ContinentDaoImpl;
import in.codersclub.javatechs.dao.impl.CountryDaoImpl;
import in.codersclub.javatechs.dom.Continent;
import in.codersclub.javatechs.dom.Country;
import in.codersclub.javatechs.exceptions.CountryNotFoundException;
import in.codersclub.javatechs.exceptions.ProcessingException;

public class GeographyServlet extends HttpServlet
{
	public void service(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("GrographyServlet.service() ...entered");
		
		String functionality = request.getParameter("functionality");
		System.out.println("functionality = " + functionality);
		
		switch ( functionality )
		{
			case "displayAllCountries" :
				displayAllCountries(request, response);
				break;
			case "noOfRows" :
				findNoOfRows(request, response);
				break;
			case "countryInsert" :
				insert(request, response);
				break;
			case "searchCountryByCode" :
				searchCountryByCode(request, response);
				break;
			case "searchCountryByCode1" :
				searchCountryByCode1(request, response);
				break;
			case "countriesByContinent" :
				doCountriesByContinent(request, response);
				break;
			case "countriesByContinent1" :
				doCountriesByContinent1(request, response);
				break;
		}
		
		
		
		
		
	
	}
	
	private void doCountriesByContinent(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("GeographyServlet.doCountriesByContinent ...entered");
		String continentCode = request.getParameter("continentCode");
		System.out.println("continentCode = " + continentCode);
		
		Country country = null;
		CountryDao countryDao = new CountryDaoImpl();
		
		Continent continent = null;
		ContinentDao continentDao = new ContinentDaoImpl();

		List<Continent> continentList = new ArrayList<Continent>();
		List<Country> countryList = new ArrayList<Country>();
		
		continentList = continentDao.getAllContinents();
		
		if ( continentCode == null )
		{
			request.setAttribute("continentList",continentList);
			gotoPage(request, response, "/geography/CountriesByContinent.jsp");
			return;
		}
		
		try
		{
				countryList = countryDao.getCountriesOfContinent(continentCode);
				request.setAttribute("continentList",continentList);
				request.setAttribute("countryList",countryList);
				gotoPage(request, response,"/geography/CountriesByContinent.jsp");
		}
		catch(CountryNotFoundException cnfe)
		{
				System.out.println("GeographyServlet.doCountriesByContinent : " + cnfe);
				gotoPage(request, response, "/Servlets and JSP/Countries/CountriesByContinent.jsp?message=noData");
		}
	}

	private void doCountriesByContinent1(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("GeographyServlet.doCountriesByContinent1 ... entered");

		String continentCode = request.getParameter("continentCode");
		System.out.println("continentCode = " + continentCode);
		
		Country country = null;
		CountryDao countryDao = new CountryDaoImpl();
		
		Continent continent = null;
		ContinentDao continentDao = new ContinentDaoImpl();

		List<Continent> continentList = new ArrayList<Continent>();
		List<Country> countryList = new ArrayList<Country>();
		
		continentList = continentDao.getAllContinents();

		if ( continentCode == null )
		{
			request.setAttribute("continentList",continentList);
			gotoPage(request, response, "/geography/CountriesByContinent1.jsp");
			return;
		}
		
		try
		{
			countryList = countryDao.getCountriesOfContinent(continentCode);
			request.setAttribute("continentList",continentList);
			request.setAttribute("countryList",countryList);
			gotoPage(request, response,"/geography/CountriesByContinent1.jsp");
		}
		catch(CountryNotFoundException cnfe)
		{
			System.out.println("GeographyServlet.doCountriesByContinent1 " + cnfe);
			gotoPage(request, response, "/geography/CountriesByContinent1.jsp?message=noData");
		}
	}
	
	private void searchCountryByCode(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("GeographyServlet.searchCountryByCode()  ... entered");
		String code = request.getParameter("code");
		System.out.println("code = " + code);
		
		Country country = null;
		CountryDao countryDao = new CountryDaoImpl();
		
		if ( code == null )
		{
			gotoPage(request, response,"/geography/SearchCountryByCode.jsp");
			return;
		}
		
		try
		{
				country = countryDao.search(code);
				request.setAttribute("country",country);
				gotoPage(request, response,"/geography/SearchCountryByCode.jsp");
		}
		catch(CountryNotFoundException cnfe)
		{
			gotoPage(request, response, "/geography/SearchCountryByCode.jsp?message=Not found ...");
		}
	}

	private void searchCountryByCode1(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("GeographyServlet.searchCountryByCode1()  ... entered");
		String code = request.getParameter("code");
		System.out.println("code = " + code);

		
		Country country = null;
		CountryDao countryDao = new CountryDaoImpl();
		
		if ( code == null )
		{
			gotoPage(request, response,"/geography/SearchCountryByCode1.jsp");
			return;
		}
		
		try
		{
				country = countryDao.search(code);
				request.setAttribute("country",country);
				gotoPage(request, response,"/geography/SearchCountryByCode1.jsp");
		}
		catch(CountryNotFoundException cnfe)
		{
			gotoPage(request, response, "/geography/SearchCountryByCode1.jsp?message=Not found ...");
		}
	}
	
	private void findNoOfRows(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("GeographyServlet.findNoOfRows ...entered");
		
		CountryDao countryDao = new CountryDaoImpl();
//		CountryDao countryDao = new CountryDaoHibImpl();
		
		int n = countryDao.getCount();
		gotoPage(request, response,"/geography/NoOfRows.jsp?n=" + n);
	}

	
	private void displayAllCountries(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("GeographyServlet.displayAllCountries ...entered");
		List<Country> countryList = new ArrayList<Country>();
	
		// JDBC impl
		CountryDao countryDao = new CountryDaoImpl();

		// Hibernate impl
//		CountryDao countryDao = new CountryDaoHibImpl();
		
		countryList = countryDao.getAllCountries();
		request.setAttribute("countryList", countryList);
		gotoPage(request, response,"/geography/DisplayAllCountries.jsp");
	}
	
	private void doCountriesByName(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("CountryServlet.doCountriesByName ...");
		String startingChars = request.getParameter("name");
		System.out.println("startingChars = " + startingChars);
		
		List<Country> countryList = new ArrayList<Country>();
		CountryDao countryDao = new CountryDaoImpl();
//		CountryDao countryDao = new CountryDaoHibImpl();

		
		if ( startingChars != null )
		{	
			try
			{
				countryList = countryDao.getAllCountries(startingChars);
				request.setAttribute("countryList", countryList);
			}
			catch(CountryNotFoundException cnfe)
			{
				System.out.println("CountryServlet.getAllCountries(startingChars) ...");
				gotoPage(request, response,"/Servlets and JSP/Countries/CountriesByName.jsp?message=noData");
			}
		}
		gotoPage(request, response,"/Servlets and JSP/Countries/CountriesByName.jsp");
	}
	
	private void insert(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("GeographyServlet.insert() ...entered");

		String code = request.getParameter("code");
		System.out.println("code = " + code);
		
		if ( code == null )
		{
			gotoPage(request, response, "/geography/CountryInsert.jsp");
			return;
		}
		
		
//		CountryDao countryDao = new CountryDaoHibImpl();
		CountryDao countryDao = new CountryDaoImpl();
		
		Country country = null;
		
		String name = null;
		String continentCode = null;
		String capital = null;
		String area = null;
		String population = null;
		String harbour = null;
		String island = null;
		
		name = request.getParameter("name");
		continentCode = request.getParameter("continentCode");
		capital = request.getParameter("capital");
		
		area = request.getParameter("area");
		population = request.getParameter("population");
		harbour = request.getParameter("harbour");
		island = request.getParameter("island");
		
		int intArea = Integer.parseInt(area);
		int intPopulation = Integer.parseInt(population);
		
		country = new Country(code,name,continentCode,capital,intArea,intPopulation,harbour,island);

		try
		{
				countryDao.insert(country);
				gotoPage(request, response, "/geography/CountryInsert.jsp?message=Insertion success ...");
		}
		catch(ProcessingException pe)
		{
				System.out.println("GeographyServlet.insert() : " + pe);
				gotoPage(request, response, "/geography/CountryInsert.jsp?message=" + pe);
		}
	}
	
	private void gotoPage(HttpServletRequest request, HttpServletResponse response, String url)
	throws ServletException, IOException
	{
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}
}






