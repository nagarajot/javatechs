/*
     Implements ActionListener
*/
package in.codersclub.javatechs.swing;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingIncrement1 extends JFrame implements MouseListener
{
	private JButton btnClick;
	private JLabel lblCount;
	
	private int n;
	
	public SwingIncrement1()
	{
	    btnClick = new JButton("Click");  
	    lblCount = new JLabel("0");
	
	    setLayout(new FlowLayout()); 
        
	    add(btnClick);  
	    
	    add(lblCount);
	    btnClick.addMouseListener(this);
	    
	    setSize(400,500);  
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);  
	}
	
	@Override
	public void mouseClicked(MouseEvent e)
	{
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
        String s = lblCount.getText();
        n = Integer.parseInt(s);
        n++;
        lblCount.setText(""+n);
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
	}

	public static void main(String args[])
	{
        new SwingIncrement1();
	}
}


