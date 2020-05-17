package in.cdoc.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Welcome3 extends JFrame 
{
	private JLabel lblName;
	private JTextField txtName;
	private JButton btnSubmit;
	private JLabel lblResult;
	
	public Welcome3()
	{
		lblName = new JLabel("Name");
		txtName = new JTextField(10);
		btnSubmit = new JButton("Submit");
		lblResult = new JLabel();

		add(lblName);
		add(txtName);
		add(btnSubmit);
		add(lblResult);
		
        btnSubmit.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent ae)
    		{
    	         String s = txtName.getText();
    	         String result = "Welcome " + s;
    	         lblResult.setText(result);
    		}
        });		
		
		setLayout(new FlowLayout());
	
		setTitle("Using ananymous inner class");
		setVisible(true);
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	public static void main(String args[])
	{
		Welcome3 welcome = new Welcome3();
	}
}