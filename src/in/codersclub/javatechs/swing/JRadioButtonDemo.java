package in.codersclub.javatechs.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class JRadioButtonDemo extends JFrame implements ActionListener 
{ 
	private JLabel lbl;
	private ButtonGroup btnGroup;
	private JRadioButton rbtn1;
	private JRadioButton rbtn2;
	private JRadioButton rbtn3;
	
	public JRadioButtonDemo() {
		// set the layout. 
		setLayout(new FlowLayout());

		// create the components
		rbtn1 = new JRadioButton("A"); 
		rbtn2 = new JRadioButton("B"); 
		rbtn3 = new JRadioButton("C");
		lbl = new JLabel("Select One"); 
		
		btnGroup = new ButtonGroup(); 

		// add action listener
		rbtn1.addActionListener(this); 
		rbtn2.addActionListener(this); 
		rbtn3.addActionListener(this); 
		
		// Define a button group. 
		btnGroup.add(rbtn1); 
		btnGroup.add(rbtn2); 
		btnGroup.add(rbtn3);

		// Add the components
		add(rbtn1);
		add(rbtn2);
		add(rbtn3);
		add(lbl);
	
		setTitle("JRadioButtonDemo");
		setSize(500,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	// Handle button selection. 
	public void actionPerformed(ActionEvent ae) { 
		lbl.setText("You selected " + ae.getActionCommand()); 
	}

	public static void main(String args[])
	{
		new JRadioButtonDemo();
	}
}

