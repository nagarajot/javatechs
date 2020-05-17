package in.cdoc.applets;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;

public class ProgrammingLanguagesApplet extends Applet implements ActionListener
{
	private Label lblGender;
	private Checkbox cbC;
	private Checkbox cbCpp;
	private Checkbox cbJava;
	private Checkbox cbPython;
	private Checkbox cbPHP;
	
	private Button btnSubmit;
	private Label lblResult;
	
	private ButtonGroup buttonGroup;
	
	@Override
	public void init()
	{
		setLayout(new FlowLayout());

		CheckboxGroup group = new CheckboxGroup();
	
		cbC = new Checkbox("C",group,true);
		cbCpp = new Checkbox("C++",group,true);
		cbJava = new Checkbox("Java",group,true);
		cbPython = new Checkbox("Python",group,true);
		cbPHP = new Checkbox("PHP",group,true);
		
		btnSubmit = new Button("Submit");
		lblResult = new Label();

		add(lblGender);
		add(cbC);
		add(cbCpp);
		add(cbJava);
		add(cbPython);
		add(cbPHP);
		
		add(btnSubmit);
		add(lblResult);
		
        btnSubmit.addActionListener(this);		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String result = "";
		
	}
}



