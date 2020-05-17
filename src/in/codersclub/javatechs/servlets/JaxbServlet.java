package in.codersclub.javatechs.servlets;

import in.codersclub.j2eedemo.dom.Country;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

@WebServlet("/jaxbCountry")
public class JaxbServlet extends HttpServlet
{
	public void service(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		System.out.println("JaxbServlet ...");
		
        Country country = new Country();
        country.setCode("IND");
        country.setName("India");
        country.setContinentCode("AS");
        country.setCapital("New Delhi");
        country.setArea(100);
        country.setPopulation(300);
        country.setIsland("N");
        country.setHarbour("Y");
        
        PrintWriter out = response.getWriter();
        
        try {
            JAXBContext context = JAXBContext.newInstance(Country.class);
            Marshaller m = context.createMarshaller();
            //for pretty-print XML in JAXB
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
 
            // Write to System.out 
             m.marshal(country, System.out);
             
            // Write to browser
            StringWriter sw = new StringWriter(); 
            m.marshal(country, sw);
            out.println(sw);
             
             
            // Write to File
//            m.marshal(country, new File(FILE_NAME));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
	}
}


