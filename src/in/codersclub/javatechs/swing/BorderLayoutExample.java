package in.cdoc.swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutExample extends JFrame
{
	JPanel panel; 
	JButton north, south, center, east, west;
	
	
	public BorderLayoutExample()
	{
		panel = new JPanel();
	    panel.setLayout(new BorderLayout());
	    
	    north = new JButton("North");
	    south = new JButton("South");
	    center = new JButton("Center");
	    east = new JButton("East");
	    west = new JButton("West");
	    
	    panel.add("North", north);
	    panel.add("South", south);
	    panel.add("West", west);
	    panel.add("East", east);
	    panel.add("Center", center);
	    
        add(panel);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);     
	}
	
	public static void main(String args[])
	{
		BorderLayoutExample ble = new BorderLayoutExample();
	}
}







