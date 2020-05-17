package in.cdoc.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Prime extends JFrame implements ActionListener
{
	private JLabel lblNumber;
	private JTextField txtNumber;
	private JButton btnSubmit;
	private JLabel lblResult;
	
	public Prime()
	{
        lblNumber = new JLabel("Number : ");
        txtNumber = new JTextField(4);
        btnSubmit = new JButton("Submit");
        lblResult = new JLabel();
		
        setLayout(new FlowLayout());
        
		add(lblNumber);
		add(txtNumber);
		add(btnSubmit);
		add(lblResult);
		
		btnSubmit.addActionListener(this);
		
		setTitle("Prime");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,500);
		setVisible(true);
		
	}

	public void actionPerformed(ActionEvent ae)
	{
		String s = txtNumber.getText();
		int n = Integer.parseInt(s);
		for ( int i = 2; i < n; i++ )
			if ( n % i == 0 )
			{	
				lblResult.setText("Not a prime");
		        return;
			}
		
	    lblResult.setText("Prime");
   }
	
	public static void main(String args[])
	{
		new Prime();
	}
}


