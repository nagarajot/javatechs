package in.codersclub.javatechs.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.codersclub.javatechs.dao.DistrictDao;
import in.codersclub.javatechs.dao.StateDao;
import in.codersclub.javatechs.dao.impl.DistrictDaoImpl;
import in.codersclub.javatechs.dao.impl.StateDaoImpl;
import in.codersclub.javatechs.dom.District;
import in.codersclub.javatechs.dom.State;

@WebServlet("/state")
public class StateServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("StateServlet.doGet() ...");
		
		// Handle state list
		State state = null;
		List<State> stateList = null;
		
		StateDao stateDao = new StateDaoImpl();
		
		stateList = stateDao.getAllStates();
		request.setAttribute("stateList",stateList);
		
		District district = null;
		List<District> districtList = null;
		
		DistrictDao districtDao = new DistrictDaoImpl();
		districtList = districtDao.getDistrictsByState(stateList.get(0).getStateCode());
		
		request.setAttribute("districtList", districtList);
		
		
		
		
		
		gotoPage(request, response, "/india/state.jsp");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("StateServlet.doPost() ...");
		String districtCode = null;
		String stateCode = null;
		
		String todo = request.getParameter("todo");
		System.out.println("todo = " + todo);
		
		// Prepare State List
		State state = null;
		List<State> stateList = null;
		
		StateDao stateDao = new StateDaoImpl();
		
		stateList = stateDao.getAllStates();
		request.setAttribute("stateList",stateList);

		District district = null;
		List<District> districtList = null;
		
		DistrictDao districtDao = new DistrictDaoImpl();
		
		// state selected, populate districts
		if ( todo.equals("stateSelected"))
		{
			// Prepare District List
			stateCode = request.getParameter("stateCode");
			System.out.println("stateCode = " + stateCode);
			
			districtList = districtDao.getDistrictsByState(stateCode);
			request.setAttribute("districtList", districtList);
//			gotoPage(request, response, "/india/state.jsp");
			
		}
	
		// submit selected
		if ( todo.equals("submitSelected"))
		{
			// Prepare District List
			stateCode = request.getParameter("stateCode");
			System.out.println("stateCode = " + stateCode);
			
			districtList = districtDao.getDistrictsByState(stateCode);
			request.setAttribute("districtList", districtList);
			
			// search for district
			districtCode = request.getParameter("districtCode");
			System.out.println("districtCode = " + districtCode);
			
			district = districtDao.search(districtCode);
			request.setAttribute("district", district);
//			gotoPage(request, response, "/india/state.jsp?message=displayData");
		}
		gotoPage(request, response, "/india/state.jsp");

	}
	
	private void gotoPage(HttpServletRequest request, HttpServletResponse response, String url)
	throws ServletException, IOException
	{
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request,  response);
	}
}




