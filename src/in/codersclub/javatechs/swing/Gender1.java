package in.cdoc.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Gender1 extends JFrame implements ActionListener
{
	private JLabel lblGender;
	private JRadioButton rbtnMale;
	private JRadioButton rbtnFemale;
	private JButton btnSubmit;
	private JLabel lblResult;
	
	private ButtonGroup buttonGroup;
	
	public Gender1()
	{
		lblGender = new JLabel("Gender");
		rbtnMale = new JRadioButton("Male");
		rbtnFemale = new JRadioButton("Female");
		btnSubmit = new JButton("Submit");
		lblResult = new JLabel();

		buttonGroup = new ButtonGroup();
		
		buttonGroup.add(rbtnMale);
		buttonGroup.add(rbtnFemale);
		
		add(lblGender);
		add(rbtnMale);
		add(rbtnFemale);
		add(btnSubmit);
		add(lblResult);
		
        btnSubmit.addActionListener(this);		
		
		
		setLayout(new FlowLayout());
	
		setTitle("Gender1 - Implementing ActionListener");
		setVisible(true);
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String result = "";
		
		if ( rbtnMale.isSelected() )
			result = rbtnMale.getText();
		else  if ( rbtnFemale.isSelected() )
			result = rbtnFemale.getText();

		result = result + " Checked";
		
         lblResult.setText(result);
	}
	
	public static void main(String args[])
	{
		Gender1 gender = new Gender1();
	}
}

