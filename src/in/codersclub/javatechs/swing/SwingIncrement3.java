/*
     Anonymous inner class
*/
package in.codersclub.javatechs.swing;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingIncrement3 extends JFrame 
{
	private JButton btnClick;
	private JLabel lblCount;
	
	private int n;
	
	public SwingIncrement3()
	{
	    btnClick = new JButton("Click");  
	    lblCount = new JLabel("0");
	
	    setLayout(new FlowLayout()); 
        
	    add(btnClick);  
	    
	    add(lblCount);
	    btnClick.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e)
			{
				String s = lblCount.getText();
				n = Integer.parseInt(s);
				n++;
				lblCount.setText(""+n);
			}	    	
	    });
	    
	    setSize(400,500);  
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);  
	}

	public static void main(String args[])
	{
        new SwingIncrement1();
	}
}


