package in.codersclub.javatechs.swing;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class JScrollPaneDemo extends JFrame {
	private JScrollPane sp;
	private JPanel panel;
	
	public JScrollPaneDemo() {
		// Add 400 buttons to a panel. 
		panel = new JPanel(); 
		panel.setLayout(new GridLayout(20, 20)); 
		int b = 0; 
		for(int i = 0; i < 20; i++) { 
			for(int j = 0; j < 20; j++) { 
				panel.add(new JButton("Button " + b)); 
				++b; 
			} 
		}

		// Create the components 
		sp = new JScrollPane(panel);

		// add the component
		add(sp, BorderLayout.CENTER);
		
		setTitle("JScrollPaneDemo");
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String args[])
	{
		new JScrollPaneDemo();
	}

}


