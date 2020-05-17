package in.codersclub.javatechs.swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JTextFieldDemo extends JFrame 
{ 
	private JLabel lblName;
	private JTextField txtName;
	
	public JTextFieldDemo() { 
		setLayout(new FlowLayout());
		
		lblName = new JLabel("Name");
		txtName = new JTextField(15); 
		
		// add components
		add(lblName); 
		add(txtName);
		
		setTitle("JTextFieldDemo");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new JTextFieldDemo();
	}
}



