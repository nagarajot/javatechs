/*
     Lambda Expression - Using Inner class 
*/
package in.cdoc.swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClickMe2 extends JFrame 
{
	private JButton btnClick;
	private JLabel lblCount;
	private int n;
	
	public ClickMe2()
	{
	    btnClick = new JButton("Click");  
	    lblCount = new JLabel("0");
	    setLayout(new FlowLayout()); 
        
	    
	    btnClick.addActionListener((ae)-> {
	        String s = lblCount.getText();
	        n = Integer.parseInt(s);
	        n++;
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
        ClickMe2 clicker = new ClickMe2();
	}
}

