package in.codersclub.javatechs.swing;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelDemo extends JFrame {
	private JLabel lblIndia;
	
	public JLabelDemo() {
		lblIndia = new JLabel("India",JLabel.CENTER);
		add(lblIndia);

		setTitle("JLabelDemo");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new JLabelDemo();
	}
}






