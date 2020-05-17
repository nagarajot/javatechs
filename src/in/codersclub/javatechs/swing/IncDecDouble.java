/*
     Using annonymous innerclass
*/

package in.cdoc.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class IncDecDouble extends MouseAdapter
{
	private JFrame f;
	private JButton inc;
	private JButton dec;
	private JButton dou;
	private JLabel l;
	
	private int n;
	
	public IncDecDouble()
	{
		f = new JFrame();
	    inc =new JButton("Increment");
	    dec = new JButton("Decrement");
	    dou = new JButton("Double");
	    l = new JLabel("1");
	}
	
	public void init()
	{
	    f.setLayout(new FlowLayout()); 

	    f.add(inc);
	    f.add(dec);
	    f.add(dou);
	    
	    inc.addMouseListener(this);
	    dec.addMouseListener(this);
	    dou.addMouseListener(this);
	    
	    f.setSize(400,500);  
	    
	    f.add(l);
	    
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.setVisible(true);  
	}
	
	public void mouseClicked(MouseEvent me)
	{
		String s = l.getText();
		n = Integer.parseInt(s);
		
		if ( me.getSource() == inc )
		{ 
		     n++;
		     l.setText("" + n);
		} 

		if ( me.getSource() == dec )
		{ 
		     n--;
		     l.setText("" + n);
		} 
		
		if ( me.getSource() == dou )
		{ 
		     n = n * 2;
		     l.setText("" + n);
		} 
	}
	
	public static void main(String args[])
	{
        IncDecDouble idd = new IncDecDouble();
        idd.init();
	}
}
	
	







