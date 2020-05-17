package org.jyothyit.swing;
 
import java.util.ArrayList;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import org.jyothyit.dao.CountryDao;
import org.jyothyit.dao.impl.CountryDaoImpl;
import org.jyothyit.dom.Country;
import org.jyothyit.sampleprograms.Circle;
 
public class CountrySearch extends JFrame
{
	private String code;
	private Country country;
	private List<Country> countryList;
	
    public CountrySearch(String code)
    {
        this.code = code;
    	countryList = new ArrayList<Country>();
    	CountryDao countryDao = new CountryDaoImpl();
//    	country = countryDao.search(code);
//    	circleList.add(circle);
    	
//    	circle = new Circle(5,"Green");
//    	circleList.add(circle);
    }
    
    public void init()
    {
//    	CircleTableModel model = new CircleTableModel(circleList);
//    	JTable table = new JTable(model);

        //add the table to the frame
//        this.add(new JScrollPane(table));
         
        this.setTitle("Table Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.pack();
        this.setVisible(true);
    }
     
    public static void main(String[] args)
    {
        JTableExample1 eg = new JTableExample1();
        eg.init();
    }   
}



