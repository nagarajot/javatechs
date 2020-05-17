package in.codersclub.javatechs.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JButtonDemo extends JFrame implements ActionListener 
{ 
	private JLabel lblCountry;
	
	private JButton btnFrance, btnItaly, btnGermany, btnJapan;
	private ImageIcon imageFrance, imageItaly, imageGermany, imageJapan;
	
	public JButtonDemo() { 
		// Change to flow layout. 
		setLayout(new FlowLayout());

		// Add buttons to content pane. 
		imageFrance = new ImageIcon("d:/temp/images/France.gif"); 
		btnFrance = new JButton(imageFrance); 
		btnFrance.setActionCommand("France"); 
		btnFrance.addActionListener(this); 

		imageGermany = new ImageIcon("d:/temp/images/Germany.gif"); 
		btnGermany = new JButton(imageGermany); 
		btnGermany.setActionCommand("Germany"); 
		btnGermany.addActionListener(this); 

		imageItaly = new ImageIcon("d:/temp/images/Italy.gif"); 
		btnItaly = new JButton(imageItaly); 
		btnItaly.setActionCommand("Italy");
		btnItaly.addActionListener(this); 
		
		imageJapan = new ImageIcon("d:/temp/images/Japan.gif"); 
		btnJapan = new JButton(imageJapan); 
		btnJapan.setActionCommand("Japan"); 
		btnJapan.addActionListener(this); 
		
		// Create the label  
		lblCountry = new JLabel("Choose a Flag"); 
		
		// add the components
		add(btnFrance);
		add(btnItaly);
		add(btnGermany);
		add(btnJapan);
		add(lblCountry);

		setTitle("JButtonDemo");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
		// Handle button events. 
	public void actionPerformed(ActionEvent ae) 
	{ 
			lblCountry.setText("You selected " + ae.getActionCommand()); 
	}

	public static void main(String args[])
	{
		new JButtonDemo();
	}

}


