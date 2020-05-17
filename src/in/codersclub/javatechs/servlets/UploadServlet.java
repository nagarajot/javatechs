package in.codersclub.javatechs.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/fileUpload")
@MultipartConfig(location="e:\\temp",
fileSizeThreshold=512*512,
maxFileSize=512*512*5,
maxRequestSize=512*512*5*5)
public class UploadServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		System.out.println("UploadServlet.doGet() ...");
		gotoPage(request, response,"fileUpload.jsp");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		Collection<Part> parts = request.getParts();

		out.write("<h2> Total parts : "+parts.size()+"</h2>");

		for(Part part : parts) {
			part.write(part.getName());
			
			out.println("Name : " + part.getName() + "</br>");
			out.println("Content Type : " + part.getContentType() + "</br");
			out.println("Size : " + part.getSize() + "</br>");
			
			for(String header : part.getHeaderNames()) {
				out.println(header + " : "+part.getHeader(header));
			}
		}
	}

	private void gotoPage(HttpServletRequest request, HttpServletResponse response, String url)
			throws ServletException, IOException
	{
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request,  response);
	}
}



