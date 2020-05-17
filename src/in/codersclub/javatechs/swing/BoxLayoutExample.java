package in.cdoc.swing;

import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class BoxLayoutExample extends JFrame
{
	JPanel panel;
	JButton first, second, third;
	
	public BoxLayoutExample()
	{
	    panel = new JPanel();
	    
	    first = new JButton("First ");
	    second = new JButton("Second");
	    third = new JButton("Third ");
	    
	    panel.add(first);
	    panel.add(Box.createRigidArea(new Dimension(0, 40))); 
	    panel.add(second);
	    panel.add(Box.createRigidArea(new Dimension(0, 20))); 
	    panel.add(third);
	    
	    panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
	    panel.setBorder(new EmptyBorder(new Insets(150, 200, 150, 200)));

	    
	    add(panel);
	    
	    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    pack();
	    setVisible(true);
	}
	
	public static void main(String args[])
	{
        BoxLayoutExample ble = new BoxLayoutExample();		
	}
}



