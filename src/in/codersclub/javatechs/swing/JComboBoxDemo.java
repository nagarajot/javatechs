package in.codersclub.javatechs.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboBoxDemo extends JFrame { 
	private JLabel jlab; 
	private JComboBox jcb;
	private String flags[] = { "India", "France", "Germany", "Italy", "Japan" };
	
	public JComboBoxDemo() { 
		// set the layout. 
		setLayout(new FlowLayout());

		// Create the components 
		jcb = new JComboBox(flags); 
		jlab = new JLabel(new ImageIcon("d:/temp/images/" + "India.gif")); 

		// add action listener 
		jcb.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent ae) { 
				String s = (String) jcb.getSelectedItem(); 
				jlab.setIcon(new ImageIcon("d:/temp/images/" + s + ".gif")); 
			} 
		});

		// add components
		add(jcb);
		add(jlab);
		
		setTitle("JComboBoxDemo");
		setSize(500,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new JComboBoxDemo();
	}
} 




