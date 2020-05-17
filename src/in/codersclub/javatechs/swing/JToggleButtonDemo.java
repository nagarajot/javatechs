package in.codersclub.javatechs.swing;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

public class JToggleButtonDemo extends JFrame 
{
	
	private JLabel lbl; 
	private JToggleButton tbtn;

	public JToggleButtonDemo() {
		// Change to flow layout. 
		setLayout(new FlowLayout());

		// Create a label. 
		lbl = new JLabel("Button is off.");

		// Make a toggle button. 
		tbtn =  new JToggleButton("On/Off");

		// Add an item listener for the toggle button. 
		tbtn.addItemListener(new ItemListener() { 
			public void itemStateChanged(ItemEvent ie) { 
				if(tbtn.isSelected()) 
					lbl.setText("Button is on."); 
				else 
					lbl.setText("Button is off."); 
			}
		});

		// Add the toggle button and label to the content pane. 
		add(tbtn); 
		add(lbl);
		
		setTitle("JToggleButton demo");
		setSize(500,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[])
	{
		new JToggleButtonDemo();
	}
}


