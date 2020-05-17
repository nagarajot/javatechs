package in.cdoc.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Number1 extends JFrame implements ActionListener
{
	private JLabel lblNumber;
	private JTextField txtNumber;
	private JButton btnSubmit;
	private JLabel lblResult;
	
	public Number1()
	{
		setLayout(new FlowLayout());
		
		lblNumber = new JLabel("Number : ");
		txtNumber =new JTextField(5);
		btnSubmit = new JButton("Submit");
		lblResult = new JLabel("");
		
		add(lblNumber);
		add(txtNumber);
		add(btnSubmit);
		add(lblResult);
		
		btnSubmit.addActionListener(this);
		
		setTitle("Word1 - implementing interface");
		setSize(400,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
    @Override	
	public void actionPerformed(ActionEvent ae)
	{
		String s = txtNumber.getText();
		int n = Integer.parseInt(s);
		
		switch (n)
		{
		case 0 :
			lblResult.setText("Zero");
			break;
		case 1 :
			lblResult.setText("One");
			break;
		case 2 :
			lblResult.setText("Two");
			break;
		case 3 :
			lblResult.setText("Three");
			break;
		case 4 :
			lblResult.setText("Four");
			break;
		case 5 :
			lblResult.setText("Five");
			break;
		case 6 :
			lblResult.setText("Six");
			break;
			
		case 7 :
			lblResult.setText("Seven");
			break;
		case 8 :
			lblResult.setText("Eight");
			break;
		case 9 :
			lblResult.setText("Nine");
			break;
		}
	}

	public static void main(String args[])
	{
		Word1 word1 = new Word1();
	}
}











