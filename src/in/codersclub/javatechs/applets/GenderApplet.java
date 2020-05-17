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

public class Gender1Applet extends Applet implements ActionListener
{
	private Label lblGender;
	private Checkbox rbtnMale;
	private Checkbox rbtnFemale;
	private Button btnSubmit;
	private Label lblResult;
	
	private CheckboxGroup genderGroup;
	
	@Override
	public void init()
	{
		setLayout(new FlowLayout());

		genderGroup = new CheckboxGroup();
		
		lblGender = new Label("Gender");
		rbtnMale = new Checkbox("Male",genderGroup,true);
		rbtnFemale = new Checkbox("Female",genderGroup,true);
		btnSubmit = new Button("Submit");
		lblResult = new Label();

		add(lblGender);
		add(rbtnMale);
		add(rbtnFemale);
		add(btnSubmit);
		add(lblResult);
		
        btnSubmit.addActionListener(this);		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		Checkbox gender = genderGroup.getSelectedCheckbox();
		lblResult.setText(gender.getLabel() + " is selected");
	}
}

