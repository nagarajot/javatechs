package in.codersclub.javatechs.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

// one per web application ie one in web.xml
// configured in web.xml
public class ServletContextExampleServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException
    {
        System.out.println("ServletContextExampleServlet.doGet() ...");

        ServletContext context = getServletContext();

        String cc = context.getInitParameter("cc");
        System.out.println(cc);
    }
}

