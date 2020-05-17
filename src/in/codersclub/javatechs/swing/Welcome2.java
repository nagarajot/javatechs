package in.cdoc.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Welcome2 extends JFrame 
{
	private JLabel lblName;
	private JTextField txtName;
	private JButton btnSubmit;
	private JLabel lblResult;
	
	public Welcome2()
	{
		lblName = new JLabel("Name");
		txtName = new JTextField(10);
		btnSubmit = new JButton("Submit");
		lblResult = new JLabel();

		add(lblName);
		add(txtName);
		add(btnSubmit);
		add(lblResult);
		
        btnSubmit.addActionListener(new MyWelcome());		
		
		setLayout(new FlowLayout());
	
		setTitle("Welcome2 - Using InnerClass");
		setVisible(true);
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	class MyWelcome implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
	         String s = txtName.getText();
	         String result = "Welcome " + s;
	         lblResult.setText(result);
		}
	}
	
	public static void main(String args[])
	{
		Welcome2 welcome = new Welcome2();
	}
}