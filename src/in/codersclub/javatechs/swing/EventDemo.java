package in.codersclub.javatechs.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventDemo extends JFrame 
{
	private JLabel lbl;
	private JButton btnAlpha;
	private JButton btnBeta;
	
	public EventDemo() {
	    setLayout(new FlowLayout());

		btnAlpha = new JButton("Alpha"); 
		btnBeta = new JButton("Beta");
		lbl = new JLabel("Press a button.");

		btnAlpha.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent ae) { 
				lbl.setText("Alpha was pressed."); 
				} 
		});

		btnBeta.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent ae) { 
				lbl.setText("Beta was pressed."); 
				} 
		});
			
		// Add the components 
		add(lbl);
		add(btnAlpha); 
		add(btnBeta);

		setTitle("Event demo");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String args[]) { 
		new EventDemo();
	}
}




