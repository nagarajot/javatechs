package in.codersclub.javatechs.swing;
 
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import org.jyothyit.dao.CountryDao;
import org.jyothyit.dao.impl.CountryDaoImpl;
import org.jyothyit.dom.Country;
import org.jyothyit.exceptions.CountryNotFoundException;
import org.jyothyit.sampleprograms.Circle;
 
public class CountriesByContinent extends JFrame 
{
	private String continentCode;
	private Country country;
	private List<Country> countryList;

	JLabel lblContinentCode;
	JTextField txtContinentCode; 
	JButton btnSubmit;

	CountryTableModel model;
	JTable table;
	
	JScrollPane jsp;

	
    public CountriesByContinent()
    {
    	lblContinentCode = new JLabel("Continent Code");
    	txtContinentCode = new JTextField(2);
    	btnSubmit = new JButton("Submit");
    	jsp = new JScrollPane();
        table = new JTable();
    }
    
    public void init()
    {

    	this.setLayout(new FlowLayout());

        this.add(lblContinentCode);
        this.add(txtContinentCode);
    	
    	this.add(btnSubmit);
    	
    	btnSubmit.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent ae)
    		{
    	    	countryList = new ArrayList<Country>();
    	    	CountryDao countryDao = new CountryDaoImpl();
    	    	try
    	    	{
    	    	    countryList = countryDao.getCountriesOfContinent(txtContinentCode.getText());
    	    	}
    	    	catch(CountryNotFoundException cnfe)
    	    	{
    	             System.out.println(cnfe);    		
    	    	}
    			
    			model = new CountryTableModel(countryList);
//    			table = new JTable(model);
    			table.setModel(model);
    			
 //   			jsp.getViewport().add(table);
    			jsp.setViewportView(table);
 //   			jsp.repaint();
                table.repaint();
    		}
    	});
    	
        //add the table to the frame
//        this.add(new JScrollPane(table));
         
        this.setTitle("Table Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.pack();
        this.setVisible(true);
    }
     
    public static void main(String[] args)
    {
        CountriesByContinent cbc = new CountriesByContinent();
        cbc.init();
    }   
}



