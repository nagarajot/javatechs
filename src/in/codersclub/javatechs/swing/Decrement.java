/*
     Using innerclass
*/
package in.codersclub.javatechs.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Decrement extends JFrame 
{
	private JButton btnClick;
	private JLabel lblCount;
	
	private int n;
	
	public Decrement()
	{
	    setLayout(new FlowLayout()); 

		btnClick = new JButton("Click");  
	    lblCount = new JLabel("20");
	    
	    btnClick.addActionListener(new MyAction());

	    // add components
	    add(btnClick);  
	    add(lblCount);
	    
	    setTitle("Decrement");
	    setSize(400,500);  
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);  
	}
	
	private class MyAction implements ActionListener
	{
	    public void actionPerformed(ActionEvent ae)
	    {
            String s = lblCount.getText();
            n = Integer.parseInt(s);
            n--;
            lblCount.setText(""+n);
	    }
	}

	public static void main(String args[])
	{
        new Decrement();
	}
}
	








