/*
     Implements ActionListener
*/
package in.codersclub.javatechs.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Increment extends JFrame implements ActionListener
{
	private JButton btnClick;
	private JLabel lblCount;
	
	private int n;
	
	public Increment()
	{
	    setLayout(new FlowLayout()); 

		btnClick = new JButton("Click");  
	    lblCount = new JLabel("0");
        
	    btnClick.addActionListener(this);

	    // add the components
	    add(btnClick);  
	    add(lblCount);
	    
	    setTitle("Increment");
	    setSize(400,500);  
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);  
	}

	public void actionPerformed(ActionEvent ae)
	{
        String s = lblCount.getText();
        n = Integer.parseInt(s);
        n++;
        lblCount.setText(""+n);
	}

	public static void main(String args[])
	{
        new Increment();
	}
	
}


