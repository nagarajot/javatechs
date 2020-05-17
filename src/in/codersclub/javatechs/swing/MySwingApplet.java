package in.codersclub.javatechs.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;

public class MySwingApplet extends JApplet 
{ 
	JButton jbtnAlpha; 
	JButton jbtnBeta;
	JLabel jlab;

	// Initialize the applet. 
	public void init() { 
		makeGUI();
	}
	
	private void makeGUI() {
	
		setLayout(new FlowLayout());
	
		// Make two buttons. 
		jbtnAlpha = new JButton("Alpha"); 
		jbtnBeta = new JButton("Beta");
	
		// Add action listener for Alpha. 
		jbtnAlpha.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent le) { 
				jlab.setText("Alpha was pressed."); 
			}	 
		});
		
		// Add action listener for Beta. 
		jbtnBeta.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent le) { 
				jlab.setText("Beta was pressed."); 
			} 
		});

		jlab = new JLabel("Press a button.");

		// Add the components. 
		add(jbtnAlpha); 
		add(jbtnBeta);
		add(jlab);
	}
}


