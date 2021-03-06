package in.codersclub.javatechs.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/time")
public class TimeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		String t = sdf.format(date);
		
		out.println(t);
	}
}



