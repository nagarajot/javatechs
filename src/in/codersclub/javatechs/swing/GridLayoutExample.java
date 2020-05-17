package in.cdoc.swing;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayoutExample extends JFrame
{
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
    JPanel panel;
	
    public GridLayoutExample()
    {
    	
    	panel = new JPanel();
    	panel.setLayout(new GridLayout(2,4,5,5));
    
    	b1 = new JButton("1");
    	b2 = new JButton("2");
    	b3 = new JButton("3");
    	b4 = new JButton("4");
    	b5 = new JButton("5");
    	b6 = new JButton("6");
    	b7 = new JButton("7");
    	b8 = new JButton("8");
    	
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        
        add(panel);
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
    }
    
    public static void main(String args[])
    {
    	GridLayoutExample gle = new GridLayoutExample();
    }
}


