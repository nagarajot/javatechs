package in.cdoc.swing;

import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ProgLanguages1 extends JFrame implements ActionListener
{
	private JLabel lblProgLanguages;
	private JCheckBox cbC;
	private JCheckBox cbCpp;
	private JCheckBox cbJava;
	private JCheckBox cbPython;
	private JCheckBox cbPHP;
	
	private JButton btnSubmit;
	private JLabel lblResult;
	
	public ProgLanguages1()
	{
		lblProgLanguages = new JLabel("Prog Languages");
		cbC = new JCheckBox("C");
		cbCpp = new JCheckBox("Cpp");
		cbJava = new JCheckBox("Java");
		cbPython = new JCheckBox("Python");
		cbPHP = new JCheckBox("PHP");
		
		btnSubmit = new JButton("Submit");
		lblResult = new JLabel();

		add(lblProgLanguages);
		add(cbC);
		add(cbCpp);
		add(cbJava);
		add(cbPython);
		add(cbPHP);
		
		add(btnSubmit);
		add(lblResult);
		
        btnSubmit.addActionListener(this);		
		setLayout(new FlowLayout());
	
		setTitle("ProgLanguages1 - Implementing ActionListener");
		setVisible(true);
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String result = "";
		
		if ( cbC.isSelected() )
			result = result + " " + cbC.getText();
		
		if ( cbCpp.isSelected() )
			result = result + " " + cbCpp.getText();

		if ( cbJava.isSelected() )
			result = result + " " + cbJava.getText();

		if ( cbPython.isSelected() )
			result = result + " " + cbPython.getText();

		if ( cbPHP.isSelected() )
			result = result + " " + cbPHP.getText();

		result = result + " Checked";
		
         	lblResult.setText(result);
	}
	
	public static void main(String args[])
	{
		ProgLanguages1 progLanguages = new ProgLanguages1();
	}
}







