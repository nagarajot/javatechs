package in.codersclub.javatechs.servlets;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.codersclub.javatechs.dao.UserDao;
import in.codersclub.javatechs.dao.impl.UserDaoImpl;
import in.codersclub.javatechs.dom.User;
import in.codersclub.javatechs.exceptions.UserNotFoundException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("LoginServlet.doGet() ...");
		
		gotoPage(request, response, "/login.jsp");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("LoginServlet.doPost() ...");
	
		HttpSession session = null;
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println("username : " + username);
		System.out.println("Password : " + password);

		User user = new User(username,password);
		
		UserDao userDao = new UserDaoImpl();
		
		try
		{
			userDao.validate(user);
			
			session = request.getSession(true);
			session.setAttribute("user", user);
			
			gotoPage(request, response,"/mainMenu.jsp");
		}
		catch(UserNotFoundException unfe)
		{
			gotoPage(request, response,"/login.jsp?message=Username/password not found ...");
		}
	}
	
	private void gotoPage(HttpServletRequest request, HttpServletResponse response, String url)
	throws ServletException, IOException
	{
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request,  response);
	}
}




