/*
      Lamdba Expression - Using anonymous inner class
 */

package in.codersclub.javatechs.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClickMe1 extends JFrame 
{
	private JButton btnClick;
	private JLabel lblCount;
	private int n;
	
	public ClickMe1()
	{
	    btnClick = new JButton("Click");  
	    lblCount = new JLabel("0");
	    setLayout(new FlowLayout()); 
        
	    add(btnClick);  
	    add(lblCount);
	    
	    btnClick.addActionListener((ActionEvent ae)-> {
	        String s = lblCount.getText();
	        n = Integer.parseInt(s);
	        n++;
	        lblCount.setText(""+n);
	        System.out.println(n);
	    });
	    
        setTitle("Using lambda");
	    setSize(400,500);  
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);  
	}
	
	public static void main(String args[])
	{
        ClickMe1 clicker = new ClickMe1();
	}
}

