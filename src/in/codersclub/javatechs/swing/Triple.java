/*
     Lambda Expression  
*/
package in.codersclub.javatechs.swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Triple extends JFrame 
{
	private JButton btnClick;
	private JLabel lblCount;
	private int n;
	
	public Triple()
	{
	    setLayout(new FlowLayout()); 

		btnClick = new JButton("Click");  
	    lblCount = new JLabel("1");
	    
	    btnClick.addActionListener((ae)-> {
	        String s = lblCount.getText();
	        n = Integer.parseInt(s);
	        n *= 3;
	        lblCount.setText(""+n);
	    });

	    // add components
	    add(btnClick);  
	    add(lblCount);
	    
        setTitle("Using lambda");
	    setSize(400,500);  
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);  
	}
	
	public static void main(String args[])
	{
        new Triple();
	}
}

