package in.codersclub.javatechs.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.codersclub.javatechs.dao.ItemDao;
import in.codersclub.javatechs.dao.impl.ItemDaoImpl;
import in.codersclub.javatechs.dom.Item;
import in.codersclub.javatechs.dom.User;

@WebServlet("/deptStores")
public class DeptStoresServlet extends HttpServlet
{
	public void service(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("DeptStoresServlet.doGet() ...");

		HttpSession session = null;
		session = request.getSession(false);
		
		if ( session == null )
		{
			System.out.println("Here 1 ...");
			System.out.println("Redirecting to login page ...");
			gotoPage(request, response,"login.jsp");
			return;
		}
		User user = (User)session.getAttribute("user");
		if ( user == null )
		{
			System.out.println("Here 2 ...");
			System.out.println("Redirecting to login page ...");
			gotoPage(request, response,"login.jsp");
			return;
		}
		
		String option = request.getParameter("option");
		System.out.println("option = " + option);
		
		switch (option)
		{
		case "fruits":
			handleFruits(request, response);
			break;
			
		case "vegetables":
			handleVegetables(request, response);
			break;

		case "beverages":
			handleBeverages(request, response);
			break;
		}
	}
	
	public void handleFruits(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("Inside handleFruits ...");
		
		List<Item> itemList = null;
		ItemDao itemDao = new ItemDaoImpl();
		String categoryCode = request.getParameter("categoryCode");
		
		itemList = itemDao.getItemsByCategory("FR");
		
		request.setAttribute("itemList", itemList);
		gotoPage(request, response, "deptStores/fruits.jsp");
	}
	
	public void handleVegetables(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("Inside handleVegetables ...");
	}
	
	public void handleBeverages(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("Inside handleBeverages ...");
		
		List<Item> itemList = null;
		ItemDao itemDao = new ItemDaoImpl();
		
		itemList = itemDao.getItemsByCategory("BV");
		
		request.setAttribute("itemList", itemList);
		gotoPage(request, response, "deptStores/beverages.jsp");
	}
	
	private void gotoPage(HttpServletRequest request, HttpServletResponse response, String url)
	throws ServletException, IOException
	{
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request,  response);
	}
}




