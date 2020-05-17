/*
     Implements ActionListener
*/
package in.cdoc.lambda;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Clicker extends JFrame implements ActionListener
{
	private JButton btnClick;
	private JLabel lblCount;
	
	private int n;
	
	public Clicker()
	{
	    btnClick = new JButton("Click");  
	    lblCount = new JLabel("0");
	}
	
	public void init()
	{
	    setLayout(new FlowLayout()); 
        
	    add(btnClick);  
	    setSize(400,500);  
	    
	    add(lblCount);
	    
//	    btnClick.addActionListener(this);
	    btnClick.addActionListener((ActionEvent ae)-> {
	        String s = lblCount.getText();
	        n = Integer.parseInt(s);
	        n++;
	        lblCount.setText(""+n);
	        System.out.println(n);
	    });
	    
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);  
	}
	
	public static void main(String args[])
	{
        Clicker clicker = new Clicker();
        clicker.init();
	}
	
	public void actionPerformed(ActionEvent ae)
	{
        String s = lblCount.getText();
        n = Integer.parseInt(s);
        n++;
        lblCount.setText(""+n);
        System.out.println(n);
	}
}

// Accept the target increment value and stop incrementing afterwards

