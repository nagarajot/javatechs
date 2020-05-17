package in.codersclub.javatechs.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.*;

// One per servlet, init parameters defined in web.xml

public class ServletConfigExampleServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException
    {
        System.out.println("ServletConfigExampleServlet.doGet() ...");

        ServletConfig config = getServletConfig();

        String ot = config.getInitParameter("ot");
        System.out.println(ot);
    }
} 


/*
 * ServletConfig is one per servlet.
 * It is configured using <init-param> tag within the <servlet> tag
*/


