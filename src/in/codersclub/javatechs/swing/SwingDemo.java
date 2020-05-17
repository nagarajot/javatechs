package in.codersclub.javatechs.swing;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingDemo extends JFrame
{
	public SwingDemo()
	{
		setTitle("SwingDemo");
		setSize(600, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
    public static void main(String args[]) {
    	new SwingDemo();
    }
}


