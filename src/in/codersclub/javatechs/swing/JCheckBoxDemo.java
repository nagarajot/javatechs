package in.codersclub.javatechs.swing;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JCheckBoxDemo extends JFrame implements ItemListener 
{ 
	private JLabel lbl;
	private JCheckBox cbC;
	private JCheckBox cbCpp;
	private JCheckBox cbJava;
	private JCheckBox cbPhp;
	
	public JCheckBoxDemo()
	{
		// set the layout. 
		setLayout(new FlowLayout());

		// create the components
		cbC = new JCheckBox("C"); 
		cbCpp = new JCheckBox("C++");
		cbJava = new JCheckBox("Java"); 
		cbPhp = new JCheckBox("PHP"); 
		lbl = new JLabel("Select languages"); 

		// add item listener
		cbC.addItemListener(this); 
		cbCpp.addItemListener(this); 
		cbJava.addItemListener(this); 
		cbPhp.addItemListener(this); 

		// add the components
		add(cbC);
		add(cbCpp);
		add(cbJava);
		add(cbPhp);
		add(lbl);
	
		setTitle("JCheckBoxDemo");
		setSize(500,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	// Handle item events for the check boxes. 
	
	public void itemStateChanged(ItemEvent ie) { 
		JCheckBox cb = (JCheckBox)ie.getItem();
		if(cb.isSelected()) 
			lbl.setText(cb.getText() + " is selected"); 
		else 
			lbl.setText(cb.getText() + " is cleared");
	}
	
	public static void main(String args[])
	{
		new JCheckBoxDemo();
	}
}


